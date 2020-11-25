import java.util.*; 

public class Graph_AdjacencyList {

		// static int V = 10;
		public static void main(String[] args){
		
			int  V = 10;
			ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
			
			for(int  i=0; i<V; i++){
			
				adj.add(new ArrayList<Integer>(V));
			}
			addEdge(adj, 0, 1); 
			addEdge(adj, 0, 4); 
			addEdge(adj, 1, 2); 
			addEdge(adj, 1, 3); 
			addEdge(adj, 1, 4); 
			addEdge(adj, 2, 3); 
			addEdge(adj, 3, 4);
			
			for (int i = 0; i < adj.size(); i++) { 
				System.out.println("\nAdjacency list of vertex" + i); 
				System.out.print("head"); 
				for (int j = 0; j < adj.get(i).size(); j++) { 
					System.out.print(" -> "+adj.get(i).get(j)); 
				} 
				System.out.println(); 
			} 
			
		}
		
		
		static void addEdge(ArrayList<ArrayList<Integer>> ar, int u, int v){
		
			ar.get(u).add(v);
			ar.get(v).add(u);
		}
		
		
		



}