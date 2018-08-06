package com.demo.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopologicalSort {

	public static void main(String[] args) {
		Graph graph1 = new AdjacencySet(8, Graph.GraphType.DIRECTED);
        graph1.addEdge(2, 7);
        graph1.addEdge(0, 3);
        graph1.addEdge(0, 4);
        graph1.addEdge(0, 1);
        graph1.addEdge(2, 1);
        graph1.addEdge(1, 3);
        graph1.addEdge(3, 5);
        graph1.addEdge(3, 6);
        graph1.addEdge(4, 7);

        printList(sortList(graph1));
    }

    public static void printList(List<Integer> list) {
        for (int v : list) {
            System.out.println(v + ", ");
        }
    }
	
	static List<Integer> sortList(Graph g){
		List<Integer> sortedList = new ArrayList<Integer>();
		LinkedList<Integer> queue = new LinkedList<Integer>();
		Map<Integer, Integer> indegreeMap = new HashMap<>();
		
		for(int v=0; v < g.getNumberOfVertices(); v++) {
			int indegree = g.getIndegree(v);
			indegreeMap.put(v, indegree);
			if(indegree ==0) {
				queue.add(v);
			}
		}
		
		if(!queue.isEmpty()) {
			int lastElem = queue.pollLast();
			sortedList.add(lastElem);
			
			for(int adjacentVertex:g.getAdjacentVertices(lastElem)) {
				int updateIndegree = indegreeMap.get(adjacentVertex)-1;
				indegreeMap.remove(lastElem);
				indegreeMap.put(adjacentVertex, updateIndegree);
				if(updateIndegree == 0) {
					queue.add(updateIndegree);
				}
			}
			if (sortedList.size() != g.getNumberOfVertices()) {
	            throw new RuntimeException("The Graph had a cycle!");
	        }
			
		}
		return sortedList;
	}

}
