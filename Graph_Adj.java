
public class Graph_Adj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 10;

        int[][] adj = new int[V][V];

           addEdge(adj, 0, 1); 
			addEdge(adj, 0, 4); 
			addEdge(adj, 1, 2); 
			addEdge(adj, 1, 3); 
			addEdge(adj, 1, 4); 
			addEdge(adj, 2, 3); 
			addEdge(adj, 3, 4); 
       
       for(int i=0; i<V; i++){
           for(int j=0; j<V; j++){
               System.out.print(adj[i][j] + " ");
           }
           System.out.println();
       }

   }
   static void addEdge(int[][] adj, int u, int v){

       adj[u][v] = 1;
   }

}

