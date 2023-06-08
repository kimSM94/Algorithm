import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        BigInteger A1 = new BigInteger(String.valueOf(A));
        BigInteger B1 = new BigInteger(String.valueOf(B));

        long result = (A * B) / Long.parseLong(String.valueOf(A1.gcd(B1)));

        System.out.println(result);

    }

}
