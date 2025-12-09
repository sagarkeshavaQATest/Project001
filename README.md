# Automated Web Testing Framework

## Project Overview

This project is a complete end-to-end **Web Automation Testing Framework** built using:

- **Selenium WebDriver**
- **Java**
- **Cucumber (BDD)**
- **TestNG**
- **Maven**

I automated major user journeys such as **Signup, Login, Product Search**, and flow validations.  
A **hybrid automation framework** was designed using Page Object Model (POM), reusable utility classes, Maven build integration, and structured test suites.

The project also includes an integrated **CI/CD pipeline using Jenkins**, enabling:

- Continuous execution  
- Scheduled nightly runs  
- Automatic ExtentReports generation  
- Screenshots on failure  
- Email notifications after every build  

---

## Project Structure

- `.settings/` – Workspace configuration  
- `Logs/` – Updated logs for debugging and monitoring  
- `src/test/` – Test scripts, step definitions, utilities, and POM classes  
- `target/` – Compiled output and framework-generated files  
- `test-output/` – TestNG reports and screenshots  
- `testdata/` – Data-driven input files (Excel/JSON)  
- `.classpath` – Eclipse classpath configuration  
- `.project` – Eclipse project configuration  
- `README.md` – Project documentation  
- `TEST_PLAN.md` – Detailed test planning documentation  
- `crossbrowsertesting.xml` – XML suite for Cross-Browser execution  
- `ddt.xml` – Suite for Data-Driven Testing  
- `griddemo.xml` – Suite for Selenium Grid execution  
- `grouping.xml` – Group-based suite execution  
- `mastersuite11.xml` – Master suite for full runs  
- `para.xml` – Suite for Parallel execution  
- `pom.xml` – Maven dependencies (Selenium, TestNG, Cucumber, ExtentReports, Mail API)

---

## Key Features

### ✔ Hybrid Automation Framework  
Built on POM + Utilities + BDD + TestNG XML suites for clean and scalable automation.

### ✔ Behavior-Driven Development (BDD)  
Readable test scenarios using Cucumber feature files.

### ✔ Cross-Browser and Parallel Execution  
Using TestNG suites like `crossbrowsertesting.xml` and `para.xml`.

### ✔ Data-Driven Testing  
Handled using Excel/JSON through `testdata/`.

### ✔ Selenium Grid Support  
For distributed and parallel execution using `griddemo.xml`.

### ✔ CI/CD Integration  
Jenkins pipeline built for continuous testing and nightly builds.

### ✔ Advanced Reporting  
- ExtentReports with:
  - Status logs  
  - Screenshots  
  - Timestamp  
  - Author / Category tags  
- TestNG default reports  
- Automatic Email Notification after build completion

---

## How to Run the Project

1. Clone the repo:
```bash
git clone https://github.com/sagarkeshavaQATest/Project001
