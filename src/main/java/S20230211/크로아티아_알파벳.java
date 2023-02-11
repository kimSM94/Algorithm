package S20230211;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아_알파벳 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alphabet = br.readLine();

        // lj, nj, dz는 한 단어

        char[] arr = new char[alphabet.length()];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] =alphabet.charAt(i);
            count++;
            System.out.println("count = "+count);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("test ="+String.valueOf(arr[i] + arr[i + 1]));
            if (String.valueOf(arr[i] + arr[i + 1]) == "lj" || String.valueOf(arr[i] + arr[i + 1]) == "nj" || String.valueOf(arr[i] + arr[i + 1]) == "dz" ) {
                count--;
            } else if (arr[i] == '=') {
                count--;
            }
        }
        System.out.println(count);
    }
}
