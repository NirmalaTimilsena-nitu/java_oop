package datahandling;

import java.util.Scanner;

public class MultiDimenArray {
	public static void main(String[] args) {
		int a[][] = new int [10][10];
		int row, col,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows:");
		row = sc.nextInt();
		System.out.println("Enter number of columns :");
		col= sc.nextInt();
		for(i=0;i<row;i++) {
			for(j= 0;j<col;j++) {
				System.out.printf("Enter Array Element a[%d][%d] :",i,j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display 2D Array Element is : ");
		for (i= 0;i<row;i++) {
			for (j=0; j<col;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
