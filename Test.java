import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLargest {

	private Largest temp1;
	@Test
	public void test() {
		testPositive();
		testNegative();

	}
	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 20;
		for(int i = 0; i < arr.length-1;i++)
			assert arr[i]>0;
		Largest temp1 = new Largest();
		int maxValue = temp1.largest(arr);

	}
	public void testNegative() {
		int[] arr = new int[5];
		arr[0] = -3;
		arr[1] = -8;
		arr[2] = -1;
		arr[3] = -20;
		arr[4] = -13;
		for(int i = 0;i<arr.length-1;i++)
			assert arr[i] < 0;
		Largest temp2 = new Largest();
		int minValue = temp2.largest(arr);
	}
}
