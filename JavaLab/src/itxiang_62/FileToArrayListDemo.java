package itxiang_62;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListDemo {

	public static void main(String[] args) throws IOException {
		// 創建字符緩衝輸入對象
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Javahometrain\\JavaLab\\src\\itxiang_62\\array.txt"));

		// 創建集合對象
		ArrayList<Student> arrayList = new ArrayList<Student>();

		// 調用字符緩衝輸入流對象的方法讀數據
		String line;
		while ((line = br.readLine()) != null) {
			// 把讀取到的數據用split()進行分割,得到一個字符串數組
			String[] strArray = line.split(",");

			// 創建學生對象
			Student s = new Student();
			// 把字符串數組中的每一個元素取出來對應腹值給學生對象的成員變量值
			s.setSid(strArray[0]);
			s.setName(strArray[1]);
			s.setAge(Integer.parseInt(strArray[2]));
			s.setAddress(strArray[3]);

			// 把學生對象添加到集合
			arrayList.add(s);
		}
		// 釋放資源
		br.close();

		for (Student student : arrayList) {
			System.out.println(
					student.getSid() + "," + student.getName() + "," + student.getAge() + "," + student.getAddress());
		}
	}

}
