
import java.util.*;

class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class binarytree {
    node root;
    node current;
    Scanner sc = new Scanner(System.in);

    binarytree() {
        System.out.println("Enter the root data:");
        int val = sc.nextInt();

        root = new node(val);
        current = root;
    }

    void insert() {
        while (true) {
            System.out.println("Do you want to continue insertion? 1.y 2.n");
            int ch = sc.nextInt();

            if (ch == 2) {
                break;
            }

            if (ch == 1) {
                System.out.println("Enter the value of the node:");
                int val = sc.nextInt();
                node newnode = new node(val);

                System.out.println("Enter the dir to put it? 1.left 2.right");
                int dir = sc.nextInt();

                if (dir == 1) {
                    if (current.left == null) {
                        current.left = newnode;
                    } else {
                        current = current.left;
                        System.out.println("Left already occupied. Current moved left.");
                    }
                } else if (dir == 2) {
                    if (current.right == null) {
                        current.right = newnode;
                    } else {
                        current = current.right;
                        System.out.println("Right already occupied. Current moved right.");
                    }
                } else {
                    System.out.println("Invalid direction!");
                }
            }
        }
    }

    void preorder(node current) {
        if (current == null) {
            return;
        }

        System.out.println(" " + current.data);
        preorder(current.left);
        preorder(current.right);
    }

    public static void main(String[] args) {
        binarytree tree = new binarytree();
        tree.insert();
        tree.preorder(tree.root);
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
