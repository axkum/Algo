package sort;

import java.util.Arrays;

public class BubbleSort {

	public int[] sort(int[] ia) {
		int t = 0;

		for (int i = 0; i < ia.length - 1; i++) {
			for (int j = 0; j < ((ia.length - 1) - i); j++) {
				if (ia[j] > ia[j + 1]) {
					t = ia[j];
					ia[j] = ia[j + 1];
					ia[j + 1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(ia));
		return ia;

	}

}
