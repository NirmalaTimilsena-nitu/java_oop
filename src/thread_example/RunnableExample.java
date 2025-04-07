package thread_example;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() 
					+ " - Count: " + i);
			try {
				Thread.sleep(10); // Pause for 1 second
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted: " + e.getMessage());
			}
		}
	}
}

public class RunnableExample {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyRunnable(), "Thread-1");
		Thread thread2 = new Thread(new MyRunnable(), "Thread-2");

		thread1.start();
		thread2.start();
	}
}
