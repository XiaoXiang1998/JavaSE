package xiang_109;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		// Collection體系的集合可以使用默認方法Stream()生成流
		List<String> list = new ArrayList<String>();
		Stream<String> liststream = list.stream();

		Set<String> set = new HashSet<String>();
		Stream<String> setStream = set.stream();

		// Map體系的間接生成流
		Map<String, Integer> map = new HashMap<String, Integer>();
		Stream<String> stream = map.keySet().stream();
		Stream<Integer> stream2 = map.values().stream();
		Stream<Entry<String, Integer>> stream3 = map.entrySet().stream();

		// 數組可以通過Stream接口的靜態方法of(T..values)生成流
		String[] strArray = { "hello", "world", "java" };
		Stream<String> strArrayStream = Stream.of(strArray);
		Stream<String> strArrayStream2 = Stream.of("hello", "world", "java");

		Stream<Integer> intStream = Stream.of(10, 20, 30);

	}
}
