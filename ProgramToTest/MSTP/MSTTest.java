// package com.hongchuan.app;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
public class MSTTest{
	
	// Weights multiply by a constant, minimum spanning tree total weight should scale the same
	@Test
	public void testCase1(){
        MST t1 = new MST(); 
        int graph1[][] = new int[][] {{0, 2, 0, 6, 0}, 
                                     {2, 0, 3, 8, 5}, 
                                     {0, 3, 0, 0, 7}, 
                                     {6, 8, 0, 0, 9}, 
                                     {0, 5, 7, 9, 0}}; 
         // Print the solution 
        t1.primMST(graph1); 
        int w1 = t1.getTotalW();
        MST t2 = new MST(); 
        int graph2[][] = new int[][] {{0, 2, 0, 6, 0}, 
                                     {2, 0, 3, 8, 5}, 
                                     {0, 3, 0, 0, 7}, 
                                     {6, 8, 0, 0, 9}, 
                                     {0, 5, 7, 9, 0}}; 
        int k = 2;
        for(int i =0; i< graph2.length;i++){
            for(int j= 0;j<graph2[0].length;j++){
                graph2[i][j] *= k;
            }
        }
        t2.primMST(graph2); 
        int w2 = t2.getTotalW();
        
        assertEquals(k*w1,w2);

    } 
        // Weights multiply by a constant, minimum spanning tree total weight should scale the same
    @Test
    public void testCase2(){
        MST t1 = new MST(); 
        int graph1[][] = new int[][] {{0, 2, 0, 6, 0}, 
                                     {2, 0, 3, 8, 5}, 
                                     {0, 3, 0, 0, 7}, 
                                     {6, 8, 0, 0, 9}, 
                                     {0, 5, 7, 9, 0}}; 
         // Print the solution 
        t1.primMST(graph1); 
        int w1 = t1.getTotalW();
        MST t2 = new MST(); 
        int graph2[][] = new int[][] {{0, 0, 5, 7, 9}, 
                                     {0, 0, 2, 6, 0}, 
                                     {5, 2, 0, 8, 3}, 
                                     {7, 6, 8, 0, 0}, 
                                     {9, 0, 3, 0, 0}}; 
        // int k = 2;
        // for(int i =0; i< graph2.length;i++){
        //     for(int j= 0;j<graph2[0].length;j++){
        //         graph2[i][j] += k;
        //     }
        // }
        t2.primMST(graph2); 
        int w2 = t2.getTotalW();
        
        assertEquals(w1,w2);

    } 

}