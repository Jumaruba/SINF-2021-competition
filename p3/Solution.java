import java.util.*; 

class Solution { 

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        String sizes = scanner.nextLine();
        int m = Integer.parseInt(sizes.split(" ")[0]);
        int n = Integer.parseInt(sizes.split(" ")[1]); 
        int[][] grid = new int[m][n]; 

        for (int i = 0 ; i < m; i++){
            for (int j = 0; j < n; j++){
                grid[i][j] = scanner.nextInt(); 
            }
        }
        int solution = maximumMinimumPath(grid);
        System.out.println(solution);
    }

    public static class Node {
        public int i, j, val; 
        public Node(int i, int j, int val){
            this.i = i; 
            this.j = j; 
            this.val = val; 
        }

    }

    public static class MyComparator implements Comparator<Node> {
        @Override
        public int compare(Node a, Node b){
            return b.val - a.val; 
        }
    }
    
    public static int maximumMinimumPath(int[][] grid) {
        PriorityQueue<Node> pq = new PriorityQueue<>(new MyComparator()); 
        int minValue = grid[0][0]; 
        
        // Add edges to priority queue
        int m = grid.length;            // rows
        int n = grid[0].length;         // cols
        
        Node currNode = new Node(0, 0, grid[0][0]); 
        while (currNode.i != m-1 || currNode.j != n-1){
            grid[currNode.i][currNode.j] = -1; 
            if (currNode.i > 0) pq.add(new Node(currNode.i-1, currNode.j, grid[currNode.i-1][currNode.j]));
            if (currNode.j > 0) pq.add(new Node(currNode.i, currNode.j-1, grid[currNode.i][currNode.j-1]));
            if (currNode.i < m-1) pq.add(new Node(currNode.i+1, currNode.j, grid[currNode.i+1][currNode.j]));
            if (currNode.j < n-1) pq.add(new Node(currNode.i, currNode.j+1, grid[currNode.i][currNode.j+1]));
            
            currNode = pq.peek();
            pq.remove(currNode); 
            minValue = Math.min(minValue, currNode.val); 
        }

        return minValue; 
    }
}
