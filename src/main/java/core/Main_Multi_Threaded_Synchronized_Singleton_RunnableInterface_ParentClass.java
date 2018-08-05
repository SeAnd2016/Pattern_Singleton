package core;

public class Main_Multi_Threaded_Synchronized_Singleton_RunnableInterface_ParentClass extends Parent implements Runnable {
	
	//String ball_color;
	// Constructors
	Main_Multi_Threaded_Synchronized_Singleton_RunnableInterface_ParentClass(String color) {ball_color = color;}
	
	public void run() {Multi_Threaded_Synchronized_Singleton.getBall(ball_color, "10");}
	
	private void start() {new Thread (this).start();}
	
	public static void main(String[] args) throws InterruptedException {
		new Main_Multi_Threaded_Synchronized_Singleton_RunnableInterface_ParentClass("red    ").start();
		new Main_Multi_Threaded_Synchronized_Singleton_RunnableInterface_ParentClass("green  ").start();
		new Main_Multi_Threaded_Synchronized_Singleton_RunnableInterface_ParentClass("orange ").start();
	}
}
