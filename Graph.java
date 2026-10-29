import java.util.*;
public class Graph{
    int vertices;
    List<List<Integer>> adjList;
     
     public Graph(int vertices){
           this.vertices=vertices;
           adjList= new ArrayList<>();
             
             for(int i=0;i<vertices ; i++){
                  adjList.add(new ArrayList<>());
                  
             }
     }
     
     public void addEdge(int src,int dest){
             if(src<0|| src>=vertices || dest<0 || dest>=vertices){
                 System.out.println("Invalid Edge:"+(""+src+"" + ""+dest+"")+ "is out of bounds!");
                 return;
             }
             adjList.get(src).add(dest);
             adjList.get(dest).add(src);
             
     }
     public void printGraph(){
         if(vertices == 0){
             System.out.println("Graph is Empty.");
             return;
             
        }
    System.out.println("Graph Adjecency List");
    for(int i=0;i<vertices;i++){
         System.out.println(i+"->");
         for(int node : adjList.get(i)){
             System.out.println(node +" ");
         }
         System.out.println();
         }
    }
    public static void main(String [] args){
        int numberOfVertices= 5;
        Graph graph = new Graph(numberOfVertices);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        
        graph.printGraph();
        
    }
}
