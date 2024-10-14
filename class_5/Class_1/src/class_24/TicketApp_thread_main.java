package class_24;

public class TicketApp_thread_main {

	public static void main(String[] args) {
		TicketApp_thread obj=new TicketApp_thread();
		obj.start();
		
		synchronized(obj)
		{
			try {
				obj.wait();
				System.out.println("Total price "+obj.totalPrice);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			
		}

	}

}
