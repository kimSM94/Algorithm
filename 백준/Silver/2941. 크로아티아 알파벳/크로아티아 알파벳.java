import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

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
        
    }}