import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {

	public int[] twoSum(int[] nums, int target) {

		int[] answer = new int[2];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int num = nums[i];

			if (map.containsKey(target - num)) {
				return new int[] {map.get(target - num), i};
			}
			map.put(num, i);
		}
		return null;
	}
}
