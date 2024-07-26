package xiang_121;

import java.util.Scanner;

public class Idvalidaator {
	public static void main(String[] args) {
		// 創建 Scanner 對象來讀取使用者輸入
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// 提示使用者輸入公司統一編號
			System.out.print("請輸入公司統一編號（8位數字）: ");
			String companyId = scanner.nextLine();

			// 驗證統一編號並輸出結果
			if (validate(companyId)) {
				System.out.println("有效的公司統一編號");
				break; // 跳出迴圈
			} else {
				System.out.println("無效的公司統一編號，請重新嘗試。");
			}
		}

		// 關閉 Scanner
		scanner.close();
	}

	public static boolean validate(String id) {
		// 檢查長度是否為8且是否全為數字
		if (id.length() != 8 || !id.matches("\\d{8}")) {
			return false;
		}

		// 定義權重數組
		int[] weights = { 1, 2, 1, 2, 1, 2, 4, 1 };
		int sum = 0;

		// 計算加權值和
		for (int i = 0; i < id.length(); i++) {
			int digit = Character.getNumericValue(id.charAt(i));
			int product = digit * weights[i];
			sum += product / 10 + product % 10; // 將加權值的數字和相加
			System.out.println(sum);
		}

		// 驗證條件
		if (sum % 5 == 0) {
			return true;
		} else if (id.charAt(6) == '7') {
			// 第七位是7的特殊處理
			int sum1 = sum - 1; // 用2替換28中的1
			int sum2 = sum - 8; // 用8替換28中的8
			System.out.println(sum1);
			System.out.println(sum2);
			return sum1 % 5 == 0 || sum2 % 5 == 0;
		} else {
			return false;
		}
	}
}
