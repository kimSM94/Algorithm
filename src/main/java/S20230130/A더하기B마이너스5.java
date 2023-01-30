package S20230130;

import java.io.*;
import java.util.StringTokenizer;

public class A더하기B마이너스5 {

    /*
     * 주소 : https://www.acmicpc.net/problem/10952
     * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());


            if (a == 0 && b == 0) {
                break;
            }
            bw.write((a + b) + " ");

        }

        bw.flush();
        bw.close();
        br.close();

    }
}
