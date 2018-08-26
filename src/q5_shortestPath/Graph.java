package q5_shortestPath;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	List<Vertx> vertx;
	List<Edge> edges;
	int[] distnaces;
	
	Graph(){
		vertx = new ArrayList<Vertx>();
		edges = new ArrayList<Edge>();
	}
	
	public void addVertx(Vertx v) {
		vertx.add(v);
	}
	
	public void addEdge(Vertx v1, Vertx v2, int weight) {
		edges.add(new Edge(v1, v2, weight));
	}
	
	public int shortestPath(Vertx source, Vertx destination) {
		DijkstraShortestPaths dsp = new DijkstraShortestPaths(this);
		return dsp.shortestPath(source, destination);
		
	}

	public List<Vertx> getVertx() {
		return vertx;
	}

	public void setVertx(List<Vertx> vertx) {
		this.vertx = vertx;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public int[] getDistnaces() {
		return distnaces;
	}

	public void setDistnaces(int[] distnaces) {
		this.distnaces = distnaces;
	}

	
}
