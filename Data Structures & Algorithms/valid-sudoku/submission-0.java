class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) 
        {
            int[] row = new int[9];
            int[] col = new int[9];
            int[] box = new int[9];
            for(int j = 0; j < 9; j++) 
            {
                if(board[i][j] != '.') 
                {
                    int num = board[i][j] - '1';
                    if(row[num]++ > 0) 
                        return false;
                }
                if(board[j][i] != '.') 
                {
                    int num = board[j][i] - '1';
                    if(col[num]++ > 0) 
                        return false;
                }
                int rowIndex = 3 * (i / 3);       
                int colIndex = 3 * (i % 3);      
                int r = rowIndex + j / 3;
                int c = colIndex + j % 3;
                if(board[r][c] != '.') 
                {
                    int num = board[r][c] - '1';
                    if(box[num]++ > 0)
                        return false;
                }
            }
        }
        return true;

    }
}
