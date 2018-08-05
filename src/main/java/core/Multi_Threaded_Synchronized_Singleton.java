package core;

class Multi_Threaded_Synchronized_Singleton {

		// Constructors
		    private Multi_Threaded_Synchronized_Singleton(String color, String amount) {
				System.out.println("I've got " + color + " ball, and will pay $" + amount + " [Thread # " +
				Thread.currentThread().getId() + "]");}
		    
		    private Multi_Threaded_Synchronized_Singleton(String color, String amount, Boolean b) {
				System.out.println("I've got " + color + " ball, and I already paid"      + " [Thread # " +
				Thread.currentThread().getId() + "]");}
		    
		    private static volatile Multi_Threaded_Synchronized_Singleton payment; // Volatile

		    // private static Multi_Threaded_Synchronized_Singleton payment; //  Not Volatile
		    
		// Synchronized
		    public static synchronized Multi_Threaded_Synchronized_Singleton getBall(String color, String amount){
		        if (payment == null) {payment = new Multi_Threaded_Synchronized_Singleton(color, amount); return payment;}
		        else {payment = new Multi_Threaded_Synchronized_Singleton(color, amount, true); return payment;}}
		}


