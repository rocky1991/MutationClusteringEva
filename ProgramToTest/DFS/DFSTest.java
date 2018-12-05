import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class DFSTest{
	Random rand = new Random;
	public ArrayList <Integer> shuffle(ArrayList <Integer>arrL){
		for(int i = 0; i<arrL.size();i++){
			if(rand.nextDouble()>0.5){
				int temp = arrL.get(i);
				int target = rand.nextInt(arrL.size());
				arrL.set(i,arrL.get(target));
				arrL.set(target,temp);
			}
		}
		return arrL;
	}
	// Start at the same node and permutate the rest of the nodes, the trace of the nodes should
	// permute the same way
	@Test
	public void testCase1(){
		int nodes = rand.nextInt(20);
        DFSGraph g1 = new DFSGraph(nodes); 
  		ArrayList <Integer> arr1 = new ArrayList<Integer>();
  		for(int i= 0; i<nodes-1;i++){
  			g1.addEdge(i,i+1)
  			arr1.add(i);
  		}

        g1.DFS(0); 

        // System.out.println(g1.getTrace().toString());

        DFSGraph g2 = new DFSGraph(nodes); 
  		ArrayList <Integer> arr2 = shuffle(arr1);
  		for(int i= 0; i<nodes-1;i++){
  			g2.addEdge(arr2.get(i),arr2.get(i+1));
  		}

        g2.DFS(arr2.get(0));
        ArrayList <Interger> testTrace = new ArrayList<Integer>();
        // System.out.println(g2.getTrace().toString());
        for(int i = 0; i< nodes;i++){
        	testTrace.set(arr2.get(i),arr1.get())
        }
        assertEquals("[0, 3, 2, 1]",g2.getTrace().toString());
    } 

    //Reverse the edge directions and start node search from the end
    // The trace should be reversed
    @Test
	public void testCase2(){

        DFSGraph g1 = new DFSGraph(4); 
  
        g1.addEdge(0, 1); 
        g1.addEdge(1, 2); 
        g1.addEdge(2, 3); 
        g1.DFS(0); 
        // System.out.println(g1.getTrace().toString());

        DFSGraph g2 = new DFSGraph(4);
        g2.addEdge(1,0);
        g2.addEdge(2,1);
        g2.addEdge(3,2);
        g2.DFS(3);
        // System.out.println(g2.getTrace().toString());
        Collections.reverse(g1.getTrace());
        assertEquals(g1.getTrace().toString(),g2.getTrace().toString());
    } 
      @Test
    public void testCase3(){

        DFSGraph g1 = new DFSGraph(4); 
  
        g1.addEdge(0, 1); 
        g1.addEdge(1, 2); 
        g1.addEdge(2, 3); 
        g1.addEdge(3,0);
        g1.DFS(0); 
        // System.out.println(g1.getTrace().toString());

        DFSGraph g2 = new DFSGraph(4);
        g2.addEdge(1,0);
        g2.addEdge(2,1);
        g2.addEdge(3,2);
        g2.addEdge(0,3);
        g2.DFS(0);
        // System.out.println(g2.getTrace().toString());
        g1.getTrace().remove(0);
        Collections.reverse(g1.getTrace());
        g2.getTrace().remove(0);
        assertEquals(g1.getTrace().toString(),g2.getTrace().toString());
    } 
}