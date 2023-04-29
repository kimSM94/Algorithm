import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        int sum = 0;

        for (int i = 0; i < N; i++) {

            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                }
            }
        }
        // 최스 크기가 8 X 8 일 경우의 수가 1
        int N_row = N - 7;
        int M_col = M - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                chess(i, j);
            }
        }
        System.out.println(min);

    }

    public static int chess(int x, int y) {

        int count = 0;

        boolean check = arr[x][y];

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (arr[i][j] != check) {
                    count++;
                }
                // 다음 칸은 색이 바뀌므로 true라면 false로
                check = !check;
            }
            check = !check;
        }

        // 색칠할 개수와 반대되는 색 count중 최소값
        count = Math.min(count, 64 - count);

        min = Math.min(min, count);

        return min;
    }


}
