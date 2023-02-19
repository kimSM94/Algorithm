import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        int max = 0;
        int first = 0;
        int last =0;
        for (int i = 0; i < 9; i++) {
//            max = arr[0][0];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {

                int num = Integer.parseInt(st.nextToken());

                arr[i][j] = num;

                if (arr[i][j] > max) {
                    max = arr[i][j];
                    first = i;
                    last = j;
                }

            }

    }
        System.out.println(max);
       System.out.print((first+1)+" "+(last+1));

    }


}
