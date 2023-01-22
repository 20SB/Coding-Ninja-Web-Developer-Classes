/*
 * Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.

Input format :
Integer N

Output format :
Corresponding Binary number (long)

Constraints :
0 <= N <= 10^5
 */
package Lec7_Operators_and_For_Loop;

import java.util.*;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem=0;
		long bin=0;
		for(int i=0;n!=0;i++){
			rem=n%2;
			bin+=(long)(Math.pow(10,i)*rem);
			n=n/2;
		}
		System.out.print(bin);
	}

}
/*
Sample Input 1 :
12

Sample Output 1 :
1100

Sample Input 2 :
7

11Sample Output 2 :
111
*/