/*
 * You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' in the right hand direction.
Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.

Output Format :
For each test case, print the value of 'K' or the index from which which the array/list has been rotated.
Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
 */
package Lec10_Arrays2;

import java.util.Scanner;

public class Check_Array_Rotation {
	public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
            else return count;
        }
        return 0;
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
            System.out.println(arrayRotateCheck(input));
            t -= 1;
        }
    }
}
