package q5_shortestPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DijkstraShortestPaths {
	
	HashMap<Vertx, Integer> distances;
	HashMap<Vertx, Vertx> previous;
	List<Vertx> unsettled;
	List<Vertx> completed;
	Graph graph;
	
	public DijkstraShortestPaths(Graph g) {
		this.graph = g;
		distances = new HashMap<Vertx, Integer>();
		previous = new HashMap<Vertx, Vertx>();

		for(Vertx v: graph.getVertx()) {
			distances.put(v, Integer.MAX_VALUE);
		}
		
		unsettled = new ArrayList<Vertx>();
		completed = new ArrayList<Vertx>();
	}
	
	public int shortestPath(Vertx source, Vertx destination) {

		distances.replace(source, 0);
		unsettled.add(source);
		
		while(!unsettled.isEmpty()) {
			Vertx nextV = minimumDistanceOnTable();
			getDistances(nextV);
			completed.add(nextV);
			unsettled.remove(nextV);
		}
		
		Vertx v = destination;
		StringBuilder sb = new StringBuilder();
		
		while(previous.containsKey(v) ) {
		sb.append(v.getValue());
			sb.append(" > ");
			v = previous.get(v);
		}
		sb.append(source.getValue());
		
		System.out.println(sb.reverse().toString());
		return distances.get(destination);
	}

	
	public Vertx minimumDistanceOnTable() {
		int min = Integer.MAX_VALUE;
		Vertx minVertx = null;
		for(Vertx v : unsettled) {
			if(distances.get(v) <= min) {
				min = distances.get(v);
				minVertx = v;
			}
		}
		return minVertx;
	}
	
	public void getDistances(Vertx source) {		
		for(Edge e: graph.getEdges()) {
			Vertx nextVertx = null;
			Vertx sourceVertx = null;
			if(e.v1.getValue() == source.getValue()) {
				nextVertx = e.v2;
				sourceVertx = e.v1;
			}
			else if(e.v2.getValue() == source.getValue()) {
				nextVertx = e.v1;
				sourceVertx = e.v2;
			}
			else {
				continue;
			}
			if(completed.contains(nextVertx)) {
				continue;
			}
			else if(!unsettled.contains(nextVertx)) {
					unsettled.add(nextVertx);
			}
			
			int currentDistance = distances.get(nextVertx);
			
			int sourceDistance = distances.get(sourceVertx);
			
			int newDistance = e.getWeight() + sourceDistance;
			
			if(newDistance < currentDistance) {
				
				distances.replace(nextVertx, newDistance);
				previous.replace(nextVertx, sourceVertx);
	
			}
		}
	}
	
	public int getIndex(Vertx v) {
		return graph.getVertx().indexOf(v);
	}
	
}
