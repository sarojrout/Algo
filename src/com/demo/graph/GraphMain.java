package com.demo.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GraphMain {
	static class Graph {
		int v;
		List<Integer>[] adjacenyList;
		
		Graph(int v){
			this.v=v;
			this.adjacenyList = new LinkedList[v];
			for(int i=0; i< v; i++) {
				adjacenyList[i] = new LinkedList<>();
			}
		}
	}
	static void addEdge(Graph g, int src, int dest) {
		g.adjacenyList[src].add(dest);
		g.adjacenyList[dest].add(src);
	}
	
	static void printGraph(Graph g) {
		for(int v=0; v<g.v;v++) {
			System.out.println("adjacency list of vertex::"+v);
			System.out.println("head");
			for(Integer crawl: g.adjacenyList[v]) {
				System.out.println("->"+crawl);
			}
		}
	}
	public static void main(String[] args) {
		int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
      
        // print the adjacency list representation of 
        // the above graph
        printGraph(graph);

	}

}
