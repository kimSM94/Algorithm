class Solution {
    public int solution(int n) {
        long num =n;
        int answer = 0;
        int count = 0;
        while (num>=2) {
          
            if (num % 2 == 0) {
                num = num/2;
            } else {
                num = num* 3 + 1;
            }
           count++;
             if (count > 500) {
                return -1;
            }
            

        }

        return count;
    }
}