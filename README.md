# Selenium Automation Project with Examples

This README.md file provides a comprehensive guide to learning and implementing Selenium concepts using the following tools and technologies:

## Contents
1. [Java](#java)
2. [TestNG (testng.xml)](#testng)
3. [Maven (pom.xml)](#maven)
4. [Allure Report](#allure-report)
5. [Jenkins](#jenkins)
6. [GIT](#git)
7. [log4j (log4j.xml)](#log4j)
8. [Selenium](#selenium)
9. [GitHub](#github)
10. [Data-Driven Testing (Apache POI)](#ddt)
11. [Test Data - TestData.xlsx](#test-data)

---

## 1. Java
We use Java as the programming language for Selenium automation.

**Example:**
```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}
```

---

## 2. TestNG (testng.xml)
TestNG is used for test case management and execution.

**testng.xml Configuration:**
```xml
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Test Suite">
    <test name="Test">
        <classes>
            <class name="tests.ExampleTest"/>
        </classes>
    </test>
</suite>
```

**Example TestNG Test:**
```java
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest {
    @Test
    public void testExample() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        assert driver.getTitle().contains("Example");
        driver.quit();
    }
}
```

---

## 3. Maven (pom.xml)
Maven is used for managing dependencies and building the project.

**pom.xml Configuration:**
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>selenium-project</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.10.0</version>
        </dependency>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.8.0</version>
        </dependency>
        <!-- Add other dependencies here -->
    </dependencies>
</project>
```

---

## 4. Allure Report
Allure is used for generating detailed reports for test executions.

**Setup:**
1. Add Allure dependency in `pom.xml`:
   ```xml
   <dependency>
       <groupId>io.qameta.allure</groupId>
       <artifactId>allure-testng</artifactId>
       <version>2.22.0</version>
   </dependency>
   ```
2. Annotate your tests:
   ```java
   import io.qameta.allure.Description;

   public class AllureExampleTest {
       @Test
       @Description("This is an example test for Allure reporting.")
       public void testAllureReport() {
           // Test code here
       }
   }
   ```

---

## 5. Jenkins
Jenkins is used for Continuous Integration (CI) and automating builds.

**Steps to Integrate:**
1. Install Jenkins and configure it.
2. Install necessary plugins (Maven, Allure, etc.).
3. Create a new Jenkins job and configure:
    - Build: `mvn clean test`
    - Post-build: Allure Report.

---

## 6. GIT
GIT is used for version control of the project.

**Basic Commands:**
```bash
# Clone repository
git clone https://github.com/your-repo.git

# Add files to staging area
git add .

# Commit changes
git commit -m "Initial commit"

# Push to remote
git push origin main
```

---

## 7. log4j (log4j.xml)
log4j is used for logging test information.

**log4j.xml Configuration:**
```xml
<Configuration status="WARN">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
        </Console>
    </Appenders>
    <Loggers>
        <Root level="info">
            <AppenderRef ref="Console"/>
        </Root>
    </Loggers>
</Configuration>
```

**Logging Example:**
```java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingExample {
    private static final Logger logger = LogManager.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("This is an info message.");
        logger.error("This is an error message.");
    }
}
```

---

## 8. Selenium
Selenium is used for browser automation.

**Example:**
```java
WebDriver driver = new ChromeDriver();
driver.get("https://example.com");
System.out.println(driver.getTitle());
driver.quit();
```

---

## 9. GitHub
GitHub is used for hosting the repository and collaboration.

**Steps:**
1. Create a repository on GitHub.
2. Push your project to GitHub using GIT commands.
3. Collaborate with your team via Pull Requests.

---

## 10. Data-Driven Testing (Apache POI)
Apache POI is used for reading/writing Excel files for test data.

**Example:**
```java
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;

public class DataDrivenTest {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(new File("TestData.xlsx"));
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        workbook.close();
        fis.close();
    }
}
```

---

## 11. Test Data - TestData.xlsx
Create an Excel file named `TestData.xlsx` with your test data:

| Test Case ID | Input | Expected Output |
|--------------|-------|-----------------|
| TC001        | 10    | Pass            |
| TC002        | 20    | Fail            |

---

This guide provides a step-by-step approach to learning Selenium automation with real-world examples. Happy Testing!
