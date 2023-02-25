package 프로그래머스.S20230225;

import java.util.Arrays;

public class 핸드폰_번호_가리기 {

    public static String solution(String phone_number) {

        char[] ch = phone_number.toCharArray();

        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
    }
}
