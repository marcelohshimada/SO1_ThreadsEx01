package controller;

public class ImprimeThread extends Thread {

	@Override
	public void run() {
		num();
	}

	private void num() {
		System.out.println("Thread ID " + getId());
	}
}
