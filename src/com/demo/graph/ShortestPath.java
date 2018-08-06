package com.demo.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class ShortestPath {
	public Map<Integer, DistanceInfo> buildDistanceTable(Graph graph, int source){
		Map<Integer, DistanceInfo> distanceTable = new HashMap<>();
		for(int i =0; i < graph.getNumberOfVertices(); i++) {
			distanceTable.put(i, new DistanceInfo());
		}
		distanceTable.get(source).setDistance(0);
		distanceTable.get(source).setLastVertex(source);
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(source);
		while(!queue.isEmpty()) {
			int currentVertex = queue.pollFirst();
			for(int i : graph.getAdjacentVertices(currentVertex)) {
				int currentDistance = distanceTable.get(i).getDistance();
				if(currentDistance == -1) {
					currentDistance = 1+distanceTable.get(currentVertex).getDistance();
					distanceTable.get(i).setDistance(currentDistance);
					distanceTable.get(i).setLastVertex(currentVertex);
					if(!graph.getAdjacentVertices(i).isEmpty()) {
						queue.add(i);
					}
				}
			}
			
		}
		return distanceTable;
	}

	public void shortestPath(Graph graph, int source, int destination) {
		Map<Integer, DistanceInfo> distanceTable = buildDistanceTable(graph, source);
		
		Stack<Integer> stack = new Stack<>();
		stack.push(destination);
		int previousVertex = distanceTable.get(destination).getLastVertex();
		while(previousVertex != -1 && previousVertex != source) {
			stack.push(previousVertex);
			previousVertex = distanceTable.get(previousVertex).getLastVertex();
		}
		if(previousVertex == -1) {
			System.out.println("there is no path from "+ source +"to"+ destination);
		}else 
		{
			while(!stack.isEmpty()) {
				System.out.println("->"+stack.pop());
				
			}
			System.out.println("shortest path done");
		}
		
		
	}
}
