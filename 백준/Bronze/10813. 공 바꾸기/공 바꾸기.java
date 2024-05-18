import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] word = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(word[0]);
        int[] arr = new int[num];

        for (int i = 1; i <= num; i++) {
            arr[i-1] = i;
        }

        for (int i = 0; i < Integer.parseInt(word[1]); i++) {
            String[] result = br.readLine().split(" ");
            int first = Integer.parseInt(result[0]);
            int second= Integer.parseInt(result[1]);

            int temp = 0;
            temp =  arr[first-1];
            arr[first-1] = arr[second-1];
            arr[second-1] = temp;
        }
        for (int s : arr) {
            sb.append(s).append(" ");
        }
        System.out.println(sb);

    }
}
