package core;

public class Main_Multi_Threaded_Not_Synchronized_Singleton extends Thread {
	
	String ball_color;
	Main_Multi_Threaded_Not_Synchronized_Singleton(String color) {ball_color = color;}
	
	public void run() {Multi_Threaded_Not_Synchronized_Singleton.getBall(ball_color, "10");}
	
	public static void main(String[] args) throws InterruptedException {
		new Main_Multi_Threaded_Not_Synchronized_Singleton("red    ").start();
		new Main_Multi_Threaded_Not_Synchronized_Singleton("green  ").start();
		new Main_Multi_Threaded_Not_Synchronized_Singleton("orange ").start();
	}
}
