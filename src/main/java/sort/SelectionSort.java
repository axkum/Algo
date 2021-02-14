package sort;

import java.util.Arrays;

public class SelectionSort {
	public int[] sort(int[] ar) {
		int t = 0;
		for(int i = 0; i < ar.length - 1; i++) { //n
			for (int j = i+1; j< ar.length; j++) { //(n-1), (n-2), (n-3) ...
				if(ar[i] > ar[j]) {
					t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
			}
		}
		
		System.out.println(Arrays.toString(ar));
		return ar;
	}
}
