public class Matrix {
    public int[][] buildMatrix(int[] array, int row, int col) {
        int k = 0;
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = array[k++];
            }
        }
        return matrix;
    }

    public int[][] subMatrix(int[][] matrix, int row, int col) {
        int k = 0;
        int[] array = new int[(matrix.length-1)*(matrix.length-1)];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i != row && j != col) {
                    array[k++] = matrix[i][j];
                }
            }
        }
        return buildMatrix(array,matrix.length-1,matrix[0].length-1);
    }

    public int det(int[][] matrix) {
        int det=0;
        if (matrix.length == 1 && matrix[0].length == 1) {
            return matrix[0][0];
        } else {
            if (matrix.length == 2 && matrix[0].length == 2) {
                return matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
            } else {
                for (int i = 0; i < matrix[0].length; i++) {
                    det += Math.pow(-1, i) * matrix[0][i] * det(subMatrix(matrix, 0, i));
                }
            }
        }
        return det;
    }


}
