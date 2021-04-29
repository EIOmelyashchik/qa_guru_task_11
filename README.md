# UI tests for [VERV](https://verv.com/)
## Technology Stack

![Java](readme_files/Icons/Java.svg)
![Gradle](readme_files/Icons/Gradle.svg)
![JUnit5](readme_files/Icons/JUnit5.svg)
![Selenide](readme_files/Icons/Selenide.svg)
![Allure_Report](readme_files/Icons/AllureReport.svg)
![Allure_TestOps](readme_files/Icons/TestOps.svg)
![Telegram](readme_files/Icons/Telegram.svg)
![Jenkins](readme_files/Icons/Jenkins.svg)
![Selenoid](readme_files/Icons/Selenoid.svg)
![Docker](readme_files/Icons/Docker.svg)


This project has written in [Java](https://go.java/) using [Selenide](https://selenide.org) framework. 
[Gradle](https://gradle.org) is used to build the project.
[JUnit 5](https://junit.org/junit5/) is used as a testing framework.
[Allure Report](http://allure.qatools.ru), [Allure TestOps](https://docs.qameta.io/allure-testops/) and 
[Telegram Bot](https://core.telegram.org/bots) are used to visualize test results.
Tests are launched from [Jenkins](). [Selenoid](https://aerokube.com/selenoid/) is used to run browsers in 
[Docker containers](https://www.docker.com/resources/what-container).


## Description
You can run tests by configuring the following parameters:

- Remote server
- Browser (Chrome, Firefox, Opera, Safari)
- Browser Version  
- Browser Size
- Standard or Mobile (iPhone X, Nexus 7, etc.) version website 
- Number of threads
  
![Parametrised build](readme_files/ParametrisedBuild.png)

## Allure reports
### Overview
![Allure reports overview](readme_files/AllureReportOverview.png)
### Test with steps, attached image, console logs and video
![Allure reports test](readme_files/AllureReportTest.png)
### Video
![Video](./readme_files/Video.gif)

## Allure TestOps
### Launches
![TestOps launches](./readme_files/TestOpsLaunches.png)
- **id #2991** - Manual launch
- **id #2982** - Automated launch

### Test Cases
![TestOps cases](./readme_files/TestOpsSuites.png)

### Dashboard
![TestOps cases](./readme_files/TestOpsDashboard.png)


## Notification in Telegram
![telegram](./readme_files/TelegramBot.png)

## Links
### Jenkins
https://jenkins.autotests.cloud/job/c05-kateAlmazova-task11/
### Allure reports
https://jenkins.autotests.cloud/job/c05-kateAlmazova-task11/allure/

