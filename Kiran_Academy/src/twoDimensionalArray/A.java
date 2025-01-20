package twoDimensionalArray;

import java.util.Scanner;

public class A {
	Scanner sc = new Scanner(System.in);
	
	public void getSum(int a[][] , int b[][] , int sum[][]) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[i].length ; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
	}
}
	
	public void getdiff(int a[][] , int b[][] , int diff[][]) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[i].length ; j++) {
				diff[i][j] = a[i][j] - b[i][j];
			}
	}
}
	
	public void acceptData(int y[][]) {
		System.out.println("Value from array : ");
		for(int i=0 ; i<y.length ; i++) {
			for(int j=0 ; j<y[i].length ; j++) {
				y[i][j]= sc.nextInt();
			}
		}
	}
	
	public void showData(int y[][]) {
		System.out.println("Display Data: ");
		for(int i=0 ; i<y.length ; i++) {
			for(int j=0 ; j<y[i].length ; j++) {
				System.out.print(y[i][j] + " ");
			}
			System.out.println();
		}
	}

}
