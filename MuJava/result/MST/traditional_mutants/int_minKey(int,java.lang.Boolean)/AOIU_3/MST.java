// This is a mutant program.
// Author : ysma

import java.util.*;
import java.lang.*;
import java.io.*;


public class MST
{

    public int V;

    private int totalW = 0;

    private int mst_size = 0;

    public  int minKey( int[] key, java.lang.Boolean[] mstSet )
    {
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        for (int v = 0; v < -V; v++) {
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }
        }
        return min_index;
    }

    public  int getMstSize()
    {
        return mst_size;
    }

    public  void setMstSize( int a )
    {
        this.mst_size = a;
    }

    public  void printMST( int[] parent, int n, int[][] graph )
    {
        this.totalW = 0;
        System.out.println( "Edge \tWeight" );
        for (int i = 1; i < V; i++) {
            this.totalW += graph[i][parent[i]];
        }
    }

    public  int getTotalW()
    {
        return totalW;
    }

    public  void primMST( int[][] graph, int V )
    {
        this.V = V;
        int[] parent = new int[V];
        int[] key = new int[V];
        java.lang.Boolean[] mstSet = new java.lang.Boolean[V];
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
        key[0] = 0;
        parent[0] = -1;
        for (int count = 0; count < V - 1; count++) {
            int u = minKey( key, mstSet );
            mstSet[u] = true;
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }
        setMstSize( parent.length );
        printMST( parent, V, graph );
    }

}
