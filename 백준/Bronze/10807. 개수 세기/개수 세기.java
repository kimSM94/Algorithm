import java.io.*;
import java.util.StringTokenizer;

class Main {

  
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int count = 0;

        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            if(arr[i]==x){
                count++;
            }
        }
      bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();

    }
}
