package telran.matrix.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.matrix.utils.Matrix;

class MatrixTest {
	int[][] matrix1 = { { 1, 2, 3 } };// 1 x 3
	int[][] matrix2 = { { 1 }, { 2 }, { 3 } }; // 3 x 1

	@Test
	void testSum() {
		assertEquals(6, Matrix.sum(matrix1));
		assertEquals(6, Matrix.sum(matrix2));
	}

	@Test
	void testTransp() {
		assertArrayEquals(matrix2, Matrix.transp(matrix1));
	}

	@Test
	void testMultiply() {
		int[][] expected = { { 14 } };
		assertArrayEquals(expected, Matrix.multiply(matrix1, matrix2));
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arr2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		expected = new int[][] { { 22, 28 }, { 49, 64 } };
		assertArrayEquals(expected, Matrix.multiply(arr1, arr2));
	}

}
