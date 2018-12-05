import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class DFSTest{
  Random rand = new Random();
  ArrayList <Integer> arrL = new ArrayList<Integer>();
    List<Integer> newList = new ArrayList<Integer>();

  
  // Start at the same node and permutate the rest of the nodes, the trace of the nodes should
  // permute the same way
  @Test
  public void testCase1(){
    int nodes = rand.nextInt(100)+5;
        DFSGraph g1 = new DFSGraph(nodes);
        DFSGraph g2 = new DFSGraph(nodes);
      ArrayList <Integer> arr1 = new ArrayList<Integer>();
      for(int i= 0; i<nodes-1;i++){
        g1.addEdge(i,i+1);
//        arr1.add(i);
        g2.addEdge(nodes-1-i, nodes-2-i);
      }

        g1.DFS(0); 
        g2.DFS(nodes-1);
        // System.out.println(g1.getTrace().toString());        
        
        ArrayList <Integer> reverseTrace2 = new ArrayList<Integer>();
        reverseTrace2 = g2.getTrace();
        Collections.reverse(reverseTrace2);
        System.out.println(reverseTrace2.toString());
        assertEquals(g1.getTrace(),reverseTrace2);
    } 

  @Test
  public void testCase2(){
    int nodes = rand.nextInt(100)+5;
        DFSGraph g1 = new DFSGraph(nodes);
        DFSGraph g2 = new DFSGraph(nodes);
      ArrayList <Integer> arr1 = new ArrayList<Integer>();
      for(int i= 0; i<nodes-1;i++){
        g1.addEdge(i,i+1);
//        arr1.add(i);
        g2.addEdge(nodes-1-i, nodes-2-i);
      }

        g1.DFS(0); 
        g2.DFS(nodes-1);
        // System.out.println(g1.getTrace().toString());        
        
        ArrayList <Integer> reverseTrace2 = new ArrayList<Integer>();
        reverseTrace2 = g2.getTrace();
        Collections.reverse(reverseTrace2);
        System.out.println(reverseTrace2.toString());
        assertEquals(g1.getTrace(),reverseTrace2);
    } 
  @Test
  public void testCase3(){
    int nodes = rand.nextInt(100)+5;
        DFSGraph g1 = new DFSGraph(nodes);
        DFSGraph g2 = new DFSGraph(nodes);
      ArrayList <Integer> arr1 = new ArrayList<Integer>();
      for(int i= 0; i<nodes-1;i++){
        g1.addEdge(i,i+1);
//        arr1.add(i);
        g2.addEdge(nodes-1-i, nodes-2-i);
      }

        g1.DFS(0); 
        g2.DFS(nodes-1);
        // System.out.println(g1.getTrace().toString());        
        
        ArrayList <Integer> reverseTrace2 = new ArrayList<Integer>();
        reverseTrace2 = g2.getTrace();
        Collections.reverse(reverseTrace2);
        System.out.println(reverseTrace2.toString());
        assertEquals(g1.getTrace(),reverseTrace2);
    } 
}