package Recursion;

public class MazePath {
    public static void maze(int row, int col, int rowEnd, int colEnd, String result,int ways) {

        if (row == rowEnd && col == colEnd) {
            System.out.println(result);
        //   System.out.println(ways*2);
            return;
        }
        if (row < rowEnd)
            maze(row + 1, col, rowEnd, colEnd, result + "V",ways+1);
        if (col < colEnd)
            maze(row, col + 1, rowEnd, colEnd, result + "H",ways+1);

    }

    public static void main(String[] args) {
        maze(1, 1, 3, 3, " ",0);

    }
}
