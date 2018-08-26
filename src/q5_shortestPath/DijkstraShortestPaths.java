package q5_shortestPath;

import java.util.ArrayList;
import java.util.List;

public class DijkstraShortestPaths {
	
	int[] distances;
	Vertx[] previous;
	List<Vertx> unsettled;
	List<Vertx> completed;
	Graph graph;
	
	public DijkstraShortestPaths(Graph g) {
		this.graph = g;
		int sizes = g.getVertx().size();
		distances = new int[sizes];
		previous = new Vertx[sizes];
		for (int i = 0; i < distances.length; i++) {
			distances[i] = Integer.MAX_VALUE;
		}
		
		unsettled = new ArrayList<Vertx>();
		completed = new ArrayList<Vertx>();
	}
	
	public int shortestPath(Vertx source, Vertx destination) {
		int desIndex = getIndex(destination);
		int sourceIndex = getIndex(source);
		
		distances[sourceIndex] = 0;
		unsettled.add(source);
		
		while(!unsettled.isEmpty()) {
			Vertx nextV = minimumDistanceOnTable();
			getDistances(nextV);
			completed.add(nextV);
			unsettled.remove(nextV);
		}
		
		Vertx v = destination;
		StringBuilder sb = new StringBuilder();
		
		while(previous[getIndex(v)] != null) {
			sb.append(v.getValue());
			sb.append(" > ");
			v = previous[getIndex(v)];	
		}
		sb.append(source.getValue());
		
		System.out.println(sb.reverse().toString());
		return distances[desIndex];
	}

	
	public Vertx minimumDistanceOnTable() {
		int min = Integer.MAX_VALUE;
		Vertx minVertx = null;
		for(Vertx v : unsettled) {
			int index = getIndex(v);
			if(distances[index] <= min) {
				min = distances[index];
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
			
			int currentIndex = getIndex(nextVertx);
			int currentDistance = distances[currentIndex];
			
			int sourceIndex = getIndex(sourceVertx);
			int sourceDistnace = distances[sourceIndex];
			
			int newDistance = e.getWeight() + sourceDistnace;
			
			if(newDistance < currentDistance) {
				
				distances[currentIndex] = newDistance;
				previous[currentIndex] = sourceVertx;
	
			}
		}
	}
	
	public int getIndex(Vertx v) {
		return graph.getVertx().indexOf(v);
	}
	
}
