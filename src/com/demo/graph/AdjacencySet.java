package com.demo.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class AdjacencySet implements Graph{

//	public static void main(String[] args) {
//
//	}
//	private List<Node> vertexList = new ArrayList<>() ;
	int vertextId;
	List<Node> vertexList = new ArrayList<>();
	int noOfVertices=0;
	private GraphType graphType = GraphType.DIRECTED;
	public AdjacencySet(int noOfVertices, GraphType graphType) {
		this.noOfVertices = noOfVertices;
		this.graphType = graphType;
		for(int i=0; i< noOfVertices; i++) {
			vertexList.add(new Node(i));
		}
	}
	@Override
	public void addEdge(int v1, int v2) {
		if(v1 >= noOfVertices || v1 <0 || v2 >=noOfVertices || v2 <0) {
			throw new IllegalArgumentException("vertex not valid");
		}
		vertexList.get(v1).addEdge(v2);
		if(graphType == GraphType.UNDIRETCED) {
			vertexList.get(v2).addEdge(v1);
		}
		
	}

	@Override
	public List<Integer> getAdjacentVertices(int v) {
		if(v >= noOfVertices || v < 0) {
			throw new IllegalArgumentException("invalid vertex number");
		}
		return vertexList.get(v).getNoOfVertices();
	}
	
	
	
	static class Node {
		int vertexNumber;
		Set<Integer> noOfVertices;
		Node(int vertex){
			this.vertexNumber = vertex;
		}
		public int getVertexNumber() {
			return vertexNumber;
		}

		public List<Integer> getNoOfVertices() {
			List<Integer> list = new ArrayList<Integer>();
			Collections.sort(list);
			return list;
		}	
		
		void addEdge(int v) {
			noOfVertices.add(v);
		}
		
	}

	@Override
	public int getNumberOfVertices() {
		int count =0;
		for(int i=0; i<noOfVertices; i++) {
			count++;
		}
		return count;
	}

	public int getIndegree(int v) {
		int indegree =0;
		for(int i=0; i< noOfVertices; i++) {
			if(getAdjacentVertices(i).contains(v)) {
				indegree++;
			}
		}
		return indegree;
	}

}
