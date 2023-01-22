/*
 * Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
Input format :
Line 1 : n
Line 2 : n numbers
 */
package Test1;

import java.util.Scanner;

public class Check_AP {
	public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pn=s.nextInt();
		int nn=s.nextInt();
		int diff=nn-pn;
		int flag=0;
		for(int i=3;i<=n;i++){
			pn=nn;
			nn=s.nextInt();
			if(diff!=nn-pn){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.print("false");
		}
		else{
			System.out.print("true");
		}
	}
}
/*
Sample Input 1 :
6
2 6 10 14 18 22
Sample Output 1 :
true
Sample Input 2 :
6
2 6 10 15 19 23
Sample Output 2 :
false
*/