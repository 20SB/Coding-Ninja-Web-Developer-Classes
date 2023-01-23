/*
 * Given a Array arr, do binary search recursively to find x and its index in it.

Input Format :
Size of array
array elements in Increasing order
integer x to be found in array

Output Format :
Index of the x if found in the aaray else print -1
 */
package Lec15_Recursion2;

import java.util.Scanner;

public class Binary_Search_Using_Recursion {
	public static int BinarySearch(int input[], int si, int ei, int x) {
		if(si>ei) {
			return -1;
		}
		int mid=(si+ei)/2;
		if(input[mid] == x) {
			return mid;
		}
		else if(input[mid]>x) {
			return BinarySearch(input, si, mid-1, x);
		}
		else {
			return BinarySearch(input, mid+1, ei, x);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		int min = Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
			if(min<arr[i]) {
				min = arr[i];
			}
			else {
				System.out.println("Array Not In Increasing Order");
				return;
			}
		}
		int x=s.nextInt();
		int result= BinarySearch(arr, 0, size-1, x);
		System.out.println(result);
	}
}
/*
Sample Input 1 :
5
1 2 3 4 5
5
Sample Output 1 :
4
Sample Input 2 :
5
1 2 3 4 5
1
Sample Output 2 :
0
*/