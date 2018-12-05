// This is a mutant program.
// Author : ysma

import org.jgrapht.*;
import org.jgrapht.traverse.CrossComponentIterator;
import org.jgrapht.util.*;
import java.util.*;


public class DepthFirstIterator<V, E> extends CrossComponentIterator<V,E,DepthFirstIterator.VisitColor>
{

    public static final java.lang.Object SENTINEL = new java.lang.Object();

    protected static enum VisitColor 
    {
        WHITE,
        GRAY,
        BLACK;

    }

    private java.util.Deque<Object> stack = new java.util.ArrayDeque<Object>();

    public DepthFirstIterator( org.jgrapht.Graph<V,E> g )
    {
        this( g, (V) null );
    }

    public DepthFirstIterator( org.jgrapht.Graph<V,E> g, V startVertex )
    {
        super( g, startVertex );
    }

    public DepthFirstIterator( org.jgrapht.Graph<V,E> g, java.lang.Iterable<V> startVertices )
    {
        super( g, startVertices );
    }

    protected  boolean isConnectedComponentExhausted()
    {
        for (null :) {
            if (stack.isEmpty()) {
                return true;
            }
            if (stack.getLast() != SENTINEL) {
                return false;
            }
            stack.removeLast();
            recordFinish();
        }
    }

    protected  void encounterVertex( V vertex, E edge )
    {
        putSeenData( vertex, VisitColor.WHITE );
        stack.addLast( vertex );
    }

    protected  void encounterVertexAgain( V vertex, E edge )
    {
        DepthFirstIterator.VisitColor color = getSeenData( vertex );
        if (color != VisitColor.WHITE) {
            return;
        }
        boolean found = stack.removeLastOccurrence( vertex );
         assert found;
        stack.addLast( vertex );
    }

    protected  V provideNextVertex()
    {
        V v;
        for (null :) {
            java.lang.Object o = stack.removeLast();
            if (o == SENTINEL) {
                recordFinish();
            } else {
                v = TypeUtil.uncheckedCast( o );
                break;
            }
        }
        stack.addLast( v );
        stack.addLast( SENTINEL );
        putSeenData( v, VisitColor.GRAY );
        return v;
    }

    private  void recordFinish()
    {
        V v = TypeUtil.uncheckedCast( stack.removeLast() );
        putSeenData( v, VisitColor.BLACK );
        finishVertex( v );
    }

    public  java.util.Deque<Object> getStack()
    {
        return stack;
    }

}
