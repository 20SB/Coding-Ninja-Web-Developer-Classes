/*
 * Write a program to print triangle of user defined integers sum.

Input Format :
A single integer, N

Output Format :
Required Pattern

Constraints :
0 <= N <= 50
 */
package Lec6_Patterns2;

import java.util.Scanner;

public class Sum_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			int sum=0;
			for(int j=1;j<=i;j++){
				System.out.print(j);
				if(j==i){
					System.out.print("=");
				}
				else{
					System.out.print("+");
				}
				sum+=j;
			}
			System.out.print(sum+"\n");
		}
	}

}
/*
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15

*/