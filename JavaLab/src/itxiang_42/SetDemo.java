package itxiang_42;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// 創建set集合對象
//		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set = new TreeSet<Integer>();

		// 創建隨機數對象
		Random random = new Random();

		// 判斷集合的長度是不是小於10
		while (set.size() < 10) {
			// 產生一個隨機數,添加到集合
			int num = random.nextInt(20) + 1;
			set.add(num);
		}

		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
}
