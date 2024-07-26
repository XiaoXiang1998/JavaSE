package itxiang_67;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//對象序列化流
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		// 創建一個寫入指定的OutPutStream的ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_67\\oos.txt"));
		// 創建對象
		Student student = new Student("林青霞", 30);

		// 將指定的對象寫入ObjectOutputStream
		oos.writeObject(student);

		oos.close();
	}
}
