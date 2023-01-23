/*
 * Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
 */
package Lec15_Recursion2;

import java.util.Scanner;

public class Quick_Sort {
	public static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void quicksort(int a[], int si, int ei) {
		if (si > ei) {
			return;
		}
		int count = 0;
		for (int i = si + 1; i <= ei; i++) {
			if (a[si] > a[i]) {
				count++;
			}
		}
		int p = si + count;
		swap(a, p, si);
		int i = si, j = ei;
		while (i<j) {
			if (a[i] < a[p])
				i++;
			else if (a[j] >= a[p])
				j--;
			else{
				swap(a, i, j);
				i++;
				j--;
			}
		}
		quicksort(a, si, p - 1);
		quicksort(a, p + 1, ei);
	}

	public static void quickSort(int[] input) {
		quicksort(input, 0, input.length - 1);
	}
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input);
		printArray(input);
	}

}
/*
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7 
*/