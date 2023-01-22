/*
 * Print the following pattern for the given number of rows.
Pattern for N = 4
4444444
4333334
4322234
4321234
4322234
4333334  
4444444
Input format : N (Total no. of rows)

Output format : Pattern in N lines
 */
package Course_Test_1;

import java.util.Scanner;

public class Rectangular_numbers {
	public static void print(int n) {
		//Write your code here
		for(int i=0;i<n;i++){
			for( int j = n ; j >= n-i ; j--){
				System.out.print(j);
			}
			for (int j = 0 ; j < (2*n)-2-(2*i) ; j++) {
				System.out.print(n-i);
			}
			for (int j = n-i+1 ; j <= n ; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
		for(int i=1 ; i<n ; i++){
			for(int j=n ; j>i ; j--){
				System.out.print(j);
			}
			for (int j = 1; j <= (2*i) ; j++) {
				System.out.print(i+1);
			}
			for (int j = i+2 ; j <= n ; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}

	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		print(n);
	}

}
