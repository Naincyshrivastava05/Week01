import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrixA = createRandomMatrix(3, 3);
        int[][] matrixB = createRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        System.out.println("Matrix Addition (A + B):");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("Matrix Subtraction (A - B):");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("Matrix Multiplication (A * B):");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        System.out.println("Determinant of 2x2 Matrix A:");
        System.out.println(determinant2x2(new int[][]{{matrixA[0][0], matrixA[0][1]}, {matrixA[1][0], matrixA[1][1]}}));

        System.out.println("Determinant of 3x3 Matrix A:");
        System.out.println(determinant3x3(matrixA));

        System.out.println("Inverse of 2x2 Matrix A:");
        displayMatrix(inverse2x2(new int[][]{{matrixA[0][0], matrixA[0][1]}, {matrixA[1][0], matrixA[1][1]}}));

        System.out.println("Inverse of 3x3 Matrix A:");
        displayMatrix(inverse3x3(matrixA));
    }

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values 0-9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) return null; // No inverse
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) return null; // No inverse
        double[][] inverse = new double[3][3];

        // Cofactors and adjugate
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = {
                        {matrix[(i + 1) % 3][(j + 1) % 3], matrix[(i + 1) % 3][(j + 2) % 3]},
                        {matrix[(i + 2) % 3][(j + 1) % 3], matrix[(i + 2) % 3][(j + 2) % 3]}
                };
                inverse[j][i] = (determinant2x2(minor) * ((i + j) % 2 == 0 ? 1 : -1)) / (double) determinant;
            }
        }
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix is not invertible.");
            return;
        }
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}
