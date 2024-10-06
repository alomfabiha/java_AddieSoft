package Class_5;

public class Array_even_odd {

	public static void main(String[] args) {
		int arr[]=new int [100];
		int arr1[]=new int[100];
		int i,j=0,k=0,sum1=0,sum2=0;
		for (i=1;i<=100;i++) {
			if(i%2==0) {
				arr[j]=i;
				sum1=sum1+i;
				j++;
			}
			else {
				arr1[k]=i;
			 sum2=sum2+i;
				k++;
			}
		}
		for (i=0;i<50;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();


		for (i=0;i<50;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Sum Of even value "+sum1);
		System.out.println();
		System.out.println("Sum of odd value "+sum2);
		System.out.println();

	}

}
