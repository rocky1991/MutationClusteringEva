
import java.util.List;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
public class BFSTest{
	  Random rand = new Random();
	  ArrayList <Integer> arrL = new ArrayList<Integer>();
	    List<Integer> newList = new ArrayList<Integer>();

	  
	  // Start at the same node and permutate the rest of the nodes, the trace of the nodes should
	  // permute the same way
	  @Test
	  public void testCase1(){
	    int nodes = rand.nextInt(100)+5;
	        BFSGraph g1 = new BFSGraph(nodes);
	        BFSGraph g2 = new BFSGraph(nodes);
	      ArrayList <Integer> arr1 = new ArrayList<Integer>();
	      for(int i= 0; i<nodes-1;i++){
	        g1.addEdge(i,i+1);
//	        arr1.add(i);
	        g2.addEdge(nodes-1-i, nodes-2-i);
	      }

	        g1.BFS(0); 
	        g2.BFS(nodes-1);
	        // System.out.println(g1.getTrace().toString());        
	        
	        ArrayList <Integer> reverseTrace2 = new ArrayList<Integer>();
	        reverseTrace2 = g2.getTrace();
	        Collections.reverse(reverseTrace2);
	        System.out.println(reverseTrace2.toString());
	        assertEquals(g1.getTrace(),reverseTrace2);
	    } 


    //Reverse the edge directions and start node search from the end
    // The trace should be reversed
	  @Test
	  public void testCase2(){
	    int nodes = rand.nextInt(100)+5;
	        BFSGraph g1 = new BFSGraph(nodes);
	        BFSGraph g2 = new BFSGraph(nodes);
	      ArrayList <Integer> arr1 = new ArrayList<Integer>();
	      for(int i= 0; i<nodes-1;i++){
	        g1.addEdge(i,i+1);
//	        arr1.add(i);
	        g2.addEdge(nodes-1-i, nodes-2-i);
	      }

	        g1.BFS(0); 
	        g2.BFS(nodes-1);
	        // System.out.println(g1.getTrace().toString());        
	        
	        ArrayList <Integer> reverseTrace2 = new ArrayList<Integer>();
	        reverseTrace2 = g2.getTrace();
	        Collections.reverse(reverseTrace2);
	        System.out.println(reverseTrace2.toString());
	        assertEquals(g1.getTrace(),reverseTrace2);
	    } 


 //    // If the graph forms a cycle, reverse the edge will reverse the trace(start
 //    // node is the same and compare trace excluding start node)
	  @Test
	  public void testCase3(){
	    int nodes = rand.nextInt(100)+5;
	        BFSGraph g1 = new BFSGraph(nodes);
	        BFSGraph g2 = new BFSGraph(nodes);
	      ArrayList <Integer> arr1 = new ArrayList<Integer>();
	      for(int i= 0; i<nodes-1;i++){
	        g1.addEdge(i,i+1);
//	        arr1.add(i);
	        g2.addEdge(nodes-1-i, nodes-2-i);
	      }

	        g1.BFS(0); 
	        g2.BFS(nodes-1);
	        // System.out.println(g1.getTrace().toString());        
	        
	        ArrayList <Integer> reverseTrace2 = new ArrayList<Integer>();
	        reverseTrace2 = g2.getTrace();
	        Collections.reverse(reverseTrace2);
	        System.out.println(reverseTrace2.toString());
	        assertEquals(g1.getTrace(),reverseTrace2);
	    } 


}