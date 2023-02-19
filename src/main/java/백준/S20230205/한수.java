package 백준.S20230205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한수 {
    public static void main(String[] args) throws IOException {

        /*
         *  주소 : https://www.acmicpc.net/problem/1065
         * */ //       an = a1+(n-1)d

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int num = Integer.parseInt(br.readLine());

        System.out.println(solution(num));
        br.close();
    }

    static int solution(int num) {
        int cnt = 0;

        if (num < 100) {
            return num;
        } else {
            cnt = 99;

            if (num == 1000) {
                num = 999;
            }
            for (int i = 100; i <= num; i++) {
                int h = i / 100;  //백의 자릿수
                int t = (i / 10) % 10; //십의 자릿수
                int o = i % 10;
                // 백의 자리와 십의 자리의 차와 십의 자리와 일의 자리의 차가 수열을 이룸
                if ((h - t) == (t - o)) {
                    cnt++;
                }

            }

        }


        return cnt;
    }


}
