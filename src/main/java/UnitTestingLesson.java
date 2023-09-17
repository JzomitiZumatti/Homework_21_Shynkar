import java.util.Arrays;

public class UnitTestingLesson {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int[][] matrix2 = new int[0][0];
        int[][] matrix4 = new int[6][5];
        int[][] matrix3 = null;
        int[][] matrix1 = new int[][] {{1,2,3}, {1,2}, {1,2,3}};


        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        Matrix matrixObject = new Matrix();

        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
        System.out.println(matrixObject.isSquareMatrix(matrix));
        System.out.println(matrixObject.isSquareMatrix(matrix1));
    }
}
