import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {11, 15, 3, 7};
        int target = 17;
        System.out.println(two_sum(nums, target));
    }
    public static boolean two_sum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<len; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return true;
            } else {
                map.put(nums[i], nums[i]);
            }
        }
        return false;
    }
}