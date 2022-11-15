package leetcode;

import java.util.HashMap;
import java.util.Set;

public class 两数相加 {
    public static void main(String[] args) {
        
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            
        }
        return null;
    }
}
