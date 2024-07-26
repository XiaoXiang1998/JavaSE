package xiang_104;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String[] args) {
		// 構造使用的場景

		// 定義集合,存儲字符串元素
		ArrayList<String> array = new ArrayList<String>();

		array.add("cccc");
		array.add("aa");
		array.add("b");
		array.add("ddd");
		System.out.println("排序前:" + array);

//		Collections.sort(array);
		Collections.sort(array, getComparator());
		System.out.println("排序後" + array);
	}

	private static Comparator<String> getComparator() {
		// 匿名內部類的方法實現
//		Comparator<String> comp = new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.length() - s2.length();
//			}
//		};
//		return comp;
//		return new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.length() - s2.length();
//			}
//		};
//		return (String s1, String s2) -> {
//			return s1.length() - s2.length();
//		};
		return (s1, s2) -> s1.length() - s2.length();
	}
}
