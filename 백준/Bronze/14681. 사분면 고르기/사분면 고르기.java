import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st2.nextToken());



            if (A >= 0 && B >= 0) {
                System.out.println("1");
            } else if (A >= 0 && B <= 0) {
                System.out.println("4");
            } else if (A < 0 && B >= 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
      }
    
}