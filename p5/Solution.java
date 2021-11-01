import java.util.*; 

class Solution { 
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).mapToInt(x -> x).toArray();
        int m = dimensions[0];
        int n = dimensions[1]; 

        int[][] grid = new int[m][n]; 
        for (int i = 0 ; i < m; i++){
            grid[i] = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).mapToInt(x -> x).toArray();
        }

        System.out.println(orangesRotting(grid)); 
    }
    // run the rotting process, by marking the rotten oranges with the timestamp
    public static boolean runRottingProcess(int timestamp, int[][] grid, int ROWS, int COLS) {
        int[][] directions = { {-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        // flag to indicate if the rotting process should be continued
        boolean toBeContinued = false;
        for (int row = 0; row < ROWS; ++row)
            for (int col = 0; col < COLS; ++col)
                if (grid[row][col] == timestamp)
                    // current contaminated cell
                    for (int[] d : directions) {
                        int nRow = row + d[0], nCol = col + d[1];
                        if (nRow >= 0 && nRow < ROWS && nCol >= 0 && nCol < COLS)
                            if (grid[nRow][nCol] == 1) {
                                // this fresh orange would be contaminated next
                                grid[nRow][nCol] = timestamp + 1;
                                toBeContinued = true;
                            }
                    }
        return toBeContinued;
    }

    public static int orangesRotting(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        int timestamp = 2;
        while (runRottingProcess(timestamp, grid, ROWS, COLS))
            timestamp++;

        // end of process, to check if there are still fresh oranges left
        for (int[] row : grid)
            for (int cell : row)
                // still got a fresh orange left
                if (cell == 1)
                    return -1;


        // return elapsed minutes if no fresh orange left
        return timestamp - 2;
    }
}