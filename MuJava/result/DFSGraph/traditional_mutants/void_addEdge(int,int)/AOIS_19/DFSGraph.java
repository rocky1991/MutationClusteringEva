// This is a mutant program.
// Author : ysma

import java.io.*;
import java.util.*;


public class DFSGraph
{

    private int V;

    private java.util.LinkedList<Integer>[] adj;

    java.util.ArrayList<Integer> trace = new java.util.ArrayList<Integer>( 0 );

    public DFSGraph( int v )
    {
        V = v;
        adj = new java.util.LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new java.util.LinkedList();
        }
    }

    public  java.util.ArrayList<Integer> getTrace()
    {
        return trace;
    }

    public  void addEdge( int v, int w )
    {
        adj[v].add( w++ );
    }

    public  void DFSUtil( int v, boolean[] visited )
    {
        visited[v] = true;
        trace.add( v );
        java.util.Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil( n, visited );
            }
        }
    }

    public  void DFS( int v )
    {
        boolean[] visited = new boolean[V];
        DFSUtil( v, visited );
    }

}
