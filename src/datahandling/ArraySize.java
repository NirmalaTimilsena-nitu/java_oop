package datahandling;

//Write a program in to array size to be user input print it
import java.util.Scanner;

public class ArraySize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.printf("Element of a[%d] :", i);
			a[i] = sc.nextInt();
		}
		System.out.println("\nDisplay Array Elements...\n");
		for (int e : a) {
			System.out.println(e);
		}
	}

}
