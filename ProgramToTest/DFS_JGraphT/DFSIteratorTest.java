import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.GraphIterator;
import java.util.Random;
import java.util.List;
public class DFSIteratorTest{
	
	// Start at the same node and permutate the rest of the nodes, the trace of the nodes should
	// permute the same way
	Graph<String, DefaultEdge> g1 = 
            new DefaultDirectedGraph <String, DefaultEdge>(DefaultEdge.class);
    Graph<String, DefaultEdge> g2 = 
                  new DefaultDirectedGraph <String, DefaultEdge>(DefaultEdge.class);
    Random rnd = new Random();
    ArrayList <Integer> arrL = new ArrayList<Integer>();
    List<Integer> newList = new ArrayList<Integer>();

    @Test
    public void testCase1() {
        int listSize = rnd.nextInt(20)+3;
        for(int i = 0;i<listSize;i++) {
            arrL.add(rnd.nextInt(25));
        }
        List<Integer> newList = new ArrayList<Integer>();
        for(Integer num : arrL){
            if(!newList.contains(num)){
                newList.add(num);
            }
        }
//      Collections.shuffle(newList);
        Collections.sort(newList);
        System.out.println(newList.toString());
        for(int i =0; i<newList.size();i++) {
            g1.addVertex(Integer.toString(newList.get(i)));
            g2.addVertex(Integer.toString(newList.get(i)));
        }
        for(int i = 0;i<newList.size()-1;i++) {
            String node1 = Integer.toString(newList.get(i));
            String node2 = Integer.toString(newList.get(i+1));
            System.out.print("-------");
            System.out.println(node1);
            System.out.println(node2);
            System.out.println("++++");
            g1.addEdge(node1,node2);
            g2.addEdge(node2,node1);
        }
        ArrayList <String> trace1 = new ArrayList<String>();
        ArrayList <String> trace2 = new ArrayList<String>();
        System.out.println(newList.get(0));
        System.out.println(newList.get(newList.size()-1));
          GraphIterator<String, DefaultEdge> iterator1 = 
                  new DepthFirstIterator<String, DefaultEdge>(g1,Integer.toString(newList.get(0)));
//        System.out.println("++++");
          while (iterator1.hasNext()) {
              trace1.add(iterator1.next());
//            System.out.println(iterator1.next() );
          }
          System.out.println(trace1.toString());
          GraphIterator<String, DefaultEdge> iterator2 = 
                  new DepthFirstIterator<String, DefaultEdge>(g2,Integer.toString(newList.get(newList.size()-1)));
          System.out.print("-------");
          while (iterator2.hasNext()) {
              trace2.add(iterator2.next());
//            System.out.println( iterator2.next() );
          }
          System.out.println(trace2.toString());
          Collections.sort(trace2);
          assertEquals(trace1,trace2);
    }
	
}