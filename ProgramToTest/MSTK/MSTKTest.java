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
	@Test
	public void testCase3(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase4(){

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
	@Test
	public void testCase5(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase6(){

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
	@Test
	public void testCase7(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase8(){

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
	@Test
	public void testCase9(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase10(){

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
	@Test
	public void testCase11(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase12(){

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
	@Test
	public void testCase13(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase14(){

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
	@Test
	public void testCase15(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase16(){

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
	@Test
	public void testCase17(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase18(){

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
	@Test
	public void testCase19(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase20(){

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
	@Test
	public void testCase21(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase22(){

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
	@Test
	public void testCase23(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase24(){

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
	@Test
	public void testCase25(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase26(){

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
	@Test
	public void testCase27(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase28(){

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
	@Test
	public void testCase29(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase30(){

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
	@Test
	public void testCase31(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase32(){

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
	@Test
	public void testCase33(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase34(){

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
	@Test
	public void testCase35(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase36(){

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
	@Test
	public void testCase37(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase38(){

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
	@Test
	public void testCase39(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase40(){

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
	@Test
	public void testCase41(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase42(){

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
	@Test
	public void testCase43(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase44(){

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
	@Test
	public void testCase45(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase46(){

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
	@Test
	public void testCase47(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase48(){

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
	@Test
	public void testCase49(){
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

		assertEquals(totalw1*scale,totalw2);
	} 

	@Test
	public void testCase50(){

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