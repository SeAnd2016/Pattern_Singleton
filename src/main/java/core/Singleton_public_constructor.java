package core;

public class Singleton_public_constructor {
	    // Constructor
	    public Singleton_public_constructor(String color, String amount) {
	              System.out.println("I've got " + color + " ball, and will pay $" + amount);}
	    static Singleton_public_constructor payment;
	    public static Singleton_public_constructor getBall(String color, String amount){
	        return payment = new Singleton_public_constructor(color, amount);}
	}

