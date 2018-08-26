package q5_shortestPath;

public class MainApp {

	public static void main(String[] args) {
		Vertx v1 = new Vertx(1);
		Vertx v2 = new Vertx(2);
		Vertx v3 = new Vertx(3);
		Vertx v4 = new Vertx(4);
		Vertx v5 = new Vertx(5);
		Vertx v6 = new Vertx(6);
		Vertx v7 = new Vertx(7);
		
		Graph g = new Graph();
		g.addVertx(v1);
		g.addVertx(v2);
		g.addVertx(v3);
		g.addVertx(v4);
		g.addVertx(v5);
		g.addVertx(v6);
		g.addVertx(v7);
		
		g.addEdge(v1, v2, 5);
		g.addEdge(v1, v3, 10);
		g.addEdge(v2, v4, 6);
		g.addEdge(v2, v5, 3);
		g.addEdge(v3, v5, 2);
		g.addEdge(v4, v5, 2);
		g.addEdge(v4, v6, 6);
		g.addEdge(v5, v7, 2);
		g.addEdge(v6, v7, 2);
		
		int distance = g.shortestPath(v1, v4);
		
		System.out.println("The minimum distance is: " + distance);
	}
}
