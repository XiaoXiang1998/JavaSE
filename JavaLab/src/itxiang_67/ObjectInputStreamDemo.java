package itxiang_67;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_67\\oos.txt"));

		// Object readObject():從ObjectInputStream讀取一個對象
		Object object = ois.readObject();

		Student student = (Student) object;

		System.out.println(student.getName() + "," + student.getAge());

		ois.close();
	}
}
