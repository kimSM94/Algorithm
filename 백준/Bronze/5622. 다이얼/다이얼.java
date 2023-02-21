import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];
        arr[0] = arr[1] = arr[2] = 3; //A, B, C는 각각 3초가 걸린다
        arr[3] = arr[4] = arr[5] = 4; //D, E, F는 4초가 걸린다 
        arr[6] = arr[7] = arr[8] = 5;
        arr[9] = arr[10] = arr[11] = 6;
        arr[12] = arr[13] = arr[14] = 7;
        arr[15] = arr[16] = arr[17] = arr[18] = 8;
        arr[19] = arr[20] = arr[21] = 9;
        arr[22] = arr[23] = arr[24] = arr[25] = 10;
        int sum = 0;  //걸리는 시간
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sum += arr[(int)c - 65];  //아스키 코드값 이용
        }
        System.out.print(sum);
    }
}