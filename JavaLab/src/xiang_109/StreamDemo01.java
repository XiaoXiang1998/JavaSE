package xiang_109;

import java.util.ArrayList;

/*
 * Stream<T> filter(Predicate predicate):用於對流中的數據進行過濾
 * Predicate接口中的方法boolean test(T t):對給定的參數進行判斷,返回一個布爾值
 */
public class StreamDemo01 {
	public static void main(String[] args) {
		// 創建一個集合,存儲多個字符串元素
		ArrayList<String> list = new ArrayList<String>();

		list.add("林青霞");
		list.add("張曼玉");
		list.add("王祖賢");
		list.add("柳岩");
		list.add("張敏");
		list.add("張無忌");

		// 需求1:把list集合中以張開頭的元素在控制台輸出
//		list.stream().filter((String s) -> {
//			return s.startsWith("張");
//		}).forEach(System.out::println);
		list.stream().filter(s -> s.startsWith("張")).forEach(System.out::println);
		System.out.println("----------");
		// 需求2 把list集合中長度為3的元素在控制台輸出
		list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
		System.out.println("----------");
		// 需求3:把list集合中長度以張開頭,長度為3的在控制台輸出
		list.stream().filter(s -> s.startsWith("張")).filter(s -> s.length() == 3).forEach(System.out::println);
	}
}
