package javaproject;

//creating a Rectangle class which is extending the Shape class

public class Rectangle extends Shape{
	
	private int length;
    private int width;
    
    // creating a constructor for the class Rectangle with two parameters
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    //using the Shape class method 
    @Override
    public void displayArea() {
        System.out.println("Area of the Rectangle: " + calculateArea());
    }

    public double calculateArea() {
        return length * width;
    }

}
