// This is a mutant program.
// Author : ysma

import java.io.*;
import java.util.*;


public class BFSGraph
{

    private int V;

    private java.util.LinkedList<Integer>[] adj;

    java.util.ArrayList<Integer> trace = new java.util.ArrayList<Integer>( 0 );

    public BFSGraph( int v )
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
        adj[v].add( w );
    }

    public  void BFS( int s )
    {
        boolean[] visited = new boolean[V];
        java.util.LinkedList<Integer> queue = new java.util.LinkedList<Integer>();
        visited[s] = true;
        queue.add( s-- );
        while (queue.size() != 0) {
            s = queue.poll();
            trace.add( s );
            java.util.Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add( n );
                }
            }
        }
    }

}
