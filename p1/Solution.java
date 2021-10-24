import java.util.*; 

class Solution { 
  // Getting input.
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine(); 
    String pf = scanner.nextLine(); 
    int[] nums = Arrays.asList(pf.split(" ")).stream().mapToInt(Integer::parseInt).toArray();  
    int ans = maxSubArray(nums); 
    System.out.println(ans);
  }

  public static int maxSubArray(final int[] nums) {
    int bestUntilNow = nums[0];

    int currSum = nums[0];
    // Using the kadane algorithm.
    for (int i = 1; i < nums.length; i++) {
      currSum = currSum < 0 ? nums[i] : currSum + nums[i];
      bestUntilNow = Math.max(bestUntilNow, currSum);
    }
    return bestUntilNow;
  }
}
