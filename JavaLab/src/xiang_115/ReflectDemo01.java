package xiang_115;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 獲取class對象
		Class<?> c = Class.forName("xiang_113.Student");

		// Field[] getFields() Field[] fields = c.getFields();
		// 返回一个包含 字段对象的数组， 字段对象反映此 类对象所表示的类或接口的所有可访问公共字段。
		// Field [] getDeclaredFields()
		// 返回 字段对象的数组， 字段对象反映由此 类对象表示的类或接口声明的所有字段。
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("---------");
		// Filed 字段 getField​(String name) 返回 字段对象，该对象反映此 类对象表示的类或接口的指定公共成员字段。
		// 字段 getDeclaredField​(String name) 返回 字段对象，该对象反映此 类对象表示的类或接口的指定声明字段。
		Field addressFiled = c.getField("address");

		// 獲取無參構造方法創建對象
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();

		// Field類提供有關類或接口的單個字段的信息和動態訪問
		// void set(Object obj,Object value) 將指定的參數中由此filed對象表示的字段設置為指定的新值
		addressFiled.set(obj, "西安"); // 給obj的成員變量addressFiled賦值為西安

	}
}
