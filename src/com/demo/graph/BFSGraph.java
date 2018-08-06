package com.demo.graph;

import java.util.LinkedList;

public class BFSGraph {
	
	int v;
	LinkedList<Integer> adjacencyList[];
	
	BFSGraph(int v){
		this.v=v;
		adjacencyList = new LinkedList[v];
		for(int i=0; i< v; i++) {
			adjacencyList[i]=new LinkedList<>();
		}
	}
	void addEdge(int v, int w) {
		adjacencyList[v].add(w);
	}
	
	void bfs(int src) {
		boolean visited[] = new boolean[v];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[src]=true;
		queue.add(src);
		while(!queue.isEmpty()) {
			int s = queue.poll();
			System.out.println(s+" ");
			for(Integer i: adjacencyList[s]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}

	public static void main(String[] args) {
		BFSGraph g = new BFSGraph(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.bfs(2);
	}
	

}
