/*
 * Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.

Input format :
Integer N

Output Format :
Square root of N (integer part only)

Constraints :
0 <= N <= 10^8
 */
package Lec7_Operators_and_For_Loop;

import java.util.*;

public class Square_Root_Integral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int res=(int)(Math.sqrt(n));
		System.out.print(res);
		
		/*	ANOTHER SIMPLE WAY CAN BE
		
		int result=0;
		while(result*result <= n) {
			result +=1;
		}
		result=result-1;
		System.out.println(result);
		
		*/
	}

}
/*
Sample Input 1 :
10

Sample Output 1 :
3

Sample Input 2 :
4

Sample Output 2 :
2
*/
