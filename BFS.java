import java.util.*;

public class BFS {
	
	
	int V;
	ArrayList<ArrayList<Integer>> adj;
	
	public BFS(int v) {
		
		this.V =v;
		adj = new ArrayList<ArrayList<Integer>>(V);
		for(int i=0; i<V; i++) {
			
			adj.add(new ArrayList<Integer>());
		}
	}
	
	void addEdge(int u, int v) {
		
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	void bfs_op(int s) {
		
		Queue<Integer> qu = new LinkedList<>();
		
		qu.add(s);
		
		boolean[] visited = new boolean[V];
		
		visited[s] = true;
		
		while(!qu.isEmpty()) {
			
			s = qu.poll();
			System.out.print(s + " ");
			for(int i : adj.get(s)) {
				
				if(!visited[i]) {
					visited[i] = true;
					qu.add(i);
				}
			}
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			BFS g = new BFS(5);
			
			 	g.addEdge( 0, 1); 
			 	g.addEdge( 0, 4); 
			 	g.addEdge( 1, 2); 
			 	g.addEdge( 1, 3); 
			 	g.addEdge( 1, 4); 
			 	g.addEdge( 2, 3); 
			 	g.addEdge( 3, 4); 
//			g.addEdge(0, 1); 
//	        g.addEdge(0, 2); 
//	        g.addEdge(1, 2); 
//	        g.addEdge(2, 0); 
//	        g.addEdge(2, 3); 
//	        g.addEdge(3, 3); 
			 	
		System.out.println("The BFS order from 2 is :");
		g.bfs_op(2);	
	}

}
