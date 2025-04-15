# Maven Installation Guide for Windows

## Prerequisites

Before installing Maven, ensure you have Java installed. You already have Java installed:
```
java version "23.0.2" 2025-01-21
```

## Installation Steps

1. **Download Maven**
   - Visit the official Apache Maven website: https://maven.apache.org/download.cgi
   - Download the Binary zip archive (apache-maven-3.9.6-bin.zip)
A
2. **Extract the ZIP File**
   - Create a folder where you want to install Maven (e.g., `C:\Program Files\Apache\maven`)
   - Extract the downloaded ZIP file to this folder

3. **Set Environment Variables**
   - Right-click on "This PC" or "My Computer" and select "Properties"
   - Click on "Advanced system settings"
   - Click on "Environment Variables"
   - Under "System Variables", click "New"
   - Set Variable name: `MAVEN_HOME`
   - Set Variable value: `C:\Program Files\Apache\maven\apache-maven-3.9.6` (or wherever you extracted Maven)
   - Find the "Path" variable under "System Variables", select it and click "Edit"
   - Click "New" and add `%MAVEN_HOME%\bin`
   - Click "OK" to close all dialogs

4. **Verify Installation**
   - Open a new Command Prompt window (important: must be a new window)
   - Type `mvn -version` and press Enter
   - You should see Maven version information

## Troubleshooting

- **Command not found**: Make sure the Path environment variable is set correctly
- **Java not found**: Ensure JAVA_HOME environment variable is set to your Java installation directory
- **Permission issues**: Try running Command Prompt as Administrator

## Using Maven with Your Spring Boot Project

Once Maven is installed, you can build and run your Spring Boot application:

1. Navigate to your project directory in Command Prompt:
   ```
   cd "C:\CODING\PROGRAMMING\PROGRAMMING.OTODIDAK\ALTER\New folder\Java App"
   ```

2. Build the project:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```

This will start your Spring Boot application, and you can access it at http://localhost:8080 in your web browser.