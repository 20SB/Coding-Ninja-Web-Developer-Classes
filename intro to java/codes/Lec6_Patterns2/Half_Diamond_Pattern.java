/*
 * Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.

Input Format :
A single integer: N

Output Format :
Required Pattern

Constraints :
0 <= N <= 50
 */
package Lec6_Patterns2;

import java.util.Scanner;

public class Half_Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print("*");
            int j;
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(j=j-2;j>0;j--){
                System.out.print(j);
            }
            if(i>0){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=0;i<n;i++){
            System.out.print("*");
            int j;
            for(j=1;j<n-i;j++){
                System.out.print(j);
            }
            for(j=j-2;j>0;j--){
                System.out.print(j);
            }
            if(i<n-1){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        if(n==0){
            System.out.print("*");
        }
	}

}
/*
Sample Input 1 :
3

Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*

Sample Input 2 :
 5

Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/