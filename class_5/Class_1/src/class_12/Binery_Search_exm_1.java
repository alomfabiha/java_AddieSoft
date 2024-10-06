package class_12;

public class Binery_Search_exm_1 extends LinnerSearch_exm_1 {

	public static void main(String[] args) {
	int ass[]= {1,3,5,6,7,8,9,7,90};
	int target=9;
	
	int result=search(ass,target);
	if(result==-1) {
		System.out.println("not found");
	}
	else {System.out.println("Value is : "+result);
	
	  }
}
    
	public static int search(int arr[],int searchValue) {
		
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			System.out.println("mid  "+mid);
			
			if(searchValue>arr[mid]) {
				start=mid+1;
				System.out.println(start);
			}
			
			else if (searchValue<arr[mid]) {
				end=mid-1;
				System.out.println(end);
			}
			else {
			System.out.println("index is "+mid);
			return arr[mid];
			}
		}
		
		return -1;
		
	}
}
