package xiang_115;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// 獲取class對象
		Class<?> c = Class.forName("xiang_113.Student");

		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);

//		Field nameField = c.getField("name");
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "林青霞");
		System.out.println(obj);
		Field ageField = c.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(obj, 30);

		Field addressField = c.getDeclaredField("address");
		addressField.setAccessible(true);
		addressField.set(obj, "西安");
		System.out.println(obj);
	}
}
