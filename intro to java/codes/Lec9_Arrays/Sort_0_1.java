/*
 * You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.
Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the array/list.
Second line contains 'N' single space separated integers(all 0s and 1s) representing the elements in the array/list.

Output format :
For each test case, print the sorted array/list elements in a row separated by a single space.
Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
 */
package Lec9_Arrays;

import java.util.Scanner;

public class Sort_0_1 {
	public static void sortZeroesAndOne(int[] arr) {
        int i=0, j=arr.length-1;
        while(i<j){
            while(arr[i]==0 && i<j)i++;
            while(arr[j]==1 && i<j)j--;
            if(i<j){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
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
	public static void printArray(int[] arr) {	//Function to print Array
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){	//Main Function
    	
        int t = s.nextInt();

        while(t > 0) {
            int[] input = takeInput();
            sortZeroesAndOne(input);
            printArray(input);
            t -= 1;
        }
    }
}
/*
Sample Input 1:
1
7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
Sample Input 2:
2
8
1 0 1 1 0 1 0 1
5
0 1 0 1 0
Sample Output 2:
0 0 0 1 1 1 1 1
0 0 0 1 1 
*/