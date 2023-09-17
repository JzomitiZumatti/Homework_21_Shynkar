import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTest {

    Matrix matrixObject;

    static Stream<Object[]> arrayStream1() {
        return Stream.of(new Object[]{new int[][]{{0, 1, 2}, {0, 1}, {0, 1, 2}}},
                new Object[]{new int[][]{{0, 1}, {0, 1, 2}, {0, 1, 2}}},
                new Object[]{new int[][]{{0, 1, 2}, {0, 1, 2}, {0, 1}}},
                new Object[]{new int[][]{{0, 1}, {0, 1}, {0, 1}}},
                new Object[]{new int[][]{{1}, {1}, {1}}});
    }

    static Stream<Object[]> arrayStream2() {
        return Stream.of(new Object[]{new int[]{0}},
                new Object[]{new int[]{0, 1}},
                new Object[]{new int[]{0, 1, 2}},
                new Object[]{new int[]{0, 1, 2, 3}},
                new Object[]{new int[]{0, 1, 2, 3, 4}},
                new Object[]{new int[]{123, 124, 2224, 111, 12}});
    }

    @BeforeEach
    void setUp() {
        matrixObject = new Matrix();
    }

    @AfterEach
    void tearDown() {
        matrixObject = null;
    }

    // Tests for isSquareMatrix method

    @ParameterizedTest
    @MethodSource("arrayStream1")
    @NullSource
    void isMatrixRagged(int[][] par1) {
        assertFalse(matrixObject.isSquareMatrix(par1));
    }

    @Test
    void isMatrixSquare() {
        int[][] newMatrix = new int[][]{{0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        assertTrue(matrixObject.isSquareMatrix(newMatrix));
    }

    @Test
    void isMatrixLengthZero() {
        int[][] newMatrix = new int[0][0];
        assertFalse(matrixObject.isSquareMatrix(newMatrix));
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

    @ParameterizedTest
    @MethodSource("arrayStream2")
    void isArrayValid(int[] par1) {
        assertTrue(matrixObject.arrayCheck(par1));
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