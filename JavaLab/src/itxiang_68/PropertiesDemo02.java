package itxiang_68;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
	public static void main(String[] args) {
		// 創建集合對象
		Properties properties = new Properties();

		// Object setProperty(String key,String value):設置集合的鍵和值,都是String
		// 類型,底層調用Hashtable方法 put
		properties.setProperty("001", "林青霞");

		properties.setProperty("002", "張曼玉");
		properties.setProperty("003", "王祖賢");

		// String getProperty(String key):使用此屬性列表中指定的鍵搜索屬性
//		System.out.println(properties.getProperty("001"));
//		System.out.println(properties.getProperty("0011"));

//		System.out.println(properties);

		// Set<String> stringPropertyNames():從該屬性列表中返回一個不可修改的鏈集,其中鍵及其對應的值是字符串
		Set<String> names = properties.stringPropertyNames();

		for (String key : names) {
//			System.out.println(key);

			String value = properties.getProperty(key);
			System.out.println(key + "," + value);
		}
	}

}
