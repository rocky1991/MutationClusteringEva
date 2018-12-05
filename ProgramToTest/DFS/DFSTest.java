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
  @Test
  public void testCase4(){
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
  public void testCase5(){
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
  public void testCase6(){
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
  public void testCase7(){
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
  public void testCase8(){
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
  public void testCase9(){
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
  public void testCase10(){
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
  public void testCase11(){
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
  public void testCase12(){
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
  public void testCase13(){
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
  public void testCase14(){
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
  public void testCase15(){
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
  public void testCase16(){
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
  public void testCase17(){
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
  public void testCase18(){
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
  public void testCase19(){
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
  public void testCase20(){
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
  public void testCase21(){
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
  public void testCase22(){
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
  public void testCase23(){
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
  public void testCase24(){
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
  public void testCase25(){
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
  public void testCase26(){
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
  public void testCase27(){
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
  public void testCase28(){
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
  public void testCase29(){
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
  public void testCase30(){
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
  public void testCase31(){
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
  public void testCase32(){
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
  public void testCase33(){
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
  public void testCase34(){
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
  public void testCase35(){
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
  public void testCase36(){
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
  public void testCase37(){
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
  public void testCase38(){
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
  public void testCase39(){
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
  public void testCase40(){
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
  public void testCase41(){
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
  public void testCase42(){
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
  public void testCase43(){
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
  public void testCase44(){
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
  public void testCase45(){
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
  public void testCase46(){
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
  public void testCase47(){
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
  public void testCase48(){
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
  public void testCase49(){
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
  public void testCase50(){
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