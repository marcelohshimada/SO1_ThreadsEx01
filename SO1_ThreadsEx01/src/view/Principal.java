package view;

import controller.ImprimeThread;

public class Principal { // Chama as Threads

	public static void main(String[] args) {
		
		for (int i = 0 ; i < 5 ; i++) {
		
		Thread numThread = new ImprimeThread();
		numThread.start();
		}
	}
}