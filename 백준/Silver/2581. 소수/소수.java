import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = N;

        x : for (int i = M; i <= N; i++)
        {

            if (i == 1) continue;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) continue x;
            }

            sum += i;

            if (min > i) {
                min = i;
            }

        }

        if (sum == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sum + "\n" + min);

    }
}
