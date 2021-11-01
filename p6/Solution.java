import java.util.*; 

class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] v = Arrays.stream(scanner.nextLine().split(" ")).map(x -> Integer.parseInt(x)).mapToInt(x -> x).toArray();
        int[][] events = new int[v[0]][3]; 
        for (int i = 0 ; i < v[0]; i++){
            events[i] = Arrays.stream(scanner.nextLine().split(" ")).map(x -> Integer.parseInt(x)).mapToInt(x -> x).toArray(); 
        }

        System.out.println(maxValue(events, v[1])); 
    }

    public static int maxValue(int[][] events, int k) {
        // sort based on the first number
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int n = events.length;
        int [][] dp = new int [n][k + 1];
        int max = 0;
        // our possiblity:
        // -> skip the event and start with the next event with no change in profit
        // -> consider this event, add profit and move on to next non overlapping event
        for (int i=0; i<n; i++) {
            max = Math.max(max, events[i][2]);
            dp[i][1] = events[i][2];
        }
        if (k == 1)
            return max;
        for (int i=1; i<n; i++) {
            for (int j=0; j<i; j++) {
                // non overlapping
                if (events[j][1] < events[i][0]) {
                    for (int x=2; x<=k; x++) {
                        dp[i][x] = Math.max(dp[i][x], dp[j][x-1] + events[i][2]);
                    }
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<=k; j++) {
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }
}