## 📝 TEST_PLAN.md

```markdown
# Test Plan for sagarkeshavaQATest

## 1. Introduction
This document defines the objectives, strategy, approach, and scope of testing for the **sagarkeshavaQATest** suite targeting [Application Under Test Name].

## 2. Test Objectives
- Validate end-to-end functionality of key flows.
- Ensure compatibility across browsers (Chrome, Firefox, etc.).
- Achieve data-driven validation using external inputs.
- Support parallel execution to optimize test runtime.
- Provide grid-based remote execution support.

## 3. Test Scope
- **Included**: Functional scenarios, data-driven scenarios, grouping, parallel, cross-browser, grid execution.
- **Excluded**: Performance/Load testing, mobile testing (unless extended).

## 4. Test Strategy

| Level        | Approach                                                                 |
|--------------|--------------------------------------------------------------------------|
| Functional   | TestNG classes for positive/negative flows                              |
| DDT          | Parameterized tests using CSV/Excel inputs                              |
| Cross-Browser| Using `crossbrowsertesting.xml` to drive multiple browser configurations|
| Parallel     | Execute suites in parallel threads with `para.xml`                      |
| Grid/Remote  | `griddemo.xml` config for Selenium Grid or remote cloud platforms       |
| Grouping     | Logical categorization via `grouping.xml` for selective suite runs      |

## 5. Test Suite Design
- **mastersuite11.xml**: Central suite integrating all suite types.
- **crossbrowsertesting.xml**: Runs tests across different browsers.
- **ddt.xml**: Data file-driven test suite.
- **griddemo.xml**: Executes tests on remote/grid environment.
- **grouping.xml**: Contains groups like smoke, regression, etc.
- **para.xml**: Designed for parallel execution.

## 6. Test Environment
- **Local**: ChromeDriver and GeckoDriver
- **Grid**: Selenium Grid with hub & nodes OR remote services (e.g. CBT)
- **Data**: CSV or Excel files in `testdata/`

## 7. Entry & Exit Criteria
- **Entry**: All test suites compile with Maven.
- **Exit**: 100% pass rate in smoke suite; 80%+ in regression; reported defects acknowledged.

## 8. Test Data Management
- Data files located in `testdata/`
- Structured naming (e.g. `login-data.csv`)
- Contains header row and test-specific input/output expectations.

## 9. Reporting
- TestNG reports: HTML + XML in `test-output/`
- Jenkins/Maven console logging (as part of CI)

## 10. Defect Tracking
- Record defects using [JIRA/Trello/etc.] with links to logs/screenshots.
- Attach corresponding TestNG XML or altered suite config.

## 11. Maintenance
- Update test data and XML suite files with feature changes.
- Add new tests under `src/test/java`; assign to groups.
- Remove outdated tests from suite XMLs.

---

## 👍 Glossary
- **DDT**: Data-Driven Testing
- **CBT**: CrossBrowserTesting
- **Selenium Grid**: Distributed test execution infrastructure
- **TestNG**: Testing framework used for defining and executing tests
