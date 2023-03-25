
import java.util.ArrayList;


class Solution {
    
    static boolean[] check = new boolean[7];
    // numbers의 각 자리수로 만들 수 있는 조합을 저 할 ArrayList
    static ArrayList<Integer> arr = new ArrayList<>();
    
    
    public int solution(String numbers) {
          int answer = 0;

        for (int i = 0; i < numbers.length(); i++) {
            dfs(numbers, "", i + 1);
        }

        for (int i = 0; i < arr.size(); i++) {
            if (isPrime(arr.get(i))) {
                answer++;
            }
        }

        return answer;
    }
    
      static void dfs(String str, String temp, int m) {
        if (temp.length() == m) {
            int num = Integer.parseInt(temp);
            if (!arr.contains(num)) {
                arr.add(num);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (!check[i]) {
                check[i] = true;
                temp += str.charAt(i);
                dfs(str, temp, m);
                check[i] = false;
                temp = temp.substring(0, temp.length() - 1);
            }
        }
    }


    static boolean isPrime(int num) {

        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }
}