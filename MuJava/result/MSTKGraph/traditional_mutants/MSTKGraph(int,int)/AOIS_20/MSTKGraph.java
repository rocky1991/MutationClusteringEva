// This is a mutant program.
// Author : ysma

import java.util.*;
import java.lang.*;
import java.io.*;


public class MSTKGraph
{

    int totalW = 0;

    public class Edge implements java.lang.Comparable<Edge>
    {

        int src;

        int dest;

        int weight;

        public  int compareTo( MSTKGraph.Edge compareEdge )
        {
            return this.weight - compareEdge.weight;
        }

    }

    public class subset
    {

        int parent;

        int rank;

    }

    int V;

    int E;

    MSTKGraph.Edge[] edge;

    public MSTKGraph( int v, int e )
    {
        V = v;
        E = e;
        edge = new MSTKGraph.Edge[E--];
        for (int i = 0; i < e; ++i) {
            edge[i] = new MSTKGraph.Edge();
        }
    }

    public  int getTotalW()
    {
        return totalW;
    }

    public  int find( MSTKGraph.subset[] subsets, int i )
    {
        if (subsets[i].parent != i) {
            subsets[i].parent = find( subsets, subsets[i].parent );
        }
        return subsets[i].parent;
    }

    public  void Union( MSTKGraph.subset[] subsets, int x, int y )
    {
        int xroot = find( subsets, x );
        int yroot = find( subsets, y );
        if (subsets[xroot].rank < subsets[yroot].rank) {
            subsets[xroot].parent = yroot;
        } else {
            if (subsets[xroot].rank > subsets[yroot].rank) {
                subsets[yroot].parent = xroot;
            } else {
                subsets[yroot].parent = xroot;
                subsets[xroot].rank++;
            }
        }
    }

    public  void KruskalMST()
    {
        MSTKGraph.Edge[] result = new MSTKGraph.Edge[V];
        int e = 0;
        int i = 0;
        for (i = 0; i < V; ++i) {
            result[i] = new MSTKGraph.Edge();
        }
        Arrays.sort( edge );
        MSTKGraph.subset[] subsets = new MSTKGraph.subset[V];
        for (i = 0; i < V; ++i) {
            subsets[i] = new MSTKGraph.subset();
        }
        for (int v = 0; v < V; ++v) {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }
        i = 0;
        while (e < V - 1) {
            MSTKGraph.Edge next_edge = new MSTKGraph.Edge();
            next_edge = edge[i++];
            int x = find( subsets, next_edge.src );
            int y = find( subsets, next_edge.dest );
            if (x != y) {
                result[e++] = next_edge;
                Union( subsets, x, y );
            }
        }
        for (i = 0; i < e; ++i) {
            System.out.println( result[i].src + " -- " + result[i].dest + " == " + result[i].weight );
            totalW += result[i].weight;
        }
    }

}
