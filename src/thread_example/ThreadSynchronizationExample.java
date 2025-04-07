package thread_example;

class Counter {
	int count = 0;
	synchronized void increment() { // Synchronized method

		count++;
	}
}

//Since increment() is synchronized, only one thread can modify count at a time.
public class ThreadSynchronizationExample {
	public static void main(String[] args) {
		Counter counter = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final Count: " + counter.count);
	}
}
//Without synchronization: Threads can interfere with each other, leading to incorrect results.

//With synchronization: Only one thread at a time accesses the shared resource, preventing data corruption.
