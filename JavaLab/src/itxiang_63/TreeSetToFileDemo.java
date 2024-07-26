package itxiang_63;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
	public static void main(String[] args) throws IOException {
		// 創建Treeset集合,透過比較器排序進行排序
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// 總成績從高到低
				int num = o2.getSum() - o1.getSum();
				// 次要條件
				int num2 = num == 0 ? o1.getChinese() - o2.getChinese() : num;
				int num3 = num2 == 0 ? o1.getMath() - o2.getMath() : num2;
				int num4 = num3 == 0 ? o1.getName().compareTo(o2.getName()) : num3;
				return num4;
			}
		});

		// 鍵盤路入學生數據
		for (int i = 0; i < 5; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("請錄入第" + (i + 1) + "個學生訊息");
			System.out.println("姓名:");
			String name = scanner.nextLine();
			System.out.println("語文成績:");
			int chinese = scanner.nextInt();
			scanner.nextLine();
			System.out.println("數學成績:");
			int math = scanner.nextInt();
			scanner.nextLine();
			System.out.println("英文成績:");
			int english = scanner.nextInt();
			scanner.nextLine();

			// 創建學生對象,把鍵盤錄入的對象的數據對應賦值給學生對象的成員變量
			Student student = new Student();
			student.setName(name);
			student.setChinese(chinese);
			student.setMath(math);
			student.setEnglish(english);

			// 把學生對象添加到TreeSet集合中
			ts.add(student);
		}

		// 創建字節緩衝輸出流對象
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_63\\ts.txt"));

		// 邊立即和 得到每一個學生對象
		for (Student s : ts) {
			// 把學生對象的數據拼接成指定格式的字符串
			StringBuilder sb = new StringBuilder();
			sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",")
					.append(s.getEnglish()).append(",").append(s.getSum());

			// 調用字符緩衝輸出流的方法寫數據
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
