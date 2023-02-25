
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int num = Integer.parseInt(br.readLine());
        double sum = 0;

        for (int i = 0; i < num; i++) {
            int score = Integer.parseInt(br.readLine());
            sum += (double) score;
            list.add(score);
        }

        // 중앙값을 찾기 위한 정렬
        Collections.sort(list);

        int max = Collections.max(list);
        int min = Collections.min(list);

        if (max < 0 && min < 0) {
            min = Math.abs(min);
        } else if (max > 0 && min > 0) {
            min = min * -1;
        } else {
            max = Math.abs(max);
            min = Math.abs(min);
        }

        double dle = sum / num;
        int average = (int) Math.round(dle);
        int Median = list.get(num / 2);

        int mode = 0;
        int Range = max + min;

        for (int result : list) {
            // 숫자가 한번 나올 때마다 1이 추가됨

            /*
            * getOrDefault
            * 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
            * */
            hashmap.put(result, hashmap.getOrDefault(result, 0) + 1);
        }

        int numbers = 0;
        // 중복된 값의 개수를 출력한다.
        for (int key : hashmap.values()) {
            numbers = Math.max(numbers, key);
        }

        // 위에서 사용했던 list를 다시 사용하기 위해 clear
        // 최빈수를 구하기
        list.clear();
        for (int key : hashmap.keySet()) {
            if (hashmap.get(key) == numbers) {
                list.add(key);
            }
        }

        // 최빈수가 2개 이상일 경우 2번째로 작은 값을 뽑아내야 하기 때문에 list를 정렬
        Collections.sort(list);

        // 최빈수와 빈도수가 같은 수가 2개 이상인 경우 index 1의 값을 최빈수로 설정
        // 1개일 경우는 그대로 index 0을 최빈수로 설정
        if (list.size() >= 2) {
            mode = list.get(1);
        }else{
            mode = list.get(0);
        }
        System.out.println(average);
        System.out.println(Median);
        System.out.println(mode);
        System.out.println(Range);



    }


}
