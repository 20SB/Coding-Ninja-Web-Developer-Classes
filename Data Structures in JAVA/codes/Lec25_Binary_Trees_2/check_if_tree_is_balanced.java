/*
 * Check if Tree is balanced

You are given the root node of a binary tree.Print if it is balanced.
balanced means the difference in height between left child and right child shold not be greater than 1.
Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:only true or false
Constraints:
1 <= N <= 10^6
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
		 1
	    / \
	   2   3
	  / \  / \
	 4	5  6  7

1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
 Sample Output 1:
true
Sample Input 2:
		 5
	    / \
	   6   10
	  / \  
	 2	3  
	     \
	      9
	      
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
 Sample Output 1:
false
 */

package Lec25_Binary_Trees_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class balalncedTreeReturn{
	int height;
	boolean isBalanced;
}

public class check_if_tree_is_balanced {
	public static balalncedTreeReturn isBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			int height = 0;
			boolean isBlnc = true;
			balalncedTreeReturn ans =new balalncedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBlnc;
			return ans;
		}
		
		balalncedTreeReturn leftOutput = isBalanced(root.left);
		balalncedTreeReturn rightOutput = isBalanced(root.right);
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);
		boolean isBlnc = true;
		
		if(Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBlnc = false;
		}
		
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBlnc = false;
		}

		balalncedTreeReturn ans =new balalncedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBlnc;
		return ans;
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


	private static void printLevelWise(BinaryTreeNode<Integer> root){
		QueueUsingLL<BinaryTreeNode<Integer>>  primary = new QueueUsingLL<>();
		QueueUsingLL<BinaryTreeNode<Integer>>  secondary = new QueueUsingLL<>();

		primary.enqueue(root);

		while(!primary.isEmpty()){
			BinaryTreeNode<Integer> current=null;
			try {
				current = primary.dequeue();
			} catch (QueueEmptyException e) {
				System.out.println("Not possible");
			}
			System.out.print(current.data + " ");
			if(current.left != null){
				secondary.enqueue(current.left);
			}
			if(current.right != null){
				secondary.enqueue(current.right);
			}
			if(primary.isEmpty()){
				QueueUsingLL<BinaryTreeNode<Integer>>  temp = secondary;
				secondary = primary;
				primary = temp;
				System.out.println();
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BinaryTreeNode<Integer> root = takeInput();
		
		
		System.out.println(isBalanced(root).isBalanced);
		
	}
}
