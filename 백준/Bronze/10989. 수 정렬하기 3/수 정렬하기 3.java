import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[10001];

        for (int i = 0; i < num; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 10001; i++) {
            while (cnt[i] > 0) {
                sb.append(i).append("\n");
                cnt[i]--;
            }
        }
        System.out.println(sb);

    }
}
