package lab2;
/***
 * Kornelia Buszka
 * Lab#2
 * Computer Science spring 24
 * 2/9/2024
 */

import java.util.Scanner;
import java.awt.Rectangle;
public class lab2 {
	

	public static void main(String[] args) {
		
		//Create a Scanner object to read keyboard input
		Scanner in = new Scanner(System.in);
		//Display a prompt in the console window to enter x, y coordinates, width and height of rectangle #1
		System.out.print("Enter the upper left x, y coordinates, width and height of rectangle #1: ");
		//Define a variable to hold the input value, it is String 
		String box1values = in.nextLine();
		//Conversion String box1values into Array with split blank space
		String[] box1valuesArray = box1values.split(" ");
		
		//Separation of box1valuesArray into individual variables
		int xA = Integer.parseInt(box1valuesArray[0]);
        	int yA = Integer.parseInt(box1valuesArray[1]);
        	int widthA = Integer.parseInt(box1valuesArray[2]);
        	int heightA = Integer.parseInt(box1valuesArray[3]);
        
	        //Create box1 Rectangle from individual variables xA, yA, widthA, heightA
	        Rectangle box1 = new Rectangle (xA, yA, widthA, heightA);
        
        
		//Create a Scanner object to read keyboard input
       		//in2 becasue this is new Scaner
		Scanner in2 = new Scanner(System.in);
		//Display a prompt in the console window to enter x, y coordinates, width and height of rectangle #2
		System.out.print("Enter the upper left x, y coordinates, width and height of rectangle #2: ");
		//Define a variable to hold the input value, it is String 
		String box2values = in2.nextLine();
		//Conversion String box1values into Array with split blank space
		String[] box2valuesArray = box2values.split(" ");
		
		//Separation of box1valuesArray into individual variables
		int xB = Integer.parseInt(box2valuesArray[0]);
	        int yB = Integer.parseInt(box2valuesArray[1]);
	        int widthB = Integer.parseInt(box2valuesArray[2]);
	        int heightB = Integer.parseInt(box2valuesArray[3]);
        
	        //Create box1 Rectangle from individual variables xB, yB, widthB, heightB
	        Rectangle box2 = new Rectangle (xB, yB, widthB, heightB);
	        
	        
	        //Create a new variable box1containsbox2 (boolean) 
	        //box1.contains(xB, yB, widthB, heightB)-- Checks whether or not this Rectangle entirely contains the specified Rectangle.
	        //So we are checking whether box1 contains box2 arguments
	        boolean box1containsbox2 = box1.contains(xB, yB, widthB, heightB);
	        //Display statement about rectangle one contains rectangle two
	        System.out.println("It is " + box1containsbox2 + " that rectangle one contains rectangle two.");
	        
	        //Create a new variable box2containsbox1 (boolean) 
	        //box2.contains(xA, yA, widthA, heightA)-- Checks whether or not this Rectangle entirely contains the specified Rectangle.
	        //So we are checking whether box2 contains box1 arguments
	        boolean box2containsbox1 = box2.contains(xA, yA, widthA, heightA);
	        //Display statement about rectangle two contains rectangle one
	        System.out.println("It is " + box2containsbox1 + " that rectangle two contains rectagle one.");
        
	        //Create a new variable intersectss (boolean) 
	        //box1.intersects(box2) - Determines whether or not this Rectangle and the specified Rectangle intersect.
	        //So we are checking whether rectangles intersect
	        boolean intersectss = box1.intersects(box2);
	        //Display statement about rectangle two contains rectangle one
	        System.out.println("It is " + intersectss + " that rectangles intersect!");
        
      	}

}
