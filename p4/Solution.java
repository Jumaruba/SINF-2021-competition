import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        String s = scanner.nextLine();  
        int ans = numDecodings(s);
        System.out.println(ans);  
    } 
    
    public static int numDecodings(String s) {
        int size = s.length(); 
        int[] arr = new int[size+1]; 
        arr[0] = 1; 
        boolean canPair; 
        if (s.charAt(0) != '0') arr[1] = 1; 
        for (int i = 1; i < size; i++){
            canPair = canPairWithPrevious(s.charAt(i), s.charAt(i-1)); 
            
            if (s.charAt(i) != '0' && canPair) arr[i+1] = arr[i] + arr[i-1]; 
            else if (s.charAt(i) != '0' && !canPair) arr[i+1] = arr[i]; 
            else if (s.charAt(i) == '0' && canPair) arr[i+1] = arr[i-1]; 
            else return 0; 
        }
        return arr[size]; 
    }
    
    public static boolean canPairWithPrevious(char now, char prev){
        if (prev == '0') return false; 
        if (prev == '1') return true; 
        if (prev == '2' && now > '6') return false;
        if (prev == '2' && now <= '6') return true; 
        return false; 
    }
}