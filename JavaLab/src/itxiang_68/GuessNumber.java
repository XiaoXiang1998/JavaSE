package itxiang_68;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private GuessNumber() {
	}

	public static void start() {
		// 要完成猜數字的遊戲,首先需要有一個要猜的數字,使用隨機數生成該數字,範圍1到100
		Random random = new Random();
		int number = random.nextInt(100) + 1;

		while (true) {
			// 使用程序實現猜數字,每次均要輸入猜測的數字值,需要使用鍵盤錄入實現
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入你要猜的數字:");
			int guessNumber = scanner.nextInt();
			scanner.nextLine();
			// 比較輸入的數字和系統產生的數據,需要使用分支語句,這裡使用if...else...if...格式,根據不同情況進行猜測結果顯示
			if (guessNumber > number) {
				System.out.println("你猜的數字:" + guessNumber + "大了");
			} else if (guessNumber < number) {
				System.out.println("你猜的數字:" + guessNumber + "小了");

			} else {
				System.out.println("恭喜猜中");
				break;
			}
		}
	}
}
