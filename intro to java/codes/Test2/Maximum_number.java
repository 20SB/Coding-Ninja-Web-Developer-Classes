/*
 * We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make by removing one digit from the given integer.
Input Format :
A 4 digit number
Output Format :
A 3 digit number
 */
package Test2;

import java.util.Scanner;

public class Maximum_number {
	public static int max_number(int n){
        int m=0;
        for(int i=1;i<n;i*=10){
            m=Math.max(m,n%i+n/(i*10)*i);
        }
        return m;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(max_number(n));
	}
}
/*
Sample Input :
5438
Sample Output :
548
Explanation :
1. If we remove 5, the new number is 438.
2. If we remove 4, the new number is 538.
3. If we remove 3, the new number is 548.
4. If we remove 8, the new number is 543.
Out of the 4 cases removing 3 gives us the maximum 3 digit number i.e 548

*/