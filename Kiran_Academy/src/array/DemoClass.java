package array;

public class DemoClass {
	public static void main(String[] args) {
		int arr1[] = new int[6];
		int arr2[] = new int[5];
		
		Common c = new Common();
		c.accept(arr1, arr2);
		c.displayIntArray(arr1, arr2);
		c.bubbleSortAsending(arr1, arr2);
		c.findCommon(arr1, arr2);
	}
}
