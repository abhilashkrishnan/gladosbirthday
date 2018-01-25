# GLADO'S BIRTHDAY
GLADO'S BIRTHDAY PROGRAMMING CHALLENGE

## The Problem

It is Glados’ 9th birthday and there are 26 children (including Glados) at her birthday party to celebrate. At the end of the party there is 1 piece of birthday cake remaining. To decide which child gets to eat the cake they play a game.

All of the children line-up in order from shortest to tallest, then they form a circle with the tallest standing next to the shortest. Starting with the shortest child they count 9 places (because it is Glados’ 9th birthday) then that child (the 9th shortest) is out. They then continue around the circle and count another 9 places, and so on, until there is only one child left. The last child remaining gets to eat the cake!

Since it is her birthday, Glados gets to choose where she stands in the circle. Where should Glados stand to make sure she gets the cake?

The Task

a) Write a Java program with a main(…) method that solves the above problem for Glados, writing the answer to stdout. Your code must support writing to an OutputStream, and be callable by other code. The output must appear formatted as follows (sample only):

Position     3: Winner!

b)	Modify your program to take two command line input arguments, the number of children and the age of Glados to solve the problem in general.

c)	Modify your program to output the order in which children go out in addition to writing the answer. The new output must appear formatted as follows (sample only):

Position     9: Is out.
Position    18: Is out.
Position     1: Is out.

This simple coding exercise is designed to allows you to demonstrate your coding style, thinking and design skills. Your work will be assessed for readability, code quality, structure, reusability, correctness, test case coverage, performance (time) efficiency, performance (memory) efficiency and maintainability. You may be asked to explain your work and reasoning in a technical interview.

Include JUnit test cases for the following scenarios at a minimum: (a) 5 children & age 3; (b) 26 children & age 9; and (c) 14 children & age 17.

## HOW TO BUILD THE APPLICATION

Extract the zip file to a local folder on your workstation.
Open the command prompt or console and execute the following command from the root of the extracted folder:

``mvn clean install``

## HOW TO CLEAN THE APPLICATION

Open the command prompt or console and execute the following command from the root of the extracted folder:

``mvn clean`` 

## HOW TO COMPILE THE APPLICATION

Open the command prompt or console and execute the following command from the root of the extracted folder:

``mvn compile``

## HOW TO RUN THE APPLICATION

Open the command prompt or console and execute the following command from the root of the extracted folder:

``mvn exec:java``

## HOW TO RUN THE TESTCASES

Open the command prompt or console and execute the following command from the root of the extracted folder:

``mvn test``

