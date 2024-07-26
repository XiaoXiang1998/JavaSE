package itxiang_53;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo02 {
	public static void main(String[] args) {
		// 創建HashMap ,鍵是編號,值是牌
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// 創建ArrayList,存儲編號
		ArrayList<Integer> array = new ArrayList<Integer>();

		// 創建花色數組和點數數組
		String[] colors = { "♦", "♣", "♥", "♠" };
		// 定義點數數組
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };

		// 從0開始往HashMap裡面存儲編號,並存儲對應的牌 同時往ArrayList裡面存儲編號
		int index = 0;
		for (String number : numbers) {
			for (String color : colors) {
				map.put(index, color + number);
				array.add(index);
				index++;
			}
		}
		map.put(index, "小王");
		array.add(index);
		index++;
		map.put(index, "大王");
		array.add(index);

		// 洗牌(洗的是編號),用Collections的shuffle()方法實現
		Collections.shuffle(array);

		// 發牌(發的也是編號,為了保證編號是排序的,創建TreeSet集合接收)
		TreeSet<Integer> laxSet = new TreeSet<Integer>();
		TreeSet<Integer> lySet = new TreeSet<Integer>();
		TreeSet<Integer> fqySet = new TreeSet<Integer>();
		TreeSet<Integer> dpSet = new TreeSet<Integer>();

		for (int i = 0; i < array.size(); i++) {
			int x = array.get(i);
			if (i >= array.size() - 3) {
				dpSet.add(x);
			} else if (i % 3 == 0) {
				laxSet.add(x);
			} else if (i % 3 == 1) {
				lySet.add(x);
			} else if (i % 3 == 2) {
				fqySet.add(x);
			}
		}
		// 調用看牌方法
		lookPoker("林青霞", laxSet, map);
		lookPoker("林青霞", lySet, map);
		lookPoker("林青霞", fqySet, map);
		lookPoker("底牌", dpSet, map);

	}

	// 定義方法看牌(邊勵TreeSet集合,獲取編號,到HashMap集合找對應的牌)
	public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> map) {
		System.out.print(name + "的牌是:");
		for (Integer key : ts) {
			String poker = map.get(key);
			System.out.print(poker + " ");
		}
		System.out.println();
	}
}
