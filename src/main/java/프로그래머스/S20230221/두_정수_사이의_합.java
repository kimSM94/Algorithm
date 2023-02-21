package 프로그래머스.S20230221;

public class 두_정수_사이의_합 {


    static class Solution {
        public long solution(int a, int b) {
            long answer = 0;

            if (a < b) {

                for (int i = a; i <= b; i++) {
                    answer += i;
                }

            }else {
                for (int i = a; i >= b; i--) {
                    answer += i;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 3));
    }

}
