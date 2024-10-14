package class_24;
//print 1 to 100 even number sum 
public class SumEven_Thread_main {

	public static void main(String[] args) {
		SumEven_thread obj=new SumEven_thread();
		obj.start();
		synchronized(obj)
		{
			try {
				obj.wait();
				System.out.println("sum "+obj.sum);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			
		}

	}

}
