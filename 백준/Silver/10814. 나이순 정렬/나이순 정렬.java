import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int num = Integer.parseInt(br.readLine());

        String[][] arr = new String[num][2];

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        /*Arrays.sort(arr, (o1,o2)->{
            if(Integer.parseInt(o1[0]) > Integer.parseInt(o2[0])){
                return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
            }else{
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
            }
        });*/

        Arrays.sort(arr, new Comparator<String[]>() {
            // 나이순으로 정렬
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }

        });

        for (int i = 0; i < num; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }
        System.out.print(sb);

    }
}
