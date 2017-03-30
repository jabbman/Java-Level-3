/**
 * COSC 310		Assignment 8
 * Prog8.java
 * 4/28/15
 * A client class that Simulates Dijkstras algorithm for 
 * the shortest path on a graph based on weighed values *
 *@J
 */

import java.util.*;
public class Prog8 { // client program

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
        // mark all the vertices 
        
        Dijkstra dij = new Dijkstra ();
		dij.run();

        computePaths(A); // run Dijkstra
        System.out.println("Distance to " + E + ": " + E.minDistance);
        List<Vertex> path = getShortestPathTo(E);
        System.out.println("Path: " + path);

		
	}

}

