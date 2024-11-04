class Solution {
    public String solution(int n) {
        String answer = "";
        
        String word = "수박";
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <=n;i++){
            
            if (i % 2 == 1) {
                sb.append(word.substring(0,1)).append("");
            }else{
                sb.append(word.substring(1,2)).append("");
            }
        }
        
        return sb.toString();
    }
}