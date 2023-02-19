import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        //StringBuilder sb = new StringBuilder();

        int[][] arr = new int[A*2][B];

        for (int i = 0; i <2*A; i++) {
             st = new StringTokenizer(br.readLine());
            for (int j = 0; j < B; j++) {

                int num1 = Integer.parseInt(st.nextToken());

                arr[i][j] =num1;
                //System.out.println(arr[i][j]);
            }
        }
//        System.out.println(
//                Arrays.deepToString(arr)
//        );

        for (int i = 0; i < A; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < B; j++) {
                sb.append(arr[i][j] + arr[i + A][j]);
                sb.append(" ");
                //sb.append(arr[i][j] + arr[i+B][j]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

            //System.out.print(sb.toString());


    }

}
