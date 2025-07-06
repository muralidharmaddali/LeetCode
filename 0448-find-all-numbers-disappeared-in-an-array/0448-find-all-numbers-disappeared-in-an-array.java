import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            hm.put(num, 1); 
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!hm.containsKey(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
