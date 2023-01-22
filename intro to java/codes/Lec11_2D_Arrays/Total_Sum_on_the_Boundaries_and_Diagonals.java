/*
 * For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
Input format:
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.
Second line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith row constitutes 'N' column values separated by a single space.

Output format:
For each test case, print the single integer denoting the sum.
Output for every test case will be printed in a seperate line.

Constraints:
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1sec
 */
package Lec11_2D_Arrays;

import java.util.Scanner;

public class Total_Sum_on_the_Boundaries_and_Diagonals {
	public static void totalSum(int[][] mat) {
		//Your code goes here
		int sum=0;
		int size=mat.length;
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if((i==j) || ((i+j)==size-1) || (i==0 || i==size-1) || (j==0 || j==size-1)){
					sum=sum+mat[i][j];
				}
			}		
		}
		System.out.println(sum);
	}

	static Scanner s=new Scanner(System.in);
	public static int[][] take2DInput(){	//Input Function
        int size = s.nextInt();
        int m_cols = size, n_rows = size;

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

            totalSum(mat);
            System.out.println();

            t -= 1;
        }
    }
}
/*
Sample input 1:
1
3
1 2 3
4 5 6
7 8 9
Sample Output 1:
45
Explanation for Sample Output 1:
The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 
The first-diagonal elements are 1, 5 and 9. 
The second-diagonal elements are 3, 5 and 7.
We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.
Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.

Sample input 2:
2
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
4
1 2 3 10
4 5 6 11
7 8 9 12
13 14 15 16
Sample Output 2:
273
136
*/