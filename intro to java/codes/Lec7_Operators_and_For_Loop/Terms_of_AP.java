/*
 * Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

Input format :
Integer x

Output format :
Terms of series (separated by space)

Constraints :
1 <= x <= 1,000
 */
package Lec7_Operators_and_For_Loop;

import java.util.Scanner;

public class Terms_of_AP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int res=0;
		for(int i=1;i<=n;i++){
			res=3*i+2;
			if(res%4==0){
				n++;
			}
			else{
				System.out.print(res+" ");
			}
		}
	}

}
/*
Sample Input 1 :
10

Sample Output 1 :
5 11 14 17 23 26 29 35 38 41

Sample Input 2 :
4

Sample Output 2 :
5 11 14 17

*/