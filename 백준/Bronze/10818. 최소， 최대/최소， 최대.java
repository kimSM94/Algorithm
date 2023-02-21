import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main {

  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = 0;
        while(st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);
                bw.write(arr[0] + " " + arr[N-1]);
        bw.flush();
        bw.close();
        br.close();


    }
}
