import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int result = gcd(A, B);

            sb.append(A * B / result).append("\n");
        }
        System.out.println(sb);
    }

    static int gcd(int a, int b) {

        while (b != 0) {

            int r = a % b; // 5 10
            
            a = b;
            b = r;
        }

        return a;
    }


}
