package xiang_111;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
	public static void main(String[] args) {
		// 創建List集合對象
		List<String> list = new ArrayList<String>();

		list.add("林青霞");
		list.add("張曼玉");
		list.add("王祖賢");
		list.add("柳岩");
		/*
		 * // 需求1:得到名字為三個字的流 Stream<String> listStream = list.stream().filter(s ->
		 * s.length() == 3);
		 * 
		 * // 需求2:把使用Stream流操作完畢的數據收集到List集合中並編例 List<String> names =
		 * listStream.collect(Collectors.toList()); for (String name : names) {
		 * System.out.println(name); }
		 */

		// 創建set集合對象
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(33);
		set.add(35);

		// 需求3:得到年齡大於25的流
		Stream<Integer> setStream = set.stream().filter(age -> age > 25);

		// 需求4:把使用Stream流操作完畢的數據收集到set集合中並編例
		Set<Integer> ages = setStream.collect(Collectors.toSet());
		for (Integer age : ages) {
			System.out.println(age);
		}

		// 定義一個字符串數組,每一個字符串數據由姓名數據,和年齡數據組合而成
		String[] strArray = { "林青霞,30", "張曼玉,35", "王祖賢,33", "柳岩,25" };

		// 需求5:得到字符串中年齡數據大於28的流
		Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);

		// 需求6:把使用Stram流操作完畢的數據收集到map集合中並編例,字符串中的姓名做鍵,年齡做值
		Map<String, Integer> map = arrayStream
				.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + "," + value);
		}
	}
}
