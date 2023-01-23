/*
 * Sort an array A using Merge Sort.
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

public class Merge_Sort {
	public static void merge(int[] a1, int[] a2, int[] input){
		int i=0,j=0,k=0;
		while(i< a1.length && j<a2.length){
			if(a1[i] < a2[j]){
				input[k++] = a1[i++];
			}
			else{
				input [k++] = a2[j++];
			}
		}
		while(i< a1.length){
			input[k++] = a1[i++];
		}
		while (j < a2.length) {
			input[k++] = a2[j++];
		}
	}
	
	public static void mergeSort(int[] input){
		if(input.length <=1){
			return;
		}
		int mid= input.length / 2;
		int a1[] = new int[mid];
		int a2[] = new int[input.length - mid ];
		int i=0;
		for(;i<mid;i++){
			a1[i] = input[i];
		}
		for (int j=0; i < input.length; i++,j++) {
			a2[j] = input[i];
		}
		mergeSort(a1);
		mergeSort(a2);
		merge(a1,a2,input);

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
		mergeSort(input);
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
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 
*/