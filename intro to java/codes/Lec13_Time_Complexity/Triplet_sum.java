/*
 * You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
Note :
Given array/list can contain duplicate elements.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the first array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.
Third line contains an integer 'X'.

Output format :
For each test case, print the total number of triplets present in the array/list.
Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= X <= 10^9

Time Limit: 1 sec
 */
package Lec13_Time_Complexity;

import java.util.Arrays;
import java.util.Scanner;

public class Triplet_sum {
	public static int pairSum(int[] arr, int i, int j, int num) {
		int count=0;
			while(i<j){
				int sum=arr[i] + arr[j];
				if(sum == num){
					if(arr[i] == arr[j]){ 	//For situation like: arr[]= 6 6 6 6, pair sum=12, Total pair= 3+2+1 = (3*4)/2 = 6
						int ni = j-i;
						count += (ni*(ni+1))/2;
						return count;
					}
					else{	//For situation like: arr[]=3 3 9 9 9, pair sum=12, Total Pair = 6 (2 no of 3s and 3 no of 9s = 2*3)
						int k = i + 1, m = j - 1;
						int ci = 1, cj = 1;
						while (arr[i] == arr[k]) {
							ci++;
							k++;
						}
						while (arr[j] == arr[m]) {
							cj++;
							m--;
						}
						count += (ci * cj);
						i = k;
						j = m;
					}
				}
				else if(sum<num){
					i++;
				}
				else{
					j--;
				}
			}
			return count;
	}
	public static long tripletSum(int[] arr, int num) {
		Arrays.sort(arr);
        int n = arr.length;

        long numTriplets = 0;

        for (int i = 0; i < n; i++) {
            int pairSumFor = num - arr[i];
            long numPairs = pairSum(arr, (i + 1), (n - 1), pairSumFor);
            numTriplets += numPairs;
        }
        return numTriplets;
	}

	static Scanner s=new Scanner(System.in);
	public static int[] takeInput(){	//Function for taking input
        int size = s.nextInt();
        int[] input = new int[size];
        if (size == 0) {
            return input;
        }
        for (int i = 0; i < size; ++i) {
            input[i] = s.nextInt();
        }
        return input;
    }
    public static void main(String[] args){	//Main Function
    	
        int t = s.nextInt();

        while(t > 0) {
            int[] input = takeInput();
            int num = s.nextInt();
            System.out.println(tripletSum(input,num));
            t -= 1;
        }
    }
}
/*
Sample Input 1:
1
7
1 2 3 4 5 6 7 
12
Sample Output 1:
5
Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5


 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
*/