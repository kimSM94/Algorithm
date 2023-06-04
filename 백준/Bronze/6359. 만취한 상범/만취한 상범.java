import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int count = 0;
            int result = Integer.parseInt(br.readLine());
            for (int j = 1; j * j <= result; j++) {
                count++;
            }
            sb.append(count).append("\n");
        }



        System.out.println(sb);

    }
}
