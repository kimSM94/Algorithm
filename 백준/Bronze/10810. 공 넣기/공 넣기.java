import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int[] arrA = new int[A];
        int B = Integer.parseInt(st.nextToken());


        for (int arrPlus = 0; arrPlus < B; arrPlus++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i= Integer.parseInt(st.nextToken());
            int j= Integer.parseInt(st.nextToken());
            int k= Integer.parseInt(st.nextToken());

            for (int result = i - 1; result < j; result++) {
                arrA[result] = k;
            }
          
        }

        for (int K = 0; K < arrA.length; K++) {
            sb.append(arrA[K]).append(" ");
        }

        System.out.print(sb);
        br.close();



    }
}
