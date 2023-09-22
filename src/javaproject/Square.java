package javaproject;

//creating a Square class which is extending the Shape class

public class Square extends Shape{
	
	 private int length;
	  
	 //constructor for the Square class with single parameter
	 
	    public Square(int length) {
	        this.length = length;
	      
	    }
	    
	    //using the Shape class method
	    
	    @Override
	    public void displayArea() {
	        System.out.println("Area of the Square: " + calculateArea());
	    }

	    public double calculateArea() {
	        return length * length;
	    }


}
