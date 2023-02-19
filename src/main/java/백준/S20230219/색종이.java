package 백준.S20230219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이 {

    public static void main(String[] args) throws IOException {

        // arr[0][0] ~ arr[100][100] 까지 데이터 0 을 넣음
        // arr[3][7] ~ arr[13][17] 까지 데이터 1을 넣음

        int[][] arr = new int[100][100];
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                arr[i][j] =0;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width  = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            for (int j = width; j < width+10; j++) {

                for (int k = height; k < height+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(arr[i][j] ==1){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
