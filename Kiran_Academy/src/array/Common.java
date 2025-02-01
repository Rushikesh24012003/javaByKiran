package array;

import java.util.Scanner;

public class Common {
	
	Scanner sc = new Scanner(System.in);
	
	public void accept(int arr1[] , int arr2[]) {
		System.out.println("Enter the integer array 1 : ");
		for(int k=0 ; k<arr1.length ; k++) {
			arr1[k]= sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the integer array 2 : ");
		for(int k=0 ; k<arr2.length ; k++) {
			arr2[k]= sc.nextInt();
		}
	}
	
	
	public void displayIntArray(int arr1[] , int arr2[]) {
		System.out.println("Integer array 1 =>");
		for(int k=0 ; k<arr1.length ; k++) {
			System.out.println(arr1[k]);
		}
		
		System.out.println();
		System.out.println("Integer array 2 =>");
		for(int k=0 ; k<arr2.length ; k++) {
			System.out.println(arr2[k]);
		}
	}
	
	public void bubbleSortAsending(int arr1[] , int arr2[]) {
		for(int k=0 ; k<arr1.length ; k++) {
			for(int j=k+1 ; j<arr1.length  ; j++) {
				if(arr1[k]>arr1[j]) {
					int t =arr1[k];
					arr1[k]=arr1[j];
					arr1[j] = t;
				}
			}
		}
		
		for(int k=0 ; k<arr2.length ; k++) {
			for(int j=k+1 ; j<arr2.length  ; j++) {
				if(arr2[k]>arr2[j]) {
					int t =arr2[k];
					arr2[k]=arr2[j];
					arr2[j] = t;
				}
			}
		}
	}
	
	public void findCommon(int arr1[] , int arr2[]) {
		System.out.println();
		int i=0 , j=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] == arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			}else if(arr1[i]> arr2[j]) {
				j++;
			}else {
				i++;
			}
		}
	}

}
