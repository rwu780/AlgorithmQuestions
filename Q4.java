package algorithmQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Q4 {
	
	List<Vertx> vertices;
	List<Edge> edges;
	
	Q4(){
		vertices = new ArrayList<Vertx>();
		edges = new ArrayList<Edge>();
	}
	
	public void createGraph(){

		Vertx v0 = new Vertx(0);
		vertices.add(v0);
		Vertx v1 = new Vertx(1);
		vertices.add(v1);
		Vertx v2 = new Vertx(2);
		vertices.add(v2);
		Vertx v3 = new Vertx(3);
		vertices.add(v3);
		Vertx v4 = new Vertx(4);
		vertices.add(v4);
		
		edges.add(new Edge(v0, v1));
		edges.add(new Edge(v0, v4));
//		edges.add(new Edge(v1, v4));
		edges.add(new Edge(v1, v3));
		edges.add(new Edge(v1, v2));
//		edges.add(new Edge(v2, v3));
//		edges.add(new Edge(v3, v4));
	}
	
	public boolean isTree(){
		if(vertices.size() - edges.size() != 1){
			return false;
		}
		
//		// Check is all connect
//		List<Vertx> connected = new ArrayList<Vertx>();
//		
//		
//		connected.add(vertices.get(0));
//		for(Vertx v : connected){
//			for(Edge ed: edges){
//				if(ed.v1 == v && !connected.contains(ed.v2)){
//					connected.add(ed.v2);
//				}
//				else if (ed.v2 == v && !connected.contains(ed.v1)){
//					connected.add(ed.v1);
//				}
//			}
//		}
//		if (connected.size() != vertices.size()){
//			return false;
//		}
		return true;
	}
	
	public static void main(String[] args) {
		Q4 q4 = new Q4();
		q4.createGraph();
		
		System.out.println("Is graph a tree? " + q4.isTree());
	}
	
	private class Vertx{
		int value;
		
		Vertx (int value){
			this.value = value;
		}
	}
	
	private class Edge{
		Vertx v1;
		Vertx v2;
		
		Edge(Vertx v1, Vertx v2){
			this.v1 = v1;
			this.v2 = v2;
		}
	}
}
