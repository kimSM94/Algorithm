package S20230202;

import java.io.*;
import java.util.HashSet;


public class 나머지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine())%42;

            set.add(arr[i]);
        }


        System.out.println(set.stream().count());




    }
}
