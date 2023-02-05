package S20230205;

public class 셀프_넘버 {

    public static void main(String[] args) {
        /*
        *  주소 : https://www.acmicpc.net/problem/4673
        * */
        boolean[] arr = new boolean[10001];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10000; i++) {
            arr[d(i)] = true;

            if (!arr[i]) {
                sb.append(i + " \n");
            }
        }
        System.out.println(sb);
    }

    static int d(int i) {
        int sum = i;

        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        if (sum <= 10000) {
            return sum;
        }
        return 0;
    }
}
