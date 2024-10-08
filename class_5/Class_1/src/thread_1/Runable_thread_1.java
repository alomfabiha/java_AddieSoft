package thread_1;


//Implementing the Runnable interface
public class Runable_thread_1 implements Runnable{
	public void run() {
		// The run method is the entry point for the thread
		for (int i =1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" -count: "+i);
			
			try {
				
				Thread.sleep(1000);  // Sleep to simulate time-consuming task
			}catch(InterruptedException e) {
				// If the thread is interrupted during sleep, handle the exception
				System.out.println(Thread.currentThread().getName()+" was interrupted.");
			}
		}
	}
	

}
