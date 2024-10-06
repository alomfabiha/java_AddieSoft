package class_12;

import java.util.Arrays;
import java.util.Collections;


public class ArraySort_exm_1 {

	public static void main(String[] args) {
		//use Integer rapper class because of collectinons framework 
    Integer a[]= {1,6,34,5,8,9};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	Arrays.sort(a,Collections.reverseOrder());
	System.out.println(Arrays.toString(a));
	}

}
