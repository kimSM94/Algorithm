import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");


        long A = Long.parseLong(st.nextToken());

        long B = Long.parseLong(st.nextToken());

        long gcd = (A*B)/GCD(A,B);
        System.out.println(gcd);
//        System.out.println("A="+ A);
//        System.out.println("B="+ B);
//        System.out.println("A/B ="+A/B);
//        System.out.println("A%B ="+A%B);
//        if(B%A==0){
//            System.out.println(B);
//        }else{
//            System.out.println(A * B);
//        }

    }

    public static long GCD(long a, long b){
        while (b>0){
            long tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

}
