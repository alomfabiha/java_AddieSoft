package thread_1;

public class Runable_thread {

	public static void main(String[] args) {
		// Creating an instance 
		Runable_thread_1 obj= new Runable_thread_1();
		
		// Creating two threads and passing the MyRunnable instance to them
		Thread thread_1=new Thread(obj,"Thread 1");
		Thread thread_2=new Thread(obj,"Thread 2");
		
		 // Starting the threads, which invokes the run method of Runable_thread_1
	    thread_1.start(); // Start thread 1
	    thread_2.start();
		
		try {
			thread_1.join();// Wait for thread 1 to finish
			thread_2.join();
		}catch(InterruptedException e) {
			// Handle the case where the main thread is interrupted while waiting
			System.out.println("main thread was interrupted....");
		}
		
		// Print a message after both threads have finished executing
		System.out.println("Both thread is finished execution...");

	}

}
