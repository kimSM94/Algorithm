import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A1= Integer.parseInt(st.nextToken());
        int A0 = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());
        int N0 = Integer.parseInt(br.readLine());

        int N = N0;

        int answer = 1;

        int fn = A1 * N + A0;
        int gn = C * N;

        if (A1 - C != 0) {
            int k = -A0 / (A1 - C);
            if (N < k) {
                answer = 0;
            }
        }

        if (fn > gn) {
            answer = 0;
        }

        System.out.println(answer);
    }}