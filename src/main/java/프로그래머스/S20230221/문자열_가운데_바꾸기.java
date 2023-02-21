package 프로그래머스.S20230221;

public class 문자열_가운데_바꾸기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("abcde"));
    }

    static class Solution {

        public String solution(String s) {
            String answer= "";
//            abcdefg
//            홀수 5/2 +1;
//            짝수 6/2,  6/3 abcdef
            if(s.length()%2==0){
                answer =String.valueOf(s.charAt(s.length()/2-1))+String.valueOf(s.charAt(s.length()/2));
            }else{
                answer = String.valueOf(s.charAt(s.length() / 2));
            }

            return answer;
        }
    }

}
