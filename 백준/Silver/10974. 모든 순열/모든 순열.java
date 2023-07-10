import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [ 효율성 ]
 * - 메모리:
 * - 시간 :
 */
public class Main {

    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num];
        result = new int[num];
        boolean[] visited = new boolean[num];

        for (int i = 0; i < num; i++) {
            visited[i] = true;
            DFS(arr, visited, num, i, 0);
            visited[i] = false;
        }

    }

    static void DFS(int[] arr, boolean[] visited, int num, int start, int depth){
        result[depth] = start + 1;
        if (depth == num - 1) {
            for (int i = 0; i < num; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < num; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
             DFS(arr, visited, num, i, depth + 1);
            visited[i] = false;
        }
    }


}
