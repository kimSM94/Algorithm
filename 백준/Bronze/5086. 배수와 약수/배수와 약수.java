import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 & B == 0) {
                break;
            }

            if (B % A == 0) {
                sb.append("factor");
            } else if (A % B == 0) {
                sb.append("multiple");
            } else {
                sb.append("neither");
            }
            sb.append("\n");

        }
        System.out.print(sb);

    }
}
