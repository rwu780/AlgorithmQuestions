package q12_countTheNumberOfIsland;

import java.util.Arrays;

public class CountIsland {
	
	int row_size;
	int col_size;
	boolean[][] visited;
	
	
	public int count(int[][] matrix) {
		
		int count = 0;
		row_size = matrix.length;
		col_size = matrix[0].length;
		
		visited = new boolean[row_size][col_size];
		
		for(int i = 0; i< row_size; i++) {
			for (int j = 0; j < col_size; j++) {
				if(matrix[i][j] == 1 & !visited[i][j]) {
					count++;
					visitIsland(matrix, i, j);
				}
			}
		}
		
		return count;	
	}
	
	public void visitIsland(int[][] matrix, int row, int col) {
		
		for(int i = row - 1;  i <= row + 1; i++) {
			if(i < 0 || i >= row_size) {
				//Out of Bound
				continue;
			}
			for(int j = col - 1; j <= col + 1; j++) {	
				if(j < 0 || j >= col_size) {
					// Out of Bound
					continue;
				}
				
				if(matrix[i][j] == 0) {
					// No land
					continue;
				}
				
				if(matrix[i][j] == 1 && !visited[i][j]) {
					
					visited[i][j] = true;
					visitIsland(matrix, i, j);
				}
				
				
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		CountIsland ci = new CountIsland();
		
		int[][] matrix = {{1,0,0,1},{1,1,0,1}, {0,0,0,0},{1,1,0,1}};

		for (int[] i : matrix){
			System.out.println(Arrays.toString(i));
		}
		
		int count = ci.count(matrix);
		
		System.out.println("Number of Island: " + count);
		
		matrix = new int[][]{{0,0,0,1},{0,1,0,0}, {0,1,0,0},{1,1,0,1}};

		for (int[] i : matrix){
			System.out.println(Arrays.toString(i));
		}
		
		count = ci.count(matrix);
		
		System.out.println("Number of Island: " + count);
		
		matrix = new int[][]{{1,0,0,0},{0,1,0,0}, {0,0,1,0},{0,0,0,1}};

		for (int[] i : matrix){
			System.out.println(Arrays.toString(i));
		}
		
		count = ci.count(matrix);
		
		System.out.println("Number of Island: " + count);
	}

}
