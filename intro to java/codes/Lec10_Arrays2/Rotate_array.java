/*
 * You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
 Note:
Change in the input array/list itself. You don't need to return or print the elements.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.
Third line contains the value of 'D' by which the array/list needs to be rotated.

Output Format :
For each test case, print the rotated array/list in a row separated by a single space.
Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^4
0 <= N <= 10^6
0 <= D <= N
Time Limit: 1 sec
 */
package Lec10_Arrays2;

import java.util.Scanner;

public class Rotate_array {
	public static void rev(int[] arr){ // Function for reversing whole array
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    
    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        rev(arr);	//Reverse the array
        int n=arr.length;
        int k=n-d;
        int i=0,j=0;
        while(i<k/2){	 // reverse the array elements between (0, n-d)th index
            int temp=arr[i];
            arr[i]=arr[k-1-i];
            arr[k-1-i]=temp;
            i=i+1;
        }
        for(i=k;i<n-d+(d/2);i++,j++){	// reverse the array elements between (n-d, n)th index
            int temp=arr[i];
            arr[i]=arr[n-1-j];
            arr[n-1-j]=temp;
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
            int d = s.nextInt();
            rotate(input,d);
            printArray(input);
            t -= 1;
        }
    }
}
/*
Sample Input 1:
1
7
1 2 3 4 5 6 7
2
Sample Output 1:
3 4 5 6 7 1 2
Sample Input 2:
2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2
Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2
*/