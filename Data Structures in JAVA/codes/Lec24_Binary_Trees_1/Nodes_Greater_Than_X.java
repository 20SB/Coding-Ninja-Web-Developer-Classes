/*
 * Nodes Greater Than X
Send Feedback
For a given a binary tree of integers and an integer X, find and return the total number of nodes of the given binary tree which are having data greater than X.
Input Format:
The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

The second line of input contains an integer, denoting the value of X.
Note:
You are not required to print anything explicitly. It has already been taken care of.
Output Format:
The only line of output prints the total number of nodes where the node data is greater than X.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec

Sample Input:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
5
Sample Output:
3
Explanation:
Out of the 6 nodes of the given binary tree, [6,10,9] are the node data that are greater than X = 5.

 */

package Lec24_Binary_Trees_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Nodes_Greater_Than_X {
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
		if(root == null){
			return 0;
		}
		int ll = countNodesGreaterThanX(root.left , x);
		int lr = countNodesGreaterThanX(root.right , x);
		if(root.data > x){
			return ll + lr + 1;
		}
		else{
			return ll + lr;
		}
	}
	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static BinaryTreeNode<Integer> takeInput() throws NumberFormatException, IOException {
		QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>(); 
		int start = 0;

		String[] nodeDatas = br.readLine().trim().split(" ");

		if (nodeDatas.length == 1) {
			return null;
		}
		
		int rootData = Integer.parseInt(nodeDatas[start]);
		start += 1;

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}

			int leftChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(leftChildData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}

			int rightChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(rightChildData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}

		return root;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BinaryTreeNode<Integer> root = takeInput();
		Scanner s = new Scanner(System.in);
		int x= s.nextInt();
		int res = countNodesGreaterThanX(root, x);
		System.out.println(res);
	}
}
