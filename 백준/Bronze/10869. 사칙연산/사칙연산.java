
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);



        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write((A+B) + "\n");
        bw.write((A-B) + "\n");
        bw.write((A*B) + "\n");
        bw.write((A/B) + "\n");
        bw.write((A%B) + "\n");

       bw.flush();
       bw.close();

    }
}
