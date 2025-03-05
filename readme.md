# Application Automation Testing Framework with TestNG, Selenium, Appium, and Java

This is a data-driven testing framework designed to automate mobile application testing on both **iOS** and **Android** using **TestNG**, **Selenium**, **Appium**, and **Java**. The framework fetches test data from a **CSV file** and performs tests accordingly, ensuring efficient testing across multiple platforms.

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [How to Run Tests](#how-to-run-tests)
- [Test Data](#test-data)

## Introduction

This framework allows for automated testing of mobile applications on both **iOS** and **Android** devices using the **Selenium WebDriver** and **Appium**. The framework follows the **Data-Driven Testing** approach, where the test data is fetched from a **CSV file**. **TestNG** is used for managing test execution, reporting, and providing various configuration options.

**Appium** is used as the primary tool to interact with mobile applications, supporting both **native** and **hybrid apps** across multiple platforms like **Android** and **iOS**.

## Technologies Used

- **Java**: Programming language used for the framework.
- **TestNG**: Test framework used for managing test execution, reporting, and configuration.
- **Selenium WebDriver**: Automation tool used to interact with the mobile applications.
- **Appium**: Mobile automation framework used for testing both iOS and Android apps.
- **CSV Files**: Test data source to provide inputs to the tests.
- **Maven**: Dependency management and build automation tool.

## Features

- Supports testing on **iOS** and **Android** platforms.
- **Data-Driven Testing** using **CSV files** for parameterization.
- **TestNG** integration for test execution and reporting.
- Ability to run tests on both real devices and emulators/simulators.
- **Appium** integration for mobile-specific interactions.
- Detailed **test reports** after execution.

## Prerequisites

Before running the tests, ensure you have the following setup:

1. **Java 8+** installed.
2. **Maven** installed (for dependency management).
3. **TestNG** dependencies configured.
4. **Appium Server** installed and running.
5. **Android Studio** and **Xcode** (for running tests on Android and iOS respectively).
6. **Android SDK** and **iOS simulators** set up for testing.
7. **CSV file** containing test data (explained below).
8. Ensure **Appium**, **Selenium WebDriver**, and **Android/iOS drivers** are set up in your project dependencies.
