package class_24;

public class SumEven_thread extends Thread{
	
	int sum=0;
	
	public void run()
	{
		synchronized(this)
		{
			
			for(int i=0;i<=100;i+=2) {
				 {
					 //if(i%2==0) {
				sum=sum+i;
				//System.out.println(sum);
				   //  }
				 }
			}
			this.notify();
		}
	}
	


}
