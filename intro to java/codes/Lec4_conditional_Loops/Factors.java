/*
Write a program to print all the factors of a number other than 1 and the number itself.

Input Format :
A single integer, n

Output Format :
All the factors of n excluding 1 and the number itself

Constraints :
0 <= n <= 10,000
 */
package Lec4_conditional_Loops;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
	}

}
/*
Sample Input 1 :
8

Sample Output 1 :
2 4

Sample Input 2 :
11

Sample Output 2 :


Explanation of Sample Output 2 :
No output as 11 is prime having factors as 1 and 11 only
 */