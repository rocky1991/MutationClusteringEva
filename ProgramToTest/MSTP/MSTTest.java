// package com.hongchuan.app;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class MSTTest{
	Random rand = new Random();
	public static int [][] genArr2D(){
		Random rand = new Random();
		int size = rand.nextInt(60)+2;
		int graph[][] = new int [size][size];
		
		for(int i = 0; i<size;i++) {
			for(int j=i+1;j<size;j++) {
				graph[i][j] = rand.nextInt(100);
				graph[j][i] = rand.nextInt(100);
			}
		}
		return graph;
	}
	@Test
	public void testCase2(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
	@Test
	public void testCase3(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 	
	@Test
	public void testCase4(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    }
    @Test
	public void testCase5(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase6(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase7(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase8(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase9(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase10(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase11(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase12(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    }
    @Test
	public void testCase13(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    }
    @Test
	public void testCase14(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 	
    @Test
	public void testCase15(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase16(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase17(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase18(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase19(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase20(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase21(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase22(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 	
    @Test
	public void testCase23(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase24(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 	
    @Test
	public void testCase25(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase26(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 	
    @Test
	public void testCase27(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase28(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase29(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase30(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase31(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase32(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    }
    @Test
	public void testCase33(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 	
    @Test
	public void testCase34(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase35(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase36(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase37(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase38(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 	
    @Test
	public void testCase39(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase40(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase41(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 	
    @Test
	public void testCase42(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase43(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase44(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 	
    @Test
	public void testCase45(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 	
    @Test
	public void testCase46(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 	
    @Test
	public void testCase47(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase48(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase49(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
    @Test
	public void testCase50(){
        MST t1 = new MST(); 
        int[][] graph1 = genArr2D();
        int size = graph1[1].length;

         // Print the solution 
        t1.primMST(graph1,size); 
        
        int w1 = t1.getTotalW();
        
        MST t2 = new MST();
        int scale = rand.nextInt(10)+1;
        int graph2[][] = graph1;
        for(int i = 0;i <size;i++) {
        	for(int j =0; j<size;j++) {
        		graph2[i][j] *= scale;
        	}
        }
        t2.primMST(graph2,size); 
        int w2 = t2.getTotalW();
        assertEquals(scale*w1,w2);
    } 
//	@Test
//	public void testCase2(){
//        MST t1 = new MST(); 
//        int[][] graph1 = genArr2D();
//        int size = graph1[1].length;
//
//        t1.primMST(graph1,size); 
//        
//        int w1 = t1.getTotalW();
//        
//        MST t2 = new MST();
//        int offset = rand.nextInt(10)+2;
//        int graph2[][] = graph1;
//
//        for(int i = 0;i <size;i++) {
//        	for(int j =0; j<size;j++) {
//        		graph2[i][j] += offset;
//        	}
//        }
//        System.out.println(Arrays.deepToString(graph2));
//        t2.primMST(graph2,size); 
//        
//        int w2 = t2.getTotalW();
//        System.out.println(t2.V);
//        assertEquals(w1+offset*(t2.getMstSize()-1),w2);
//    } 
}