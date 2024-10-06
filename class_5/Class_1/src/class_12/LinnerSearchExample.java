package class_12;

public class LinnerSearchExample {
public static void main (String [] args) {
	
	//array declare and initializarion
	int arr[]= {1,3,2,4,6,7,6,9};
	int tar=10;
	
	int result = Liner(arr,tar);
	
	if (result==-1) {
		System.out.println("No element found!!!");
	}
	else {
		System.out.println(result);
	}
	
   }

// method 
//static method mane ei method e eki class e instance create kora lage na, 
public static int Liner(int a[],int tar) {
	for (int i=0;i<a.length;i++) {
		if (a[i]==tar) {
			return a[i];
		}
	} 
	return -1;
	
}
}


