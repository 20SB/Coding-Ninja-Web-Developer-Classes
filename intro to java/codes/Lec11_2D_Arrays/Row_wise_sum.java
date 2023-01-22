/*
 * For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.

Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
Second line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith row constitutes 'M' column values separated by a single space.

Output Format :
For each test case, print the sum of every ith row elements in a single line separated by a single space.
Output for every test case will be printed in a seperate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
 */
package Lec11_2D_Arrays;

import java.util.Scanner;

public class Row_wise_sum {
	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
		for(int i=0;i<mat.length;i++){
			int rsum=0;
			for(int j=0;j<mat[0].length;j++){
				rsum+=mat[i][j];
			}
			System.out.print(rsum+" ");
		}
	}
	
	static Scanner s=new Scanner(System.in);
	public static int[][] take2DInput(){	//Input Function
        int n_rows = s.nextInt();
        int m_cols = s.nextInt();

        if (n_rows == 0) {
            return new int[0][0];
        }
        int[][] mat = new int[n_rows][m_cols];
        for (int row = 0; row < n_rows; row++) {            
            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = s.nextInt();
            }
        }
        return mat;
    }
    public static void main(String[] args){		//Main Function
        int t = s.nextInt();;

        while(t > 0) {

            int[][] mat = take2DInput();

            rowWiseSum(mat);
            System.out.println();

            t -= 1;
        }
    }
}
/*
Sample Input 1:
1
4 2 
1 2 
3 4 
5 6 
7 8
Sample Output 1:
3 7 11 15 
Sample Input 2:
2
2 5 
4 5 3 2 6 
7 5 3 8 9
4 4
1 2 3 4
9 8 7 6
3 4 5 6
-1 1 -10 5
Sample Output 2:
20 32 
10 30 18 -5 
*/