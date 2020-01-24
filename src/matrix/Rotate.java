package matrix;

public class Rotate {

    static int ROW = 4;
    static int COLUMN = 4;

    /**
     * @param r   end of row
     * @param c   end of column
     * @param mat matrix
     */
    static void rotateMatrix(int r, int c, int mat[][]) {
        int row = 0;
        int col = 0;
        int prev, curr;

        while (row < r && col < c) {
            if (row + 1 == r || col + 1 == c)
                break;  //out of bound
            // first element of next row
            prev = mat[row + 1][col];

            //move elements of first row
            for (int i = col; i < c; i++) {
                curr = mat[row][i];
                mat[row][i] = prev;
                prev = curr;
            }
            row++;


            //move elements of first column
            for (int i = row; i < r; i++) {
                curr = mat[i][c - 1];
                mat[i][c - 1] = prev;
                prev = curr;
            }
            c--;

            //move elements of last row
            if (row < r) {
                for (int i = c - 1; i >= row; i--) {
                    curr = mat[i][col];
                    mat[i][col] = prev;
                    prev = curr;
                }
            }
            col++;

            //print
            for (int i = 0; i < ROW; i++) {
                for (int j = 0; j < COLUMN; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        rotateMatrix(ROW, COLUMN, a);
    }
}
