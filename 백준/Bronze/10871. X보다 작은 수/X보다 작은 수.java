import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int A = Integer.parseInt(str[1]);

        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < N; j++) {
            if(arr[j]<A){
                bw.write(arr[j] +" ");
            }
        }
        bw.flush();
        bw.close();
        br.close();


    }

}