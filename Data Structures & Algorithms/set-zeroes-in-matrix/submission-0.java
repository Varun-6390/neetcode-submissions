class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length, column = matrix[0].length;

        boolean rowZero[] = new boolean[row];
        boolean columnZero[] = new boolean[column];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                if(matrix[i][j] == 0)
                {
                    rowZero[i] = true;
                    columnZero[j] = true;
                }
            }
        }

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                if(rowZero[i] || columnZero[j])
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
