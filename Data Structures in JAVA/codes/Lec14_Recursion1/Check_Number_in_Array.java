/*
 * Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
'true' or 'false'

Constraints :
1 <= N <= 10^3
 */
package Lec14_Recursion1;

import java.util.Scanner;

public class Check_Number_in_Array {
	// By creating new small arrays
	public static boolean checkNumber(int input[], int x) {
		if(input.length == 0){
			return false;
		}
		if (input[0] == x){
			return true;
		}
		int arr[] = new int[input.length-1];
		for(int i=1 ; i<input.length ; i++){
			arr[i-1] = input[i];
		}
		boolean result = checkNumber(arr, x);
		return result;
	}
	//without creating any other arrays, using Start Index
	//Write functions as the parameters are defined
	public static boolean checkNumber(int input[], int x, int si) {
		if(si == input.length){
			return false;
		}
		if (input[si] == x){
			return true;
		}
		boolean result = checkNumber(input, x, si+1);
		return result;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
		System.out.println(checkNumber(input, x, 0)); // this should be the statement to use 2nd function
	}
}
/*
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false
*/