package algorithmQuestions;

import java.util.Arrays;

public class Q12 {
	
	int ROW_SIZE;
	int COL_SIZE;
	
	boolean[][] visited;
	int[][] matrix;
	
	public void visitIsland(int[][] matrix, int row, int col){
				
		for(int i = row - 1; i <= row+1; i++){
			if(i < 0 || i >= ROW_SIZE){
				continue;
			}
			for(int j = col - 1; j <= col + 1; j++){
				if(j < 0 || j >= COL_SIZE){
					continue;
				}
				if(matrix[i][j] == 0){
					// No land
					continue;
				}
				if(matrix[i][j] == 1 && !visited[i][j]){
					
					visited[i][j] = true;
					visitIsland(matrix, i, j);
				}
			}
		}	
	}
	
	public int countIslands(int[][] matrix){
		int count = 0;
		ROW_SIZE = matrix.length;
		COL_SIZE = matrix[0].length;
		
		visited = new boolean[ROW_SIZE][COL_SIZE];
		
		for (int i = 0; i < ROW_SIZE; i++) {
			for (int j = 0; j < COL_SIZE; j++) {
				if(matrix[i][j] == 1 && !visited[i][j]){
					count++;
					visitIsland(matrix, i, j);
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Q12 q12 = new Q12();
		
		int[][] matrix = {{1,0,0,1},{1,1,0,1}, {0,0,0,0},{1,1,0,1}};

		for (int[] i : matrix){
			System.out.println(Arrays.toString(i));
		}
		
		int count = q12.countIslands(matrix);
		
		System.out.println("Number of Island: " + count);
		
		matrix = new int[][]{{0,0,0,1},{0,1,0,0}, {0,1,0,0},{1,1,0,1}};

		for (int[] i : matrix){
			System.out.println(Arrays.toString(i));
		}
		
		count = q12.countIslands(matrix);
		
		System.out.println("Number of Island: " + count);
		
		matrix = new int[][]{{1,0,0,0},{0,1,0,0}, {0,0,1,0},{0,0,0,1}};

		for (int[] i : matrix){
			System.out.println(Arrays.toString(i));
		}
		
		count = q12.countIslands(matrix);
		
		System.out.println("Number of Island: " + count);
	}
}
