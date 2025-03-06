package datahandling;

import java.util.Scanner;

//Write a program to read n number of values in an array and
//display in reverse order
public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array limit: ");
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.printf("Element of a[%d]:", i);
			// %d is represent the index of an array
			a[i] = sc.nextInt();
		}
		System.out.println("Display reverse order of an array element");
		for (int j = num - 1; j >= 0; j--) {
			System.out.println(a[j]);
		}
	}
}
