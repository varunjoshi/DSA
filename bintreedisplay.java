import java.util.*;

class node {
    node left;
    node right;
    int data;

    node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class bintreedisplay {
    node root;
    Scanner sc = new Scanner(System.in);

    void insertnode() {
        while (true) {
            System.out.println("Do you want to continue insertion? 1.Yes 2.No");
            int choice = sc.nextInt();

            if (choice == 1) {
                if (root == null) {
                    System.out.println("Tree is empty. Enter the root value:");
                    int rootval = sc.nextInt();
                    root = new node(rootval);
                    continue;
                }

                System.out.println("Enter the value of node:");
                int value = sc.nextInt();
                node newnode = new node(value);

                node current = root;
                while (true) {
                    System.out.println("At node (" + current.data + "). Choose direction: 1. Left 2. Right");
                    int dir = sc.nextInt();

                    if (dir == 1) {
                        if (current.left == null) {
                            current.left = newnode;
                            break;
                        }
                        current = current.left;
                    } else if (dir == 2) {
                        if (current.right == null) {
                            current.right = newnode;
                            break;
                        }
                        current = current.right;
                    } else {
                        System.out.println("Invalid Direction");
                    }
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }

    void displayInOrder(node current) {
        if (current == null) {
            return;
        }
        displayInOrder(current.left);
        System.out.print(current.data + " ");
        displayInOrder(current.right);
    }

    void displayPreOrder(node current) {
        if (current == null) {
            return;
        }
        System.out.print(current.data + " ");
        displayPreOrder(current.left);
        displayPreOrder(current.right);
    }

    void displayPostOrder(node current) {
        if (current == null) {
            return;
        }
        displayPostOrder(current.left);
        displayPostOrder(current.right);
        System.out.print(current.data + " ");
    }

    public static void main(String[] args) {
        bintreedisplay tree = new bintreedisplay();

        tree.insertnode();

        System.out.println("\nIn-Order Traversal:");
        tree.displayInOrder(tree.root);

        System.out.println("\nPre-Order Traversal:");
        tree.displayPreOrder(tree.root);

        System.out.println("\nPost-Order Traversal:");
        tree.displayPostOrder(tree.root);
        System.out.println();
    }
}