package com.demo.graph;

import java.util.List;

public interface Graph {
	
	void addEdge(int v1, int v2);
	int getNumberOfVertices();
	List<Integer> getAdjacentVertices(int v);
	enum GraphType {
		DIRECTED, UNDIRETCED
	}
	int getIndegree(int v);
	
}
