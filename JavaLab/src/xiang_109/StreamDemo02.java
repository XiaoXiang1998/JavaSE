package xiang_109;

import java.util.ArrayList;

public class StreamDemo02 {
	public static void main(String[] args) {

		// 創建一個集合,存儲多個字符串元素
		ArrayList<String> list = new ArrayList<String>();

		list.add("林青霞");
		list.add("張曼玉");
		list.add("王祖賢");
		list.add("柳岩");
		list.add("張敏");
		list.add("張無忌");

		// 需求1:取前三個數據在控制台輸出
		list.stream().limit(3).forEach(System.out::println);
		System.out.println("---------------");
		// 需求2:跳過3個元素,把剩下的元素在控制台輸出
		list.stream().skip(3).forEach(System.out::println);
		System.out.println("---------------");
		// 需求3:跳過2個元素,把剩下的元素中前2個在控制台輸出
		list.stream().skip(2).limit(2).forEach(System.out::println);
	}
}
