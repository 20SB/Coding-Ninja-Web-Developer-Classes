/*
 * Given a binary number as an integer N, convert it into decimal and print.

Input format :
An integer N in the Binary Format

Output format :
Corresponding Decimal number (as integer)

Constraints :
0 <= N <= 10^9
 */
package Lec7_Operators_and_For_Loop;

import java.util.*;

public class Binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem=0,den=0;
		for(int i=0;n!=0;i++){
			rem=n%10;
			den+=Math.pow(2,i)*rem;
			n=n/10;
		}
		System.out.print(den);
	}

}
/*
Sample Input 1 :
1100

Sample Output 1 :
12

Sample Input 2 :
111
Sample Output 2 :
7

*/