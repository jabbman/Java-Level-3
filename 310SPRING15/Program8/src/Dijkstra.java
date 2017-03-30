
import java.util.*;

public class Dijkstra { 
	
	public Dijkstra( Vertex ){
		Vertex A = new Vertex("A");
	    Vertex B = new Vertex("B");
	    Vertex F = new Vertex("F");
	    Vertex G = new Vertex("G");
	    Vertex D = new Vertex("D");
	    Vertex C = new Vertex("C");
	    Vertex E = new Vertex("E");

	    // set the edges and weight
	    A.adjacencies = new Edge[]{ new Edge(B, 2) };
	    B.adjacencies = new Edge[]{ new Edge(F, 3) };
	    F.adjacencies = new Edge[]{ new Edge(G, 1) };
	    G.adjacencies = new Edge[]{ new Edge(D, 5) };
	    D.adjacencies = new Edge[]{ new Edge(C, 3) };
	    C.adjacencies = new Edge[]{ new Edge(E, 4) };
	    E.adjacencies = new Edge[]{ new Edge(D, 10) };

class Vertex implements Comparable<Vertex1>
{
    public final String name;
    public Edge[] adjacencies;
    public double minimumDistance = Double.POSITIVE_INFINITY;
    public Vertex1 previous;
    public Vertex(String argName) { name = argName; }
    public String toString() { return name; }
    public int compareTo(Vertex new1)
    {
        return Double.compare(minimumDistance, new1.minimumDistance);
    }

		  public void Dijkstra (Vertex1 source)
		    {
		        source.minimumDistance = 0.;
		        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
		    vertexQueue.addAll(source);

		    while (!vertexQueue.isEmpty()) {
		        Vertex1 u = vertexQueue.poll();

		            
		    for (Edge ed : u.adjacencies)
		            {
		         Vertex1 v1 = ed.target;
		      double weight = ed.weight;
		     double distanceThroughU = u.minimumDistance + weight;
		      if (distanceThroughU < v1.minimumDistance) {
		        vertexQueue.remove(v1);

		              v1.minimumDistance = distanceThrough ;
		            v1.prev = a;
		                vertexQueue.add(v1);
		            }
		         }
		     }
		  }
		
	}

    {
        return Double.compare(minimumDistance, other.minimumDistance);
    }



public class Edge
{
    public final Vertex1 target;
    public final double weight;
    public Edge(Vertex1 argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}

public class Vertex{
	
}
}


