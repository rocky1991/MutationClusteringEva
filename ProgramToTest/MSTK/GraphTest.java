import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
public class GraphTest{
	// public static void main(String[]args){
	@Test
	public void testCase1(){


		int V = 4; // Number of vertices in graph 
		int E = 5; // Number of edges in graph 
		Graph graph1 = new Graph(V, E); 
		// add edge 0-1 
		graph1.edge[0].src = 0; 
		graph1.edge[0].dest = 1; 
		graph1.edge[0].weight = 10; 

		// add edge 0-2 
		graph1.edge[1].src = 0; 
		graph1.edge[1].dest = 2; 
		graph1.edge[1].weight = 6; 

		// add edge 0-3 
		graph1.edge[2].src = 0; 
		graph1.edge[2].dest = 3; 
		graph1.edge[2].weight = 5; 

		// add edge 1-3 
		graph1.edge[3].src = 1; 
		graph1.edge[3].dest = 3; 
		graph1.edge[3].weight = 15; 

		// add edge 2-3 
		graph1.edge[4].src = 2; 
		graph1.edge[4].dest = 3; 
		graph1.edge[4].weight = 4; 

		graph1.KruskalMST(); 
		int w1 = graph1.getTotalW();
		int k = 2;
		Graph graph2 = new Graph(V, E); 
		// add edge 0-1 
		graph2.edge[0].src = 0; 
		graph2.edge[0].dest = 1; 
		graph2.edge[0].weight = 10*k; 

		// add edge 0-2 
		graph2.edge[1].src = 0; 
		graph2.edge[1].dest = 2; 
		graph2.edge[1].weight = 6*k; 

		// add edge 0-3 
		graph2.edge[2].src = 0; 
		graph2.edge[2].dest = 3; 
		graph2.edge[2].weight = 5*k; 

		// add edge 1-3 
		graph2.edge[3].src = 1; 
		graph2.edge[3].dest = 3; 
		graph2.edge[3].weight = 15*k; 

		// add edge 2-3 
		graph2.edge[4].src = 2; 
		graph2.edge[4].dest = 3; 
		graph2.edge[4].weight = 4*k; 

		graph2.KruskalMST(); 
		int w2 = graph2.getTotalW();
		assertEquals(w1*k,w2);
	} 

		@Test
	public void testCase2(){


		int V = 4; // Number of vertices in graph 
		int E = 5; // Number of edges in graph 
		Graph graph1 = new Graph(V, E); 
		// add edge 0-1 
		graph1.edge[0].src = 0; 
		graph1.edge[0].dest = 1; 
		graph1.edge[0].weight = 10; 

		// add edge 0-2 
		graph1.edge[1].src = 0; 
		graph1.edge[1].dest = 3; 
		graph1.edge[1].weight = 6; 

		// add edge 0-3 
		graph1.edge[2].src = 0; 
		graph1.edge[2].dest = 2; 
		graph1.edge[2].weight = 5; 

		// add edge 1-3 
		graph1.edge[3].src = 1; 
		graph1.edge[3].dest = 2; 
		graph1.edge[3].weight = 15; 

		// add edge 2-3 
		graph1.edge[4].src = 3; 
		graph1.edge[4].dest = 2; 
		graph1.edge[4].weight = 4; 

		graph1.KruskalMST(); 
		int w1 = graph1.getTotalW();
		int k = 2;
		Graph graph2 = new Graph(V, E); 
		// add edge 0-1 
		graph2.edge[0].src = 0; 
		graph2.edge[0].dest = 1; 
		graph2.edge[0].weight = 10; 

		// add edge 0-2 
		graph2.edge[1].src = 0; 
		graph2.edge[1].dest = 2; 
		graph2.edge[1].weight = 6; 

		// add edge 0-3 
		graph2.edge[2].src = 0; 
		graph2.edge[2].dest = 3; 
		graph2.edge[2].weight = 5; 

		// add edge 1-3 
		graph2.edge[3].src = 1; 
		graph2.edge[3].dest = 3; 
		graph2.edge[3].weight = 15; 

		// add edge 2-3 
		graph2.edge[4].src = 2; 
		graph2.edge[4].dest = 3; 
		graph2.edge[4].weight = 4; 

		graph2.KruskalMST(); 
		int w2 = graph2.getTotalW();
		assertEquals(w1,w2);
	} 
}