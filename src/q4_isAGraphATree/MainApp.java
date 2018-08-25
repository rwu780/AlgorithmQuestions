package q4_isAGraphATree;

public class MainApp {
	public static void main(String[] args) {
		Graph g = new Graph();
		
		Vertx v0 = new Vertx(0);
		Vertx v1 = new Vertx(1);
		Vertx v2 = new Vertx(2);
		Vertx v3 = new Vertx(3);
		Vertx v4 = new Vertx(4);
		
		g.addVertx(v0);
		g.addVertx(v1);
		g.addVertx(v2);
		g.addVertx(v3);
		g.addVertx(v4);
		
		g.addEdge(v0, v1);
		g.addEdge(v0, v2);
//		g.addEdge(v0, v4);
		g.addEdge(v0, v3);
//		g.addEdge(v3, v4);
//		g.addEdge(v2, v3);
		g.addEdge(v3, v4);
		
		System.out.println("Is this graph a tree? " + g.isTree());
		

	}

}
