/*
 * You are given an integer array, arr, of size N and a positive integer K. Out of all subarrays of 'arr' of size K, find the sum of the subarray that has the maximum sum.
Input format:
The first line of the input contains two space-separated integers, N and K
The second line contains N space-separated integers which represent the elements of the array, arr
Output format:
The output only consists of a single integer, the sum of the subarray that has the maximum sum
Constraints:
1 <= N <= 10^6
1 <= K <= N
Time limit: 1 sec 
 */
package Course_Test_1;

import java.util.Scanner;

public class Find_Maximum_Subarray_Sum {
	public static long maxSum(int arr[], int n, int k) {
	    long res = 0;
	    for (int i = 0; i < k; i++) // sum of array elements from o to k-1
	      res += arr[i];
	    long curr_sum = res;
	    for (int i = k; i < n; i++) {
	      curr_sum += arr[i] - arr[i - k]; // add next element to current sum and subtract i-kth element
	      res = Math.max(res, curr_sum);
	    }

	    return res;
	  }

	  public static void main(String[] args) { // main Function
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int x = sc.nextInt();
	    int arr[] = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = sc.nextInt();
	    }
	    long max = maxSum(arr, n, x);
	 

	    System.out.println(max);

	  }
}
/*
Sample Input 1:
4 1
1 2 3 4
Sample Output 1:
4
Sample Input 2:
6 2
2 7 3 6 7 7 
Sample Output 2:
14
Explanation for Sample Output 2:
There are 5 subarrays of size 2 in this array. They are {2, 7}, {7, 3}, {3, 6}, {6, 7}, {7, 7}. Since the subarray {7, 7} has the maximum sum among all the subarrays, the output will be 7 + 7 = 14
*/