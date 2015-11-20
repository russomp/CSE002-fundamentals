/*
Michael Russo
CSE002 - Lab 13

Rectangle Java Program:
  use non-static methods to create a rectangle
  object and compute its area

Instructions:
  Compile Program:
    javac Rectangle.java
  Run Program:
    java Rectangle
*/

// declare Rectangle class
public class Rectangle
{
	// declare global variables
	double width;
	double height;

	// store user input for width
	public void setWidth(double x)
	{
		width = x;
	}

	// store user input for height
	public void setHeight(double y)
	{
		height = y;
	}

	// compute area using width and height
	public double getArea()
	{
		return width*height;
	}

	// main mehtod
	public static void main(String[] args)
	{
		// create rectangle object
		Rectangle r1 = new Rectangle();
		// input width and height for new rectangle object
		r1.setWidth(3);
		r1.setHeight(2.5);
		// print area of rectangle
		System.out.println(r1.getArea());
	}

}