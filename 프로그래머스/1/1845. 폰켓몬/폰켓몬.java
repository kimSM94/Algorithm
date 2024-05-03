import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
         
        Map<Integer, Integer> result = new HashMap<Integer,Integer>();

        for (int num : nums) {
            result.put(num, num);
        }

        return result.size() > nums.length / 2 ? nums.length / 2 : result.size();
    
    }
}