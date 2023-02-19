package 프로그래머스.S20230219;


import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 {

    public String[] solution(String[] strings, int n) {
        char[] test = new char[strings.length];

        for (int i = 0; i < strings.length; i++) {
            test[i] = strings[i].charAt(n);
        }

        Arrays.stream(strings).sorted((s1, s2) ->
                s1.charAt(n) == s2.charAt(n) ? s1.compareTo(s2)
                              : Integer.compare(s1.charAt(n), s2.charAt(n))).toArray(String[]::new);


        String[] answer = {};
        return answer;

    }

    public static void main(String[] args) {

        문자열_내_마음대로_정렬하기 solution = new 문자열_내_마음대로_정렬하기();

        String[] abc = {"sun", "bed", "car"};
        System.out.println(solution.solution(abc, 1));

    }
}
