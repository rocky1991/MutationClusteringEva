import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class MSTKTest{
	  Random rand = new Random();
	  ArrayList <Integer> arrL = new ArrayList<Integer>();
	    List<Integer> newList = new ArrayList<Integer>();

	// public static void main(String[]args){
	@Test
	public void testCase1(){
		int nodes = rand.nextInt(100)+5;
		int w;
		int scale = rand.nextInt(10)+1;
		MSTKGraph graph1 = new MSTKGraph(nodes, nodes-1); 
		MSTKGraph graph2 = new MSTKGraph(nodes, nodes-1); 
	    for(int i= 0; i<nodes-1;i++){
	        w = rand.nextInt(40)+1; 
	    	graph1.edge[i].src = i;
	        graph1.edge[i].dest = i+1;
	        graph1.edge[i].weight = w;
	        
	        graph2.edge[i].dest = i;
	        graph2.edge[i].src = i+1;
	        graph2.edge[i].weight = w*scale;
	    }
		
		graph1.KruskalMST(); 

		graph2.KruskalMST();
		int totalw1 = graph1.getTotalW();
		int totalw2 = graph2.getTotalW();
		System.out.println(totalw1);
		System.out.println(totalw2);
		assertEquals(totalw1*scale,totalw2);
	} 

		@Test
	public void testCase2(){

		int nodes = rand.nextInt(100)+5;
		int w;
		int offset = rand.nextInt(10)+1;
		MSTKGraph graph1 = new MSTKGraph(nodes, nodes-1); 
		MSTKGraph graph2 = new MSTKGraph(nodes, nodes-1); 
	    for(int i= 0; i<nodes-1;i++){
	        w = rand.nextInt(40)+1; 
	    	graph1.edge[i].src = i;
	        graph1.edge[i].dest = i+1;
	        graph1.edge[i].weight = w;
	        
	        graph2.edge[i].dest = i;
	        graph2.edge[i].src = i+1;
	        graph2.edge[i].weight = w+offset;
	    }
		
		graph1.KruskalMST(); 

		graph2.KruskalMST();
		int totalw1 = graph1.getTotalW();
		int totalw2 = graph2.getTotalW();
		System.out.println(totalw1);
		System.out.println(totalw2);
		assertEquals(totalw1+offset*(nodes-1),totalw2);
			

	} 
}