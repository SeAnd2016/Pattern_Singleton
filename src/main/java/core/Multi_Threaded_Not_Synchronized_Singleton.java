package core;

class Multi_Threaded_Not_Synchronized_Singleton {

		// Constructors
		    private Multi_Threaded_Not_Synchronized_Singleton(String color, String amount) {
				System.out.println("I've got " + color + " ball, and will pay $" + amount + " [Thread # " +
				Thread.currentThread().getId() + "]");}
		    private Multi_Threaded_Not_Synchronized_Singleton(String color, String amount, Boolean b) {
				System.out.println("I've got " + color + " ball, and I already paid"      + " [Thread # " +
				Thread.currentThread().getId() + "]");}
		// Not Volatile
		    private static Multi_Threaded_Not_Synchronized_Singleton payment;
		// Not Synchronized
		    public static Multi_Threaded_Not_Synchronized_Singleton getBall(String color, String amount){
		// Lazy Initialization
		        if (payment == null) {payment = new Multi_Threaded_Not_Synchronized_Singleton(color, amount); return payment;}
		        else {payment = new Multi_Threaded_Not_Synchronized_Singleton(color, amount, true); return payment;}}
		}


