package xiang_110;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		// 創建集合
		ArrayList<String> manList = new ArrayList<String>();
		manList.add("周潤發");
		manList.add("成龍");
		manList.add("劉德華");
		manList.add("吳京");
		manList.add("周星馳");
		manList.add("李連杰");

		ArrayList<String> womanList = new ArrayList<String>();
		womanList.add("林心如");
		womanList.add("張曼玉");
		womanList.add("林青霞");
		womanList.add("柳岩");
		womanList.add("林志玲");
		womanList.add("王祖賢");
		/*
		 * // 男演員只要名字為3的前三人 Stream<String> manStream = manList.stream().filter(s ->
		 * s.length() == 3).limit(3);
		 * 
		 * // 女演員只要姓林的,並且不要第一個 Stream<String> womanStream = womanList.stream().filter(s
		 * -> s.startsWith("林")).skip(1);
		 * 
		 * // 把過濾後男演員姓名和女演員姓名合併到一起 Stream<String> stream = Stream.concat(manStream,
		 * womanStream);
		 * 
		 * // 把上一步操作的元素作為構造方法的參數創建演員對象,邊例數據 //
		 * stream.map(Actor::new).forEach(System.out::println);
		 * stream.map(Actor::new).forEach(p -> System.out.println(p.getName()));
		 */

		Stream.concat(manList.stream().filter(s -> s.length() == 3).limit(3),
				womanList.stream().filter(s -> s.startsWith("林")).skip(1)).map(Actor::new)
				.forEach(p -> System.out.println(p.getName()));

	}
}
