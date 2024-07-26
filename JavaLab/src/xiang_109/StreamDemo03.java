package xiang_109;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo03 {
	public static void main(String[] args) {

		// 創建一個集合,存儲多個字符串元素
		ArrayList<String> list = new ArrayList<String>();

		list.add("林青霞");
		list.add("張曼玉");
		list.add("王祖賢");
		list.add("柳岩");
		list.add("張敏");
		list.add("張無忌");

		// 需求1:取前4個數據組成一個流
		Stream<String> s1 = list.stream().limit(4);

		// 需求2:跳過2個數據組成一個流

		Stream<String> s2 = list.stream().skip(2);

		// 需求3:合併需求1和需求2得到的流,並把結果在控制台輸出
//		Stream.concat(s1, s2).forEach(System.out::println); //合併a和b兩個為一個流 concat

		// 需求4:合併需求1和需求2得到的流,並把結果在控制台輸出,要求字符串元素不能重複
		Stream.concat(s1, s2).distinct().forEach(System.out::println); // 返回由該流的不同元素 distinct()

	}
}
