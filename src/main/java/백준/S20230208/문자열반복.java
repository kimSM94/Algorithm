package 백준.S20230208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열반복 {

    public static void main(String[] args) throws IOException {

        /*
        * 서버 : https://www.acmicpc.net/problem/2675
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<num;i++){

            String[] S = br.readLine().split(" ");

            // 반복할 값
            int X = Integer.parseInt(S[0]);
            String Y = S[1];

            for (int j = 0; j < Y.length(); j++) {
                for (int k = 0; k < X; k++) {
                    System.out.print(Y.charAt(j));
                }
            }
            System.out.println();

        }


    }

}
