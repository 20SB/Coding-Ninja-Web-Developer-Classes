/*
 * Diameter Of Binary Tree
Send Feedback
For a given Binary of type integer, find and return the ‘Diameter’.
Diameter of a Tree
The diameter of a tree can be defined as the maximum distance between two leaf nodes.
Here, the distance is measured in terms of the total number of nodes present along the path of the two leaf nodes, including both the leaves.
Example:
		 2
	    / \
	   4   5
	  /     \
	 6	     7
    / \     / \
   20 30   80 90
      /     \
     8       9
The maximum distance can be seen between the leaf nodes 8 and 9. 
The distance is 9 as there are a total of nine nodes along the longest path from 8 to 9(inclusive of both). Hence the diameter according to the definition will be 9.
Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The only line of output prints an integer, representing the diameter of the tree.
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 8 -1 -1 9 -1 -1 -1 -1 -1 -1 
Sample Output 1:
9
Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
5
 */
package Lec25_Binary_Trees_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PairDH { 
	int diameter; 
	int height; 
	public PairDH(int diameter, int height) { 
		this.diameter = diameter; 
		this.height = height; 
	}
}

public class Diameter_Of_Binary_Tree {

	private static PairDH diameterHelper (BinaryTreeNode<Integer> root) { 
		if(root == null) { 
			PairDH PairDH = new PairDH(0, 0); 
			return PairDH; 
		} 
		PairDH leftPairDH = diameterHelper (root.left); 
		PairDH rightPairDH = diameterHelper (root.right); 
		
		int leftDiameter = leftPairDH.diameter; 
		int rightDiameter = rightPairDH.diameter;
		
		/* 'dist' denotes the longest distance between deepest node of the left 
		subtree and deepest node of the right subtree */
		
		int dist=leftPairDH.height + rightPairDH.height + 1;
		
		int height = Math.max(leftPairDH.height,rightPairDH.height) + 1; 
		int diameter = Math.max(leftDiameter, Math.max(rightDiameter, dist)); 
		return (new PairDH(diameter, height)); 
	} 
	public static int diameterOfBinaryTree (BinaryTreeNode<Integer> root){ 
		PairDH PairDH = diameterHelper (root); 
		return PairDH.diameter;
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
		
		
		System.out.println(diameterOfBinaryTree(root));
		
	}
}
