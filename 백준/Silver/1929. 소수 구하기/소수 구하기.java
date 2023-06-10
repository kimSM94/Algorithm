import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(),"  ");
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        make_prime();

        for (int i = A; i <= B; i++) {
            if(!prime[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);

    }

    public static void make_prime() {

        prime = new boolean[1000000+ 1];	// 0 ~ N

        prime[0] = prime[1] = true;

        // 제곱근 함수 : Math.sqrt()
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
