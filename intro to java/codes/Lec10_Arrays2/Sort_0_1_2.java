/*
 * You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the array/list.
Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.

Output Format :
For each test case, print the sorted array/list elements in a row separated by a single space.
Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
 */
package Lec10_Arrays2;

import java.util.Scanner;

public class Sort_0_1_2 {
	public static void sort012(int[] arr){
    	//Your code goes here
        int i=0,z=0,t=arr.length-1;
        while(i<=t){
            if(arr[i]==0){
                arr[i]=arr[z];
                arr[z]=0;
                z++;i++;
            }
            else if(arr[i]==2){
                arr[i]=arr[t];
                arr[t]=2;
                t--;
            }
            else i++;
        }
        while(z<t){
            arr[z]=1;
            z++;
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
            sort012(input);
            printArray(input);
            t -= 1;
        }
    }
}
/*
Sample Input 1:
1
7
0 1 2 0 2 0 1
Sample Output 1:
0 0 0 1 1 2 2 
Sample Input 2:
2
5
2 2 0 1 1
7
0 1 2 0 1 2 0
Sample Output 2:
0 1 1 2 2 
0 0 0 1 1 2 2
*/