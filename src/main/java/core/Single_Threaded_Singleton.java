package core;

class Single_Threaded_Singleton {

		// Constructors
		    private Single_Threaded_Singleton(String color, String amount) {
		System.out.println("I've got " + color + " ball, and will pay $" + amount + " [Thread # " +
		Thread.currentThread().getId() + "]");}
		    private Single_Threaded_Singleton(String color, String amount, Boolean b) {
		System.out.println("I've got " + color + " ball, and I already paid"      + " [Thread # " +
		Thread.currentThread().getId() + "]");}
		// Not Volatile
		    private static Single_Threaded_Singleton payment;
		// Not Synchronized
		    public static Single_Threaded_Singleton getBall(String color, String amount){
		// Lazy Initialization
		        if (payment == null) {payment = new Single_Threaded_Singleton(color, amount); return payment;}
		        else {payment = new Single_Threaded_Singleton(color, amount, true); return payment;}}
		}


