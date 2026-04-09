class NumMatrix {
    int mat[][];
    int r, c;
    public NumMatrix(int[][] matrix) {
        mat = matrix;
        r = matrix.length;
        c = matrix[0].length;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (isInValid(row1, col1, row2, col2)) 
        {
            throw new IllegalArgumentException("Invalid encoded string");
        }
        int sum = 0;
        for(int i = row1; i <= row2; i++)
        {
            for(int j = col1; j <= col2; j++)
                sum += mat[i][j];
        }
        return sum;
    }

    private boolean isInValid(int row1, int col1, int row2, int col2)
    {
        return row1 < 0 || row1 > r || col1 < 0 || col1 > c || row2 < 0 || row2 > r || col2 < 0 || col2 > c;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */