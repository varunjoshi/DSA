import java.util.*;
class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
        left = right = null;
        
    }
}
public class binarytree{
    node root;
    node current;
    
    Scanner sc = new Scanner(System.in);
    binarytree(){
            System.out.println("Enter the root node");
            int val = sc.nextInt();
            node newnode = new node(val);
            root = newnode;
            current = root;
            }
    void insert(){
        while(true){
            System.out.println("Do you want to continue?: 1.yes 2.no");
            int choice=sc.nextInt();
            if(choice==1){
            System.out.println("Enter the  node :");
            int val = sc.nextInt();
            node newnode = new node(val);
            System.out.println("Enter the direction of insertion: 1.Left 2.Right");
            int dir=sc.nextInt();
            if(dir == 1){
                if(current.left == null){
                    current.left=newnode;
                    
                    
                }
                    else{
                        current=current.left;
                    }
                }
            
            else if(dir == 2){
                if(current.right==null){
                    current.right = newnode;
                    
                    
                }
                    else{
                        current=current.right;
                    }
                }
            }
         
            if(choice == 2){
                break;
            }
            
        }
    } 
        void preorder(node current){
            if(current==null){
                return;
            }
            System.out.println(" "+current.data);
            preorder(current.left);
            preorder(current.right);
        }
        
        void inorder(node current){
            if(current==null){
                return;
            }
            inorder(current.left);
            System.out.println(" "+current.data);
            inorder(current.right);
        }
        void postorder(node current){
            if(current==null){
                return;
            }
            postorder(current.left);
            postorder(current.right);
            System.out.println(" "+current.data);
        }
        public static void main(String[] args){
            binarytree tree = new binarytree();
            tree.insert();
            System.out.println("preorder");
            tree.preorder(tree.root);
            System.out.println("inorder");
            tree.inorder(tree.root);
            System.out.println("postorder");
            tree.postorder(tree.root);
        }
    }
