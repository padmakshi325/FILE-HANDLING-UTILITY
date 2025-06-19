# FILE-HANDLING-UTILITY

*COMPANY* : CODE TECH IT SOLUTIONS

*NAME* : SUSARLA PADMAKSHI

*INTERN ID* : CT04DN839

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTROR* : NEELA SANTOSH

*DESCRIPTION*:
This project, titled “Java File Handling Utility”, demonstrates the implementation of fundamental file I/O operations in Java. Developed and executed using Visual Studio Code, the utility provides a structured approach to working with external text files through standard Java libraries. The main class file, ex1.java, serves as the core logic of the utility, and it interacts with a sample text file, sample.txt, to perform real-time read and write operations.
The primary objective of the project is to explore how Java can be used to manipulate file contents programmatically—reading existing data, writing new content, and handling exceptions that may arise during file operations. The compiled version of the source file is ex1.class, which can be executed using the terminal or command prompt to validate and demonstrate its behavior.

Key Components:
ex1.java: This Java source file contains the logic to read data from sample.txt, write new content to it, or both. It likely utilizes Java’s FileReader, BufferedReader, FileWriter, PrintWriter, or Files classes to perform file I/O. Additionally, it may involve checking whether the file exists, creating it if not, and displaying the contents back to the useR.
ex1.class: This is the compiled bytecode version of the ex1.java file. Executing this file using the Java Virtual Machine (JVM) runs the defined logic and demonstrates file handling on the console.
sample.txt: A plain text file used as the target for read and write operations. The utility accesses this file to either display its contents or write new entries into it, based on the operations defined in the source code.The program interacts with a file named sample.txt, which acts as the target text file for all operations. Depending on the logic implemented in the ex1.java class, it may perform actions such as:

Reading all lines from sample.txt and displaying them on the console
Writing predefined or user-input data into the file (overwriting or appending)
Handling common file I/O exceptions using structured try-catch blocks
The compiled version of the Java program is ex1.class, which can be executed from the terminal using the standard Java command:
bash
java ex1

Functionality Overview:
Upon execution, the utility can perform multiple file handling tasks:
Reading: Open and display the contents of sample.txt using buffered reading or Files.readAllLines().
Writing: Overwrite or append new content to sample.txt, demonstrating character-based or line-based writing using FileWriter or PrintWriter.
Exception Handling: Detect and manage scenarios such as missing files, I/O access errors, and permission issues through try-catch blocks, ensuring the program remains stable during runtime.

Environment & Execution:
Language: Java (Tested with JDK 21)
IDE: Visual Studio Code
Execution Commands:
Compile: javac ex1.java
Run: java ex1
OS: Windows 10/11
Dependencies: No external libraries; uses core Java APIs only.
This utility serves as a beginner-friendly yet practical example of file management in Java, ideal for students, developers, or anyone learning Java I/O for the first time. It reflects real-world applications such as logging, configuration management, and simple data storage.The project also reinforces key Java programming concepts such as object-oriented design, exception propagation, buffered streams, and system-level file access, making it a solid foundational exercise in core Java.The project emphasizes the importance of efficient resource management by incorporating proper stream closing techniques using try-with-resources. It also highlights the practical benefits of Java’s platform independence, allowing the program to be executed across various systems without modification, further demonstrating the language’s robustness in handling real-world applications.









