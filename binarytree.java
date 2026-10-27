import java.util.*;
class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data= data;
        left=right=null;
        
    }
}
public class binarytree{
    node root;
    node current;
    Scanner sc = new Scanner(System.in);
    binarytree(){
         System.out.println("Enter the value of the root:");
         int val = sc.nextInt();
         root = new node(val); 
         
         current = root;
    }
    
    void insert(){
        while(true){
            System.out.println("Do you want to continue: 1.Y 2.N");
            int ch = sc.nextInt();
            if(ch ==1 ){
                System.out.println("Enter the value :");
                int val = sc.nextInt(); 
                node newnode = new  node(val);
                System.out.println("Enter the direction of the insertion : 1.right 2.left");
                int dir = sc.nextInt();
                if(dir== 1 && current.right==null){
                    current.right =newnode;
                  current = newnode;
                    
                    
                
                }
             else if   (dir== 2 && current.left== null){
                    current.left=newnode;
                   
                     current = newnode;
                
            
            }
            }
           else   if(ch == 2){
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
            
    public static void  main (String[] args) {
               binarytree tree = new binarytree();
               tree.insert();
               System.out.println("Preorder Traversal :");
               tree.preorder(tree.root);
               System.out.println("Inorder Traversal :");
               tree.inorder(tree.root);
               System.out.println("Postorder Traversal :");
               tree.postorder(tree.root);
            }
            }
        
            
        
    
