import java.util.*;
class primsGraph{
      public static void prims(int [][]graph, int vertices){
           if(vertices<0){
               System.out.println("Invalid number of vertices !");
               return;
               
           }
           //trackers
           boolean [] visited = new boolean[vertices];
           visited[0] = true;
           
           int edgeCount=0;
           int totalCost = 0;
           
           while(edgeCount<=vertices-1){
               int min = 9999;
               int u= -1;
               int w = -1;
               for(int i=0;i<vertices;i++){
                   if(visited[i]==true){
                       for(int j=0;j<vertices;j++){
                           if(visited[j]==false && graph[i][j]!=0){
                               if(min>graph[i][j]){
                                   min = graph[i][j];
                                   u=i;
                                   w=j;
                                   
                               }
                           }
                       }
                   }
               }
               
               if(u==-1 || w==-1)
               {
                   System.out.println("Graph is disconnected!");
                   return;
                   
               }
               System.out.println(u+"-"+w+"="+ min);
               visited[w]=true;
               totalCost+=min;
               edgeCount++;
           }
           
           System.out.println("------------------------------------------------");
           System.out.println("Total Cost "+ totalCost);
      }
      public static void main (String [] args){
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        int[][] graph = new int[v][v];
        System.out.println("Enter Adjacency Matrix (use 0 for no direct edge):");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        primsGraph p = new primsGraph();
        p.prims(graph, v);

        sc.close();
    }
}
           
               
               
          