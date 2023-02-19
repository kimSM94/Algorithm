package 백준.S20230211;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아_알파벳 {

    /*
     * 주소 : https://www.acmicpc.net/problem/2941
     *
     * 다시 풀어보기
     * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alphabet = br.readLine();

        String[] coratiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int cnt = 0;

        for (String val : coratiaAlphabet) {
            while (alphabet.contains(val)) {
                alphabet = alphabet.replace(val, "A");
            }
        }
        cnt += alphabet.length();
        br.close();

        System.out.println(cnt);
        /* 방법 2 - INDEX로

		for (int i = 0; i < croatiaAlphabet.length; i++) {
            index = alphabet.indexOf(croatiaAlphabet[i]);
			if (index >= 0) {
			alphabet = alphabet.replaceAll(croatiaAlphabet[i], "A");
			}
		}
		System.out.println(s.length());

        */
        /* 방법 1 -  BUT 답이 틀렸따.... 넘어렵다구.....

        char[] arr = new char[alphabet.length()];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = alphabet.charAt(i);
            count++;

            if (arr[i] == '=') {
                count--;
            }
            if (arr[i] == '-') {
                count--;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {

            if (String.valueOf(arr[i] + "" + arr[i + 1]).equals(String.valueOf("l" + "j"))) {
                count--;
            } else if (String.valueOf(arr[i] + "" + arr[i + 1]).equals(String.valueOf("n" + "j"))) {
                count--;
            } else if (String.valueOf(arr[i] + "" + arr[i + 1]).equals(String.valueOf("d" + "z"))) {
                count--;
            } else {
                count += 0;
            }

        }
        System.out.println(count);
        */
    }
}
