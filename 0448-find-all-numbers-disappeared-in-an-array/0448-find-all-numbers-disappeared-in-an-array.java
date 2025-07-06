import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Step 1: Store all numbers in hashmap
        for (int num : nums) {
            hm.put(num, 1); // value doesn't matter, we just need to know it's present
        }

        // Step 2: Check from 1 to n which number is missing
        for (int i = 1; i <= nums.length; i++) {
            if (!hm.containsKey(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
