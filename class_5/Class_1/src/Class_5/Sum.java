package Class_5;

public class Sum {

	public static void main(String[] args) {
	
		
		int a[]  = {1,2,2,2,2,2,2,2,2,2};
		int sum=0;
		
		
		
		
		//*****************For Is loop**************
		for(int s:a) {
			sum=sum+s;
		}
		System.out.print(sum );
		
		
		//************normal for loop**************
		/*for (int i =0; i<a.length;i++)
		{
			 sum=sum+a[i];
		}
		System.out.print(sum );
*/
		
	}

}
