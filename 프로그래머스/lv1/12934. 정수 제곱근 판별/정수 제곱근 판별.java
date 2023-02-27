class Solution {
    public long solution(long n) {
        long answer = 0;
        Double x =Math.sqrt(n);
        
        if(x==x.intValue()){
          answer = (long)Math.pow(x+1, 2);
        }else{
answer =-1;
}
        return answer;
    }
}