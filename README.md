# DiffBlue Cover – Exploration and Review

This project explores the use of **DiffBlue Cover** in a real-world Java application, specifically using a `BankAccountService` within a **Maven** setup. It's intended as both a learning tool for new team members and an evaluation of how Cover fits into the developer workflow when using IntelliJ.

---

## Project Context

The code in this repository demonstrates the integration of DiffBlue Cover with an existing Java project. The example centers around `BankAccountService` and serves as a reference point for team members learning about:

- Java + Maven development
- Automated test generation with AI tools
- Working with DiffBlue Cover in IntelliJ

---

## Setup Experience

### Installation & Initial Integration

**Question:** _How easy is it to navigate both DiffBlue and IntelliJ documentation to add Cover to an existing project?_

**Finding:**  
Setup was smooth and intuitive. The DiffBlue plugin integrates directly into the IntelliJ UI, and it’s obvious where and how to use it:

- Clear instructions in the documentation
- Easy identification of the Cover “homepage” inside IntelliJ
- No friction in triggering test generation

---

## Usability

### 💡 Test Generation & Review Flow

**Question:** _Is the developer experience of test generation and review smooth and intuitive?_

**Finding:**  
Test creation was simple to initiate and the UI guidance was clear. However, a few observations stood out:

- After generating and reviewing tests, clearing the DiffBlue results tab left a blank view.
- Even when reopening the test file, there was no visible summary of the generated tests.
- This highlighted a potential need for a **central DiffBlue dashboard or hub** to show:
    - Previously run tests
    - Test generation timestamps
    - Any changes introduced

### Ongoing Development Workflow

**Question:** _As I add more functionality to my application, how easy is it to work with Cover on a sustained basis?_

**Finding:**  
After modifying the application to include additional methods, I was curious whether DiffBlue would prompt new test suggestions automatically. This did **not** happen through the UI.

However, relevant information _was_ available in the logs:

```text
15:39:39.147 [DEBUG]  [Creating]    [pool-9-thread-3]   [com.diffblue.cover.r.c] Finished with MethodGroup: isOverdrawn, countOfTests: 1, countOfMethodsTested: 1 TestGenerationAccount: a[countOfRemoved=0, countOfUnchanged=0, countOfUpdated=0, countOfNew=1]
