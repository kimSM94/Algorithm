import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N];

        int arrNumber=0;
        int sum = 0;
        int temp =0;
        while (st.hasMoreTokens()){
            arr[arrNumber] = Integer.parseInt(st.nextToken());
            arrNumber++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];

                    if (temp < sum && sum <= M) {
                        temp = sum;
                    }
                }
            }
        }
        System.out.println(temp);

    }
}
