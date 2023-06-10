import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        make_prime();

        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(br.readLine());
            int result = 0;

            // 절반넘어가면 겹침..
            for (int j = 2; j <= number /2; j++) {

                if (!prime[j] && !prime[number - j]){
                    result++;
                }

            }

            sb.append(result).append("\n");
        }
        System.out.println(sb);

    }

    public static void make_prime() {

        prime = new boolean[1000000 +1];	// 0 ~ N

        prime[0] = prime[1] = true;

      
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {

            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j < prime.length; j +=  i) {
                prime[j] = true;
            }

        }

    }
}
