package javaprogram;

import org.testng.annotations.Test;

public class prog {
@Test
public void sum() {
	int[] a = {1,2,3,4,5};
	int sum =0;
	for(int i=0; i<a.length; i++) {
		sum = sum + a[i];
	}
	System.out.println("Sum ==> "+sum);
}
@Test
public void average() {
	int[] a = {1,2,3,4,5};
	int sum =0;
	int count =0;
	for(int i=0; i<a.length; i++) {
		sum = sum + a[i];
		count++;
	}
	System.out.println("Average ==> "+ sum/count);
}
@Test
public void sumof_Even_Index() {
	int[] a = {1,2,3,4,5};
	int sum =0;
	   //intialisation start with i=0
	for(int i=0; i<a.length; i+=2) {
		sum = sum + a[i];
	}
	System.out.println("Sum ==> "+ sum);
}

@Test
public void sumof_Odd() {
	int[] a = {1,2,3,4,5,5,7};
	int sum =0;
	for(int i=0; i<a.length; i++) {
		if(a[i] % 2 !=0) {
			sum +=a[i];
		}
	}
	System.out.println("Sum ==> "+ sum);
}
@Test
public void min_value() {
	int[] a = {1,2,3,4,5};
	int min = a[0];
	for(int i=0; i<a.length; i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
  System.out.println(min);
}
@Test
public void max_value() {
	int[] a = {1,2,3,4,5};
	int max = a[0];
	for(int i=0; i<a.length; i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
  System.out.println(max);
}
@Test
public void Secmax_value() {
	int[] a = {1,2,3,4,5,5};
	int max = Integer.MIN_VALUE;
	int secmax = Integer.MIN_VALUE;

	for(int i=0; i<a.length; i++) {
		if(a[i]>max) {
			secmax=max;
			max=a[i];
		}
		else if(a[i]>secmax && a[i] != max) {
			secmax = a[i];
		}
	}
	System.out.println(max);
	System.out.println(secmax);
}
@Test
public void Secmin_value() {
	int[] a = {1,1,2,3,4,5,5};
	int max = Integer.MAX_VALUE;
	int secmin = Integer.MAX_VALUE;

	for(int i=0; i<a.length; i++) {
		if(a[i]<max) {
			secmin=max;
			max=a[i];
		}
		else if(a[i]<secmin && a[i] != max) {
			secmin = a[i];
		}
	}
	System.out.println(max);
	System.out.println(secmin);
}
@Test
public void sumof_Odd_Index() {
    int[] a = {1, 2, 3, 4, 5};
    int sum = 0;
   //intialisation start with i=1
    for (int i = 1; i < a.length; i += 2) { // odd indices: 1, 3, 5...
        sum += a[i];
    }
    System.out.println("Sum ==> " + sum);
}
@Test
public void min_value_of_Odd_Index() {
    int[] a = {1, 2, 3, 4, 5};
    int min=a[0];
    int sum = 0;
   //intialisation start with i=1
    for (int i = 1; i < a.length; i += 2) {
    	if(a[i]<min) {
    		min=a[i];
    		sum += a[i];
    	}
    	// odd indices: 1, 3, 5...
        
    }
    System.out.println("Sum ==> " + sum);
}
@Test
public void minFromEvenIndexedElements() {
    int[] arr = {12, 4, 7, 8, 6};

    int min = arr[0]; // start with first even index value
    for (int i = 0; i < arr.length; i++) {
        if (i % 2 == 0) { // even index check
            if (arr[i] < min) {
                min = arr[i];
            }
        }
    }
    System.out.println("Min value from even indexed elements: " + min);
}
@Test
public void maxFromOddIndexedElements() {
	int[] arr = {12, 4, 7, 8, 6};
	int max =arr[1];
	for (int i = 0; i < arr.length; i++) {
		if(i%2 != 0) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
	}
	System.out.println("Min value from even indexed elements: " + max);
}


}