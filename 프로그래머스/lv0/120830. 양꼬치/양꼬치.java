class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        if(n>=10){
          answer = n*12000+(k-(n/10))*2000;
        }else{
          answer = n*12000+k*2000;
        }
        return answer;
    }
}