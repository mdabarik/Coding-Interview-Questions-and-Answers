import java.util.HashMap;

public class MostFrequent {
	public static void main(String[] args) {
		int[] nums = {1, 2, 1, 2, 1, 3};
		System.out.println(most_frequent(nums));
	}
	public static Integer most_frequent(int[] nums) {
		int max_count = -1, mf = 0;
		int len = nums.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<len; i++) {
			if(map.containsKey(nums[i])) {
				int newVAl = map.get(nums[i]);
				map.put(nums[i], newVAl);
			} else {
				map.put(nums[i], 1);
			}
			if(map.get(nums[i]) > max_count) {
				max_count = map.get(nums[i]);
				mf = map.get(nums[i]);
			}
		}
		return mf;
	}
}