package xiang_107;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		String[] strArray = { "林青霞,30", "柳炎,34", "張曼玉,35", "貂蟬,31", "王祖賢,33" };

		ArrayList<String> array = myFilter(strArray, s -> s.split(",")[0].length() > 2,
				s -> Integer.parseInt(s.split(",")[1]) > 33);
		for (String str : array) {
			System.out.println(str);
		}
	}

	// 通過Predicate接口的拼裝將符合要求的字符串篩選到集合ArrayList中,並編例ArrayList集合
	private static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1, Predicate<String> pre2) {
		// 定義一個集合
		ArrayList<String> array = new ArrayList<String>();

		// 邊例數組
		for (String str : strArray) {
			if (pre1.and(pre2).test(str)) {

				array.add(str);
			}
		}

		return array;
	}
}
