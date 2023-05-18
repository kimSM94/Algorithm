import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int[] arrA;
    public static int first = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        first = Integer.parseInt(br.readLine());

        arrA = new int[first];
        int arrNumber = 0;

        st = new StringTokenizer(br.readLine(), " ");


        StringBuilder sb = new StringBuilder();

        while (st.hasMoreElements()) {
            arrA[arrNumber++] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrA);

        br.readLine();

        st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreElements()) {
            int num = Integer.parseInt(st.nextToken());

            if (binarySearch(num)) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            sb.append(" ");
        }
        System.out.println(sb);

    }

    private static boolean binarySearch(int num) {

        int leftIndex = 0;
        int rightIndex = first - 1;

        while (leftIndex <= rightIndex) {
            int midindex = (leftIndex + rightIndex) / 2;
            int mid = arrA[midindex];

            if (num < mid) {
                rightIndex = midindex - 1;
            } else if (num > mid) {
                leftIndex = midindex + 1;
            } else if (mid == num) {
                return true;
            }
        }
        return false;
    }

}
