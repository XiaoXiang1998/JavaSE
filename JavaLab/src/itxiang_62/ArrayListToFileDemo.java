package itxiang_62;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		// 創建Arraylist集合
		ArrayList<Student> arrayList = new ArrayList<Student>();

		// 把學生對象添加到集合中
		arrayList.add(new Student("001", "林青霞", 30, "西安"));
		arrayList.add(new Student("002", "張曼玉", 35, "武漢"));
		arrayList.add(new Student("003", "王祖賢", 33, "鄭州"));

		// 創建字符緩衝流輸出對象
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_62\\array.txt"));

		// 邊立即和,得到每一個學生對象
		for (Student s : arrayList) {
			// 把學生對象拼接成指定格式的字符串
			StringBuilder sb = new StringBuilder();
			sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",")
					.append(s.getAddress());

			// 調用字符緩衝輸出流對象的方法寫數據
//			bw.write(sb.toString());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
