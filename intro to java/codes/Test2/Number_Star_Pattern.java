/*
 * Print the following pattern for given number of rows.
Input format :

Line 1 : N (Total number of rows)

Sample Input :
   5

Sample Output :
1234554321
1234**4321
123****321
12******21
1********1

*/
package Test2;

import java.util.Scanner;

public class Number_Star_Pattern {
	public static void main(String[] args) {

		// Write your code here		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(j);
			}
			for(int j=0;j<2*i;j++){
				System.out.print("*");
			}
			for(int j=n-i;j>0;j--){
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}
