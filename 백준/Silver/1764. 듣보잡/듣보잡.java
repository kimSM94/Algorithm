import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A; i++) {
            hashSet.add(br.readLine());
        }

        for (int i = 0; i < B; i++) {
            String test = br.readLine();
            if (hashSet.contains(test)) {
                linkedList.add(test);
            }
        }
        Collections.sort(linkedList);

        for (String s : linkedList) {
            sb.append(s).append("\n");
        }

        System.out.print(linkedList.size()+"\n"+sb);
    }
}
