import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arrA = new int[2];
    static int[] arrB = new int[2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int up = A * D + B * C;
        int down = B * D;

        int result = gcd(up, down);
        up /= result;
        down /= result;

        sb.append(up + " " + down).append("\n");

        System.out.println(sb);


    }

    static int gcd(int a, int b) {

        while (b != 0) {

            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }


}
