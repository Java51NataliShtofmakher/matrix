package telran.matrix.utils;

public class Matrix {
	public static int sum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
	}

	public static int[][] transp(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		int[][] transp = new int[columns][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				transp[j][i] = matrix[i][j];
			}
		}
		return transp;
	}

	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		// TODO Home Task 3 (***)
		return null;
	}

}
