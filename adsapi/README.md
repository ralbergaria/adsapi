# Miles 3.0

## Stack

### Backend

* Java 8
* Spring Boot
* Spring Data
* Spring Security
* lombok
* SQL Server

### Backend Unit tests
* Spok

### Other

* Git/Git-Flow

### Good readings

* [Spring Boot](https://spring.io/projects/spring-boot)
* [Docker with SQL Server 2017](https://docs.microsoft.com/en-us/sql/linux/quickstart-install-connect-docker?view=sql-server-linux-2017)

## Setup

1. Check if you have installed:
  * [Java](https://www.java.com/en/download/)
  * [Git](https://git-scm.com/)
  * [Docker](https://www.mongodb.org/)


  Tip: If you use a **Mac**, most of them can be easily installed using **[homebrew](http://brew.sh/)**

  Attention: use the **develop** branch!

2. Run Docker:

 - docker pull microsoft/mssql-server-linux
 - docker run -d --name sql_ads_mac -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=reallyStrongPwd123' -p 1433:1433 microsoft/mssql-server-linux

3. Install gui SQLOps:

  Use https://database.guide/how-to-install-sqlops-mac/
  execute script.sql to create database.

4. In root aplication Run ./mvnw spring-boot:run:
  * Assuming you are in *root* folder:

5. In your favorite browser, access: [http://localhost:8092/](http://localhost:8092/)


## Structure

The basic structure of the project is given in the following way:
* `jsons/` Contains some useful json files
* `src/main/` Contains all the sources code (backend)
* `src/test/` Contains all tests
* `src/main/java/` Contains Java source code
* `src/main/resources/` Contains files for settings

Some important files:
* `.bowerrc` Configurarion file for Bower: sets it's folder path
* `.editorconfig` Configuration file for Editor (sets identation, for example)
* `build.gradle` Contains all Gradlew tasks

## Unit tests' Coverage Reports

## Google Java Style Guide

All team members should use [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html) to keep the code formatting style.

To format the code you need to install [google-java-format](https://github.com/google/google-java-format), please follow the instructions below.

### IntelliJ

A google-java-format IntelliJ plugin is available from the plugin repository.

1. Open plugins window
2. Search for google-java-format
3. Click on browse repositories
4. Install the plugin
5. Restart the IDE

The plugin will not be enabled by default. 

- To enable it in the current project, go to "File→Settings...→google-java-format Settings" and check the "Enable" checkbox.
- To enable it by default in new projects, use "File→Other Settings→Default Settings...".

### Eclipse

A google-java-format Eclipse plugin can be downloaded from the releases page.

1. Download the [plugin](https://github.com/google/google-java-format/releases)
2. Copy the jar file to `dropins` folder (Mac: `Eclipse.app/Contents/Eclipse/dropins/`)
3. Restart Eclipse

The plugin adds a google-java-format formatter implementation that can be configured in: 
- Window > Preferences > Java > Code Style > Formatter > Formatter Implementation.
