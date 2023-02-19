package 백준.S20230202;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

class 최댓값 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    max = arr[i];
                } else {
                    max = arr[i + 1];
                }
            } else {
                if (max > arr[i + 1]) {
                    max = max;
                } else {
                    max = arr[i + 1];
                }

            }



        }
        int finalMax = max;
        int index2 = IntStream.range(0, arr.length)
                     .filter(i -> finalMax == arr[i])
                     .findFirst().orElse(-1);
        System.out.println(max+"\n"+(index2+1));

        //최대값
        int max2 =Arrays.stream(arr).max().getAsInt();
        int[] indexArr = IntStream.range(0, arr.length)
                        .filter(i -> arr[i] == max2)
                        .toArray();
        System.out.println("두 번째 값 출력");
        System.out.println(max2 + "\n" + (indexArr[0]+1));

    }

}
