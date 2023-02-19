package 백준.S20230216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM호텔 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int height = Integer.parseInt(st.nextToken());
            int room = Integer.parseInt(st.nextToken());
            int person = Integer.parseInt(st.nextToken());

            if (person % height == 0) {
                sb.append((height * 100) + (person / height)).append("\n");
            }else{
                sb.append(((person%height) * 100) + ((person / height)+1)).append("\n");
            }

        }
        System.out.print(sb);


    }
}
