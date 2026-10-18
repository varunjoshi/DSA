import java.util.*;
class node{
int data;
node left;
node right;
node(int data){
this.data=data;
this.left=null;
this.right=null;
}
}

public class binarytree{
   
     node root;
     binarytree(){
             this.root = null;
             }
 public static void main(String[]args){
       binarytree tree= new binarytree();
       tree.root = new node(25);
       tree.root.left = new node(15);
       tree.root.right = new node(10);
    System.out.println("Root"+tree.root.data);
    System.out.println("Current :"+tree.root.left.data);
    System.out.println("Current :"+tree.root.right.data);
}
}



        
/*
 * BINARY TREE COMPLEXITY SUMMARY
 * ---------------------------------------------------------------------------
 * N = Number of nodes
 * h = Height of the tree
 * W = Maximum width of the tree
 *
 * 1. TIME COMPLEXITY
 * ---------------------------------------------------------------------------
 * Data Structure / Operation       Search/Access    Insertion       Deletion
 * ---------------------------------------------------------------------------
 * Unsorted Binary Tree             O(N)             O(N)*           O(N)
 * Binary Search Tree (BST) Avg     O(log N)         O(log N)        O(log N)
 * Binary Search Tree (BST) Worst   O(N)             O(N)            O(N)
 * Balanced BST (AVL / Red-Black)   O(log N)         O(log N)        O(log N)
 *
 * (* Insertion in unsorted tree can be O(1) if location/pointer is already given)
 *
 * 2. TRAVERSAL COMPLEXITY
 * ---------------------------------------------------------------------------
 * Traversal Type              Time        Auxiliary Space
 * ---------------------------------------------------------------------------
 * Depth-First Search (DFS)    O(N)        O(h) call stack
 *   (In-order, Pre, Post)                 - Balanced Tree: O(log N)
 *                                         - Degenerate/Skewed: O(N)
 *
 * Breadth-First Search (BFS)  O(N)        O(W) queue
 *   (Level-order)                         - Worst-case width: O(N)
 *
 * 3. SPACE COMPLEXITY BREAKDOWN
 * ---------------------------------------------------------------------------
 * - Data Storage:     O(N) space for N nodes and pointers.
 * - Call Stack (DFS): O(log N) height in balanced tree, O(N) in skewed tree.
 * - Queue Space (BFS):O(W) max width, up to O(N) on the bottom level.
 */