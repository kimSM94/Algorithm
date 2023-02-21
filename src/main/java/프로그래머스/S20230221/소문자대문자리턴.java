package 프로그래머스.S20230221;

import java.util.ArrayList;
import java.util.Arrays;

public class 소문자대문자리턴 {

    static class Solution {
        public String solution(String s) {
            String answer = "";


            String[] arr2 = s.split(" ");

            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < arr2.length; i++) {
                String s1 = arr2[i];
                int index = 0;
                for (int j = 0; j < s1.length(); j++) {

                    if(index%2==0){
                        list.add(String.valueOf(s1.charAt(j)).toUpperCase());
                    }else{
                        list.add(String.valueOf(s1.charAt(j)).toLowerCase());
                    }
                    index++;

                }
                list.add(" ");
            }

            for (String result : list) {
                answer += result;
            }

            return answer.trim();
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("legendiscomeback nono kkkkk kkkk"));
    }
}
