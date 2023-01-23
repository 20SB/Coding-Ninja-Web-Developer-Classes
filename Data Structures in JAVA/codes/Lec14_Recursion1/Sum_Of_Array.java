/*
 * Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces

Output Format :
Sum

Constraints :
1 <= N <= 10^3
 */
package Lec14_Recursion1;

import java.util.Scanner;

public class Sum_Of_Array {
	public static int sum(int input[]) {
		if(input.length == 1){
			return input[0];
		}
		int smallArr[] = new int[input.length-1];
		for(int i=1;i<input.length;i++){
			smallArr[i-1] = input[i];
		}
		int sInputSum = sum(smallArr);
		int result = input[0] + sInputSum;
		return result;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input));
	}
}
/*
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7    
*/