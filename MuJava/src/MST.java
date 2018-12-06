// A Java program for Prim's Minimum Spanning Tree (MST) algorithm. 
// The program is for adjacency matrix representation of the graph 

import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class MST
{ 
	// Number of vertices in the graph 
	public int V; 
	private int totalW= 0;
	private int mst_size = 0;
	
	// A utility function to find the vertex with minimum key 
	// value, from the set of vertices not yet included in MST 
	public int minKey(int key[], Boolean mstSet[]) 
	{ 
		// Initialize min value 
		int min = Integer.MAX_VALUE, min_index=-1; 

		for (int v = 0; v < V; v++) 
			if (mstSet[v] == false && key[v] < min) 
			{ 
				min = key[v]; 
				min_index = v; 
			} 

		return min_index; 
	} 
	public int getMstSize() {
		return mst_size;
	}
	public void setMstSize(int a) {
		this.mst_size = a;
	}
	// A utility function to print the constructed MST stored in 
	// parent[] 
	public void printMST(int parent[], int n, int graph[][]) 
	{ 
		this.totalW =0;
		 System.out.println("Edge \tWeight"); 

		for (int i = 1; i < V; i++) {
			 // System.out.println(parent[i]+" - "+ i+"\t"+ 
				// 			 graph[i][parent[i]]); 
			this.totalW += graph[i][parent[i]];
			
		
		// System.out.println(totalW);
		// return totalW;
		}
	} 
	public int getTotalW(){
		return totalW;
	}
	// Function to construct and print MST for a graph represented 
	// using adjacency matrix representation 
	public void primMST(int graph[][],int V) 
	{ 
		this.V = V;
		// Array to store constructed MST 
		int parent[] = new int[V]; 
		
		// Key values used to pick minimum weight edge in cut 
		int key[] = new int [V]; 

		// To represent set of vertices not yet included in MST 
		Boolean mstSet[] = new Boolean[V]; 

		// Initialize all keys as INFINITE 
		for (int i = 0; i < V; i++) 
		{ 
			key[i] = Integer.MAX_VALUE; 
			mstSet[i] = false; 
		} 

		// Always include first 1st vertex in MST. 
		key[0] = 0;	 // Make key 0 so that this vertex is 
						// picked as first vertex 
		parent[0] = -1; // First node is always root of MST 

		// The MST will have V vertices 
		for (int count = 0; count < V-1; count++) 
		{ 
			// Pick thd minimum key vertex from the set of vertices 
			// not yet included in MST 
			int u = minKey(key, mstSet); 

			// Add the picked vertex to the MST Set 
			mstSet[u] = true; 

			// Update key value and parent index of the adjacent 
			// vertices of the picked vertex. Consider only those 
			// vertices which are not yet included in MST 
			for (int v = 0; v < V; v++) 

				// graph[u][v] is non zero only for adjacent vertices of m 
				// mstSet[v] is false for vertices not yet included in MST 
				// Update the key only if graph[u][v] is smaller than key[v] 
				if (graph[u][v]!=0 && mstSet[v] == false && 
					graph[u][v] < key[v]) 
				{ 
					parent[v] = u; 
					key[v] = graph[u][v]; 
				} 
		} 
//		System.out.println(Arrays.toString(parent));
//		System.out.println(parent.length);
		setMstSize(parent.length);
		// print the constructed MST 
		printMST(parent, V, graph); 
	} 

} 
// This code is contributed by Aakash Hasija 
