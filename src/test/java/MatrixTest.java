import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTest {

    Matrix matrixObject;

    @BeforeEach
    void setUp() {
        matrixObject = new Matrix();
    }

    @AfterEach
    void tearDown() {
        matrixObject = null;
    }

    // Tests for isSquareMatrix method

    @Test
    void isMatrixNull() {
        int[][] newMatrix = null;
        assertFalse(matrixObject.isSquareMatrix(newMatrix));
    }

    @Test
    void isMatrixLengthZero() {
        int[][] newMatrix = new int[0][0];
        assertFalse(matrixObject.isSquareMatrix(newMatrix));
    }

    @Test
    void isMatrixRagged() {
        int[][] newMatrix = new int[][]{{0, 1, 2}, {0, 1}, {0, 1, 2}};
        assertFalse(matrixObject.isSquareMatrix(newMatrix));
    }

    @Test
    void isMatrixSquare() {
        int[][] newMatrix = new int[][]{{0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        assertTrue(matrixObject.isSquareMatrix(newMatrix));
    }

    // Tests for arrayCheck method

    @Test
    void isArrayLengthZero() {
        int[] arr = new int[0];
        assertFalse(matrixObject.arrayCheck(arr));
    }

    @Test
    void isNullArray() {
        int[] arr = null;
        assertFalse(matrixObject.arrayCheck(arr));
    }

    @Test
    void isArrayValid() {
        int[] arr = new int[]{123, 124, 2224, 111, 12};
        assertTrue(matrixObject.arrayCheck(arr));
    }

    // Tests for averageArrayElements method

    @Test
    void averageArrayElements1() {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        assertEquals(2.0, matrixObject.averageArrayElements(arr));
    }

    @Test
    void averageArrayElements2() {
        int[] arr = new int[]{2, 2, 2, 2};
        assertEquals(2.0, matrixObject.averageArrayElements(arr));
    }

}