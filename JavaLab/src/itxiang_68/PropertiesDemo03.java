package itxiang_68;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo03 {
	public static void main(String[] args) throws IOException {
		// 把集合中的數據保存到文件
//		myStroe();
		// 把文件中的數據加載到集合
		myLoad();
	}

	private static void myLoad() throws IOException {
		Properties properties = new Properties();

		// void Load(Reader reader):
		FileReader fr = new FileReader("C:\\Javahometrain\\JavaLab\\src\\itxiang_68\\fw.txt");
		properties.load(fr);
		fr.close();
		System.out.println(properties);
	}

	private static void myStroe() throws IOException {
		Properties properties = new Properties();

		properties.setProperty("001", "林青霞");
		properties.setProperty("002", "張曼玉");
		properties.setProperty("003", "王祖賢");

		// void store(Writer writer,String comments)
		FileWriter fw = new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_68\\fw.txt");
		properties.store(fw, null);
		fw.close();
	}
}
