package q4_isAGraphATree;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	List<Vertx> vertx;
	List<Edge> edges;
	List<Vertx> visited;
	
	Graph(){
		vertx = new ArrayList<Vertx>();
		edges = new ArrayList<Edge>();
	}
	
	public void addVertx(Vertx v) {
		vertx.add(v);
	}
	
	public void addEdge(Vertx v1, Vertx v2) {
		edges.add(new Edge(v1, v2));
	}
	
	public boolean isTree() {
//		if(vertx.size() - edges.size() != 1) {
//			return false;
//		}
		
		visited = new ArrayList<Vertx>();
		
		boolean isLoop = traverseNode(vertx.get(0), null);
		
		if(!isLoop) {
			return false;
		}
		
		if(visited.size() != vertx.size()) {
			return false;
		}
		
		return true;
	}
	
	public boolean traverseNode(Vertx v, Vertx parent) {
		if(visited.contains(v)) {
			return false;
		}
		boolean isLoop = true;
		visited.add(v);
		
		List<Vertx> neightbour = getNeighbours(v);
		
		for(Vertx n: neightbour) {
			if(n == parent) {
				continue;
			}
			else if(visited.contains(n)) {
				return false;
			}
			else {
				isLoop = traverseNode(n, v) && isLoop;
			}
		}
		return isLoop;
	}
	
	public List<Vertx> getNeighbours(Vertx v){
		List<Vertx> neightbour = new ArrayList<Vertx>();
		
		for(Edge e: edges) {
			if(e.v1.getValue() == v.getValue()) {
				neightbour.add(e.v2);
			}
			if(e.v2.getValue() == v.getValue()) {
				neightbour.add(e.v1);
			}
		}
		return neightbour;
	}
}
