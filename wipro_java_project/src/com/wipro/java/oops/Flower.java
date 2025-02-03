/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flower {

	/**
	 * 
	 */
	
	String name;
    String color;
    double price;
    int petals; 
	
    Flower(String name, String color, double price, int petals) {
		// TODO Auto-generated constructor stub
    	this.name = name;
        this.color = color;
        this.price = price;
        this.petals = petals;
	}
    
    public void displayFlowerInfo() {
        System.out.println("Flower Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Number of Petals: " + petals);
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flower rose = new Flower("Rose", "Red", 2.5, 32);
		rose.displayFlowerInfo();
		
		Flower sunflower = new Flower("Sunflower", "Yellow", 4, 25);
		sunflower.displayFlowerInfo();

	}

}
