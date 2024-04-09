#Rectangle Comparison and Intersection
Author: Kornelia Buszka
Course: Computer Science Spring 24
Date: 2/9/2024

#Description:

This Java program prompts the user to enter the coordinates and dimensions of two rectangles. It then performs the following tasks:

#Checks for containment:

Determines whether rectangle 1 completely contains rectangle 2.
Determines whether rectangle 2 completely contains rectangle 1.
Checks for intersection:

Determines whether the two rectangles overlap in any way.
#Key Features:

Employs the java.util.Scanner class to read user input from the console.
Utilizes the java.awt.Rectangle class to create and manipulate rectangle objects.
Leverages the contains() and intersects() methods of the Rectangle class to determine containment and intersection relationships.
Compilation and Execution:

Save the code as lab2.java.

Compile using a Java compiler:
Bash
javac lab2.java


Run the compiled class:
Bash
java lab2


#Usage:

The program will prompt you to enter the upper-left x, y coordinates, width, and height of the first rectangle, separated by spaces.
Enter the same information for the second rectangle.
The program will then display statements indicating whether one rectangle contains the other, and whether the rectangles intersect.
