package prakPemograman;

public class GraphMain {
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		
		
		// add vertex
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		// add edge
		graph.addEdge(0, 1);
		graph.addEdge(1, 4);
		graph.addEdge(3, 1);
		graph.addEdge(4, 0);
		graph.adjacencyMatrix();
		System.out.println();
		
		
		// ini yg ada dilatihan pdf

		// add vertex
//		graph.addVertex('A');
//		graph.addVertex('B');
//		graph.addVertex('C');
//		graph.addVertex('D');
//		graph.addVertex('E');
//		// add edge
//		graph.addEdge(0, 1);
//		graph.addEdge(1, 2);
//		graph.addEdge(0, 3);
//		graph.addEdge(3, 4);
//		graph.adjacencyMatrix();
//		System.out.println();
		
	}
}
