# DiffBlue Cover - Exploration and review

I use a real-world example of a BankAccountService to demonstrate Java in the context of Maven projects for new resources on my team. I would caveat all of my comments and/or suggestions with the fact that I don’t know exactly what’s included in the premium versions of the plugin (so I could well be describing functionality improvements that already exist).

At the end of the report, I cover some more generic positives but I wanted to make this review more low-level and experience based. In this project, which you can hopefully access in the link above, I explored how DiffBlue Cover works and fits into my experience as a developer.

## Set-up

**How easy is it to navigate both the DiffBlue and IntelliJ documentation to add Cover to an existing project?**

I had no trouble setting up DiffBlue and immediately liked the presence it has within the IDE - it is obvious from looking at your code how to trigger DiffBlue and clear where the ‘homepage’ for all things Cover is.

## Usability and performance

**Is the developer experience of test generation and review smooth and intuitive?**

I didn’t have any trouble locating where to instruct DiffBlue from but did have the following comments after I created the tests the first time round:

After running, reviewing and accepting the tests I decided to clear away the most recent run result tab. In doing this, I was left with a blank DiffBlue tab and even when reviewing the DiffBlue created test file, couldn’t see any information. It struck me that users could benefit from an informative DiffBlue hub to see when and what tests were run previously etc.

**As I add more functionality to my application, how easy is it to work with Cover on an ongoing, sustained development basis?**

Once I had created tests for my application, I had a go at creating more functionality to see if there is a response/alert from DiffBlue in IntelliJ. As far as I could see, this didn’t happen and it occurred to me that there must be a way of reviewing which methods have been run as part of Cover’s analysis so that a new method is flagged. I was able to see the above from the log file and wondered whether this information alone is exactly what I am describing above. 

```text
15:39:39.147 [DEBUG] [Creating] [pool-9-thread-3] [com.diffblue.cover.r.c] Finished with MethodGroup: isOverdrawn, countOfTests: 1, countOfMethodsTested: 1 TestGenerationAccount: a[countOfRemoved=0, countOfUnchanged=0, countOfUpdated=0, countOfNew=1]
```

After creating tests for the main class, I decided to create another function to see how DiffBlue behaves when it notices a coverage gap.

Again, I was surprised that there wasn’t some kind of notifier or highlighting around the conical flask icon to signify that DiffBlue had not yet run this new code.

I decided to run DiffBlue for that method anyway and subsequently came across the following positives when running class level testing having made no other changes.

- Cover doesn’t change tests if they are already adequate. This was again obvious from the log file that details which tests have changed.
- Cover spotted that my `isOverDrawn()` method could usefully be tested within the initialization tests as an `assertFalse`.

Having read about the approach Diffblue takes, I understood that it doesn’t have semantic understanding - it tests what your code does, not what it should do. To confirm this, I created a very simple but broken method `hasSufficientFunds()` to see what tests are created and confirmed that Diffblue makes asserts that reflect the behaviour of the faulty method.

Diffblue offers an automatic testing solution which is deterministic - a feature that GenAI cannot yet provide, hence its use in CI/CD pipelines. It would be great to understand more about how the founders/wider team view how Diffblue should be used into the future - is it the go-to for test creation in collaboration with GenAI (Cursor/Copilot) that can spot behavioural errors in code?

One last suggestion would be that it would be good to see the IntelliJ plugin support automatic or templated commit messages when Diffblue tests are generated. When creating multiple test cases, it's time-consuming to write unique messages for each one. Auto-summarizing the class and method names being tested would really help streamline the workflow.

## Summary
In addition to the points mentioned above, Diffblue Cover stands out for its speed - it generates tests quickly, even for larger classes, making it practical for use during regular development cycles. The tests it creates are well-structured and readable (I had time to review the javadocs generated after creating the tests too), following consistent patterns that make them easy to understand and maintain. It also handles edge cases thoroughly and often includes multiple test methods for a single function, covering a range of inputs. This level of detail and speed helps developers catch regressions early without slowing down their workflow.

## Questions

**To what extent do you provide playbooks to prospective or sold client opportunities for their given use case?**  
I.e. Would you tell someone looking to modernize a monolith to run DiffBlue at the class level to produce a regression catching capability and then use it at the method level as new functionality is added?

The main driver behind the first question is a more fundamental interest around whether you try to distribute ways of working with DiffBlue or let the community build up the patterns and playbooks based on their use-cases.
