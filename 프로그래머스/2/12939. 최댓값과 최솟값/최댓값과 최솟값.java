import java.util.Arrays;

class Solution {
    String s;
    String answer;
    
    public String solution(String s) {
        this.s = s;
        answer = "";
        
        int[] arr = new int[s.split(" ").length];
        
        for(int i = 0 ;i<arr.length; i++){
            arr[i] = Integer.parseInt(s.split(" ")[i]);
        }
        
        Arrays.sort(arr);
        
        answer = arr[0] + " " + arr[arr.length-1];
        
        return answer;
    }
}