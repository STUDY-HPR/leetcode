import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49_Group_Anagrams {

	public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> map = new HashMap<>();

		for (String str : strs) {

			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String temp = new String(arr);

			if (!map.containsKey(temp)) {
				map.put(temp, new ArrayList<>());
			}
			map.get(temp).add(str);
		}

		return new ArrayList<>(map.values());
	}
}
