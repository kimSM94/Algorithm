
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String B = sc.next();

        sc.close();

        System.out.println(A* (B.charAt(2) -'0'));
        System.out.println(A* (B.charAt(1) -'0'));
        System.out.println(A* (B.charAt(0) -'0'));
        System.out.println(A* Integer.parseInt(B));
    }
}