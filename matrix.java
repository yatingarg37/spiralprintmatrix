package assignments;

import java.util.Scanner;

public class matrix {
	static void spiralprint(int arr[][],int n,int m) {
		int k = 0, l = 0;
		while (k < m && l < n) {
			for (int i = l; i < n; i++) {
				System.out.print(arr[k][i] + " ");
			}
			k++;
			for (int i = k; i < m; i++) {
				System.out.print(arr[i][n - 1] + " ");
			}
			n--;
			if (k < m) {
				for (int i = n - 1; i >= l; i--) {
					System.out.print(arr[m - 1][i] + " ");
				}
				m--;
			}
			if (l < n) {
				for (int i = m - 1; i >= k; i--) {
					System.out.print(arr[i][l] + " ");
				}
				l++;
			}
		}
	}

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row value");
		int n=sc.nextInt();
		System.out.println("Enter column value");
		int m=sc.nextInt();
		int arr[][] = new int[n][m];
		System.out.println("enter the Matrix Value");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		spiralprint(arr,n,m);
	}

}
