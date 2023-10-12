
public class question_48 {
	public static void main(String[] args) 
    {
        int[] Queens = new int[8];
        solveQueens(Queens, 0);
    }

    public static void solveQueens(int[] Queens, int row) 
    {
        if (row == 8) 
        {
            printSolution(Queens);
            return;
        }

        for (int column = 0; column < 8; column++) 
        {
            if (isValidMove(Queens, row, column)) 
            {
                Queens[row] = column;
                solveQueens(Queens, row + 1);
            }
        }
    }

    public static boolean isValidMove(int[] Queens, int row, int column) 
    {
        for (int i = 0; i < row; i++) 
        {
            if (Queens[i] == column || Queens[i] - i == column - row || Queens[i] + i == column + row) 
            {
                return false;
            }
        }
        return true;
    }

    public static void printSolution(int[] Queens) 
    {
        for (int row = 0; row < 8; row++) 
        {
            for (int column = 0; column < 8; column++) 
            {
                if (Queens[row] == column) 
                {
                    System.out.print("Q ");
                } 
                else 
                {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------");
    }
}
