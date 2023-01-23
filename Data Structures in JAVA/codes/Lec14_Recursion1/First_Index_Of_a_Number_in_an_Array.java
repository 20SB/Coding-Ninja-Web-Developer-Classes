/*
 * Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
first index or -1

Constraints :
1 <= N <= 10^3
 */
package Lec14_Recursion1;
import java.util.Scanner;
public class First_Index_Of_a_Number_in_an_Array {
	public static int firstIndex(int input[], int x) {
		if(input.length == 0){
			return -1 *(input.length +1);
		}
		if(input[0] == x){
			return 0;
		}
		int arr[] = new int[input.length-1];
		for(int i=1;i<input.length;i++){
			arr[i-1] = input[i];
		}
		int res = firstIndex(arr, x);
		if( res == -1){
			return res;
		}
		else{
			return res+1;
		}		
	}
static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
	}
}
/*
Sample Input :
4
9 8 10 8
8
Sample Output :
1
Sample Input :
4
9 8 10 8
6
Sample Output :
-1
*/