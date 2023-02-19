/*
 * Sample Input 1:
		 1
	    / \
	   2   3
	  / \  / \
	 4	5  6  7

1
Enter left child of 1
2
Enter right child of 1
3
Enter left child of 2
4
Enter right child of 2
5
Enter left child of 3
6
Enter right child of 3
7
Enter left child of 4
-1
Enter right child of 4
-1
Enter left child of 5
-1
Enter right child of 5
-1
Enter left child of 6
-1
Enter right child of 6
-1
Enter left child of 7
-1
Enter right child of 7
-1
 Sample Output 1:
1:L2, R3
2:L4, R5
4:
5:
3:L6, R7
6:
7:

Sample Input 2:
		 5
	    / \
	   6   10
	  / \  
	 2	3  
	     \
	      9
	      
5
Enter left child of 5
6
Enter right child of 5
10
Enter left child of 6
2
Enter right child of 6
3
Enter left child of 10
-1
Enter right child of 10
-1
Enter left child of 2
-1
Enter right child of 2
-1
Enter left child of 3
-1
Enter right child of 3
9
Enter left child of 9
-1
Enter right child of 9
-1
 Sample Output 1:
5:L6, R10
6:L2, R3
2:
3:R9
9:
10:

 */
package Lec25_Binary_Trees_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class take_Input_Level_Wise {
	public static BinaryTreeNode<Integer> takeinputLevelWise(){
        Scanner s= new Scanner(System.in);
        int rootData= s.nextInt();

        if(rootData==-1) return null;

        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren= new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);

        while(!pendingChildren.isEmpty()){
            BinaryTreeNode<Integer> front= pendingChildren.poll();
            System.out.println("Enter left child of "+ front.data);
            int left= s.nextInt();
            if(left!=-1){
                    BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(left);
                    front.left= leftChild;
                    pendingChildren.add(leftChild);
            }

            System.out.println("Enter right child of "+ front.data);
            int right= s.nextInt();
            if(right!=-1){
                    BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(right);
                    front.right= rightChild;
                    pendingChildren.add(rightChild);
            }
        }
        return root;
    }
	
	public static void printTreeDetailed(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.println();
        System.out.print(root.data+":");
        if(root.left != null){
            System.out.print("L"+root.left.data+", ");
            }
        if(root.right != null){
            System.out.print("R"+root.right.data);
            }
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }
	
	public static void main(String[] args){

        BinaryTreeNode<Integer> root= takeinputLevelWise();
        printTreeDetailed(root);

    }
}
