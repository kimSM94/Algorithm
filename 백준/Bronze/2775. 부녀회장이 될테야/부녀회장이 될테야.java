
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static int[][] APT = new int[15][15];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        make_APT();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            sb.append(APT[a][b]).append("\n");
        }
        System.out.print(sb);

    }

    public static void make_APT(){

        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1;
            APT[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {

            for (int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];

                
            }
        }

    }


}