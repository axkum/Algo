package sort;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSortTest {
	
	@Test
	public void testSort() {
		SelectionSort ss = new SelectionSort();
		int[] ia = {9,8,7,6,5,4,3,2,1,0};
		int[] r = {0,1,2,3,4,5,6,7,8,9};
		
		assertTrue(Arrays.equals(r, ss.sort(ia)));
	}

}
