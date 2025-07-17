# 🧪 sagarkeshavaQATest

**A Test Automation Suite for [Project001]**

Automated functional and regression testing using TestNG, Selenium WebDriver, and Data‑Driven Testing (DDT). Includes cross-browser and grid/demo suite configurations.

---

## 🚀 Features

- Organised TestNG suites for:
  - Functional, grouping, parallel, DDT, and grid-based tests
- Cross-browser execution via `crossbrowsertesting.xml`
- Integration with remote grid setups (`griddemo.xml`)
- Data‑Driven Testing through `ddt.xml`
- Reporting via TestNG’s `test-output` folder
- Sample test data under “testdata” directory

---

## 🧭 Project Structure

sagarkeshavaQATest/
├── crossbrowsertesting.xml # Suite configuration for CBT execution

├── ddt.xml # Data-driven tests

├── griddemo.xml # Grid/remote execution suite

├── grouping.xml # Test grouping suite

├── mastersuite11.xml # Master aggregated suite

├── para.xml # Parallel execution suite

├── pom.xml # Maven project file

├── src/
│ └── test/ # Test code packages

├── testdata/ # CSV/Excel/data files

├── test-output/ # Auto-generated TestNG results

└── target/ # Maven build output

## 🔧 Installation & Setup

1. Clone the repo:
   ```bash
   git clone https://github.com/sagarkeshavaQATest/Project001.git
   cd Project001
