/*
 * Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) =  1, 
           F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.

Input Format :
The first line of each test case contains a real number ‘N’.

Output Format :
For each test case, return its equivalent Fibonacci number.

Constraints:
1 <= N <= 10000     
Where ‘N’ represents the number for which we have to find its equivalent Fibonacci number.

Time Limit: 1 second
 */
package Lec7_Operators_and_For_Loop;

import java.util.Scanner;

public class Nth_Fibonacci_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int Fn=0,a=1,b=1;
		if(n==1||n==2){
			Fn=1;
		}
		else{
			for(int i=3;i<=n;i++){
				Fn=a+b;
				a=b;
				b=Fn;
			}
		}
		System.out.print(Fn);
	}

}
/*
Sample Input 1:
6
Sample Output 1:
8
Explanation of Sample Input 1:
Now the number is ‘6’ so we have to find the “6th” Fibonacci number
So by using the property of the Fibonacci series i.e 

[ 1, 1, 2, 3, 5, 8, 13, 21]
So the “6th” element is “8” hence we get the output.
*/