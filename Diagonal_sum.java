package Minor_dia;

import java.util.Scanner;

public class Diagonal_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		{
		for( i=0; i<n; i++) {
			for( j=0;j<n;j++);{
				arr[i][j] = sc.nextInt();
			}
			int a=diasum(arr,n);
			System.out.println(a);}
		}
	}
		public static int diasum(int arr[][],int n)
		{
			int i=0,j=n-1;
			int sum=0;
			while(i<n &&j>=0)
			{
				sum+=arr[i][j];
				i++;
				j--;
			}
			return sum;
	}
}
