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

        
