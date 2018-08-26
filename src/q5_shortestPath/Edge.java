package q5_shortestPath;


public class Edge {
	Vertx v1;
	Vertx v2;
	int weight;
	
	Edge(Vertx v1, Vertx v2, int weight){
		this.v1 = v1;
		this.v2 = v2;
		this.weight = weight;
	}

	public Vertx getV1() {
		return v1;
	}

	public void setV1(Vertx v1) {
		this.v1 = v1;
	}

	public Vertx getV2() {
		return v2;
	}

	public void setV2(Vertx v2) {
		this.v2 = v2;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
