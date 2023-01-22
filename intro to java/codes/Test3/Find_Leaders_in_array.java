/*
 * Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
Print all the leader elements separated by space and in the reverse order. That means whichever leader comes at last should be printed first.

Input Format :
Line 1 : No of test cases
Line 2 : Integer n, size of array
Line 3 : Array A elements (separated by space)

Output Format :
 leaders of array (separated by space)
Constraints :
1 <= n <= 10^6
 */
package Test3;

import java.util.Scanner;

public class Find_Leaders_in_array {
	public static void leaders(int[] input) {
		 if(input.length>0){
			 int max = input[input.length-1]; //mark last element as the bigger element
			//  System.out.print(max);
			 System.out.print(input[input.length-1]); //print last element as its right side has no bigger element than it.
			 for(int i=input.length-2; i>=0;i--){ // run loop from end to start
				 if(input[i]>=max){
					 System.out.print(" "+input[i]);
					 max=input[i];
				 }
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
    public static void main(String[] args){	//Main Function
    	
        int t = s.nextInt();

        while(t > 0) {
            int[] input = takeInput();
            leaders(input);
            t -= 1;
        }
    }
}
/*
Sample Input 1 :
1
6
3 12 34 2 0 -1
Sample Output 1 :
-1 0 2 34
Sample Input 2 :
1
5
13 17 5 4 6
Sample Output 2 :
6 17
*/