import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        System.out.println(piBonachi(num));
    }

    static int piBonachi(int num){

        // 1 2 3 4 5 6 7 8 9 10
        int first = 0;
        int last = 1;
        int sum = 0;
        int sum2= 0;

        int[] arr = new int[num+2];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < num+1; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr[num];
    }
}
