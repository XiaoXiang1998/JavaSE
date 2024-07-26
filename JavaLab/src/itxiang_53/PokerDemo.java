package itxiang_53;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
	public static void main(String[] args) {
		// 創建一個牌盒,也就是定義一個集合對象,用ArrayList集合實現
		ArrayList<String> list = new ArrayList<String>();

		// 往排盒裡面裝排
		/*
		 * ◆2, ◆3, ◆4..., ◆k,◆k 梅花2,..... 紅心2,... 黑桃2,..... 小王,大王
		 */
		// 定義花色數組
		String[] colors = { "♦", "♣", "♥", "♠" };
		// 定義點數數組
		String[] numbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		for (String color : colors) {
			for (String number : numbers) {
				list.add(color + number);
			}
		}
		list.add("小王");
		list.add("大王");
		// 洗牌,也就是把牌打散,用collections的shuffle()方法實現
		Collections.shuffle(list);

//		System.out.println(list);

		// 發牌 也就是邊勵集合,給三個玩家發牌
		ArrayList<String> laxArray = new ArrayList<String>();
		ArrayList<String> lyArray = new ArrayList<String>();
		ArrayList<String> fqyArray = new ArrayList<String>();
		ArrayList<String> dpArray = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			String poker = list.get(i);
			if (i >= list.size() - 3) {
				dpArray.add(poker);
			} else if (i % 3 == 0) {
				laxArray.add(poker);
			} else if (i % 3 == 1) {
				lyArray.add(poker);
			} else if (i % 3 == 2) {
				fqyArray.add(poker);
			}
		}

		// 看牌,也就是三個玩家分別編勵自己的排
		lookPoker("林青霞", laxArray);
		lookPoker("柳炎", lyArray);
		lookPoker("風清揚", fqyArray);
		lookPoker("底牌", dpArray);
	}

	public static void lookPoker(String name, ArrayList<String> list) {
		System.out.print(name + "的牌是:");
		for (String poker : list) {
			System.out.print(poker + " ");
		}
		System.out.println();
	}
}
