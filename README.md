# DiffBlue Cover – Exploration and Review

I use a real-world example of a `BankAccountService` to demonstrate Java in the context of Maven projects for new resources on my team. In this project, I explored how DiffBlue Cover works and fits into my experience as a developer. I focused on the following areas:

---

## Set-up

**How easy is it to navigate both the DiffBlue and IntelliJ documentation to add Cover to an existing project?**

I had no trouble setting up DiffBlue and immediately liked the presence it has within the IDE – it is obvious from looking at your code how to trigger DiffBlue and clear where the ‘homepage’ for all things Cover is.

---

## Usability

**Is the developer experience of test generation and review smooth and intuitive?**

I didn’t have any trouble locating where to instruct DiffBlue from, but did have the following comments after I created the tests the first time round:

- After running, reviewing, and accepting the tests I decided to clear away the most recent run result tab.
- In doing this, I was left with a blank DiffBlue tab, and even when reviewing the DiffBlue-created test file, couldn’t see any information.
- It struck me that users could benefit from an informative DiffBlue hub to see when and what tests were run previously, etc.

---

**As I add more functionality to my application, how easy is it to work with Cover on an ongoing, sustained development basis?**

Once I had created tests for my application, I created more functionality to see if there is a response/alert from DiffBlue in IntelliJ. As far as I could see, this didn’t happen.

It occurred to me that there must be a way of reviewing which methods have been run as part of Cover’s analysis so that a new method is flagged. I was able to see this from the log file and wondered whether this information alone is exactly what I am describing above:

```text
15:39:39.147 [DEBUG]  [Creating]    [pool-9-thread-3]   [com.diffblue.cover.r.c] Finished with MethodGroup: isOverdrawn, countOfTests: 1, countOfMethodsTested: 1 TestGenerationAccount: a[countOfRemoved=0, countOfUnchanged=0, countOfUpdated=0, countOfNew=1]
15:39:39.147 [DEBUG] [Creating] [pool-9-thread-3] [com.diffblue.cover.r.c]
Finished with MethodGroup: isOverdrawn, countOfTests: 1, countOfMethodsTested: 1
TestGenerationAccount: a[countOfRemoved=0, countOfUnchanged=0, countOfUpdated=0, countOfNew=1]
```

**After creating tests for the main class, I decided to create another function to see how DiffBlue behaves when it notices a coverage gap.**
- I was surprised that there wasn’t some kind of notifier or highlighting around the conical flask icon to signify that DiffBlue had not yet run this new code.
- I decided to run DiffBlue for that method anyway and subsequently came across the following when running class-level testing, having made no other changes:
    - Cover doesn’t change tests if they are already adequate.
    - Cover spotted that my `isOverDrawn()` method could usefully be tested within the initialization tests as an `assertFalse`.

---

## Questions

**To what extent do you provide playbooks to prospective or sold client opportunities for their given use case?**

For example, would you tell someone looking to modernize a monolith to run DiffBlue at the class level to produce a regression-catching capability, and then use it at the method level as new functionality is added?

The main driver behind this question is a more fundamental one:

> Do you try to distribute ways of working with DiffBlue, or let the community build up the patterns and playbooks based on their use-cases?

---

## What I Liked

- 
**Commit Message Suggestion**

When I am committing tests, I have to add a description – could there not be some way of integrating this so that the plugin works to automatically populate commit messages for tests created by DiffBlue?