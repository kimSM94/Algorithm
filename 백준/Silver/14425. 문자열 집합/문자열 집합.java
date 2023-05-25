import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    static HashSet<String> hashSet = new HashSet<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for (int i = 0; i < A; i++) {
            hashSet.add(br.readLine());
        }

        int count = 0;

        for(int i = 0; i < B; i++) {

            if(hashSet.contains(br.readLine())){
                count++;
            }
        }

        System.out.println(count);
    }
}
