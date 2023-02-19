package 백준.S20230214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int sum = 1;
        int x = 1;
        if (num == 1) {
            System.out.println(1);
        } else {

            while (num > sum) {
                sum += 6 * x;
                x++;
            }
            System.out.println(x);

        }
    }
}
