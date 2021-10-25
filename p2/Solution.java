import java.util.*;

class Solution {
    static int[] open;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); 
        

        // Getting input. 
        int[][] input = new int[n][];
        String temp;  
        for (int i = 0; i < n; i++) {
            temp = scanner.nextLine(); 
            input[i] = new int[]{Integer.parseInt(temp.split(" ")[0]), Integer.parseInt(temp.split(" ")[1])}; 
        } 

        System.out.println(merge(input)); 

    }


    public static int merge(int[][] inter) {
        Arrays.sort(inter, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return a[1] - b[1];
        });
        open = inter[0];

        ArrayList<int[]> ans = new ArrayList<>();
        for (int[] i : inter) {
            if (open[1] >= i[0])
                open = new int[] {open[0], Math.max(open[1], i[1])};
            else {
                ans.add(open);
                open = i;
            }
        }
        ans.add(open); 
        return ans.size(); 
    }
}