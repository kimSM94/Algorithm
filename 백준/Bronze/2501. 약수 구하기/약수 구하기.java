import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count =0;
        for (int i = 1; i <= A; i++) {

            if (A % i == 0) {
                list.add(i);
                count++;
            }
        }
        if(count<B){
            System.out.print(0);
        }else{
            System.out.print(list.get(B-1));
        }



    }
}
