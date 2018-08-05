package core;

public class Singleton_private_constructor {
	    // Constructor
	    // private Singleton_private_constructor(String color, String amount) { // Error
	    
	    public Singleton_private_constructor(String color, String amount) {
	              System.out.println("I've got " + color + " ball, and will pay $" + amount);}
	    static Singleton_private_constructor payment;
	    public static Singleton_private_constructor getBall(String color, String amount){
	        return payment = new Singleton_private_constructor(color, amount);}
	}

