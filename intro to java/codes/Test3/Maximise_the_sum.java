/*
 * Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.

Input Format :
 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces

Output Format :
Maximum sum value

Constraints :
1 <= M, N <= 10^6
 */
package Test3;

import java.util.Scanner;

public class Maximise_the_sum {
	public static long maximumSumPath(int[] input1, int[] input2) {
		long n = input1.length;
		long m = input2.length;
		int i = 0, j = 0;

		long currSuminput1 = 0, currSuminput2 = 0, maximumSum = 0;

		// Iterate while i<n and j<m
		while (i < n && j < m) {
			/*
			* If current element of input1 is smaller than input2, increment 'i'
			* and add current element currSuminput1
			*/
			if (input1[i] < input2[j]) {

				currSuminput1 += input1[i];
				i++;
			}

			/*
			* If current element of input2 is smaller than input1, increment 'j'
			* and add current element currSuminput2
			*/
			else if (input1[i] > input2[j]) {
				currSuminput2 += input2[j];
				j++;
			}

			// Otherwise, update maximumSum i.e. when input1[i] == input2[j]
			else {
				maximumSum += Math.max(currSuminput1, currSuminput2);
				maximumSum += input1[i];
				currSuminput1 = 0;
				currSuminput2 = 0;
				i++;
				j++;
			}
		}

		while (i < n) {
			currSuminput1 += input1[i];
			i++;
		}

		while (j < m) {
			currSuminput2 += input2[j];
			j++;
		}

		maximumSum += Math.max(currSuminput1, currSuminput2);
		return maximumSum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int input1[] = new int[m];
        for(int i = 0; i < m; i++) {
        	input1[i] = s.nextInt();
        }
        int n = s.nextInt();
        int input2[] = new int[n];
        for(int i = 0; i < n; i++) {
        	input2[i] = s.nextInt();
        }
        System.out.println(maximumSumPath(input1, input2));
	}
}
/*
Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15
Sample Output :
81
Explanation :
We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15. So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81
*/