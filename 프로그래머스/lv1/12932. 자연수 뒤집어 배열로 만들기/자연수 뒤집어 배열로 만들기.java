class Solution {
    public int[] solution(long n) {
        String nStr = String.valueOf(n);
        int Value =0;
        int[] answer= new int[nStr.length()];
        
        for(int i=0; i<nStr.length(); i++){
           Value = Integer.parseInt(nStr.substring(i,i+1));
           answer[nStr.length()-i-1] =Value;
        }
        return answer;

        

    

    }
}