package xiang_114;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo03 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 獲取class對象
		Class<?> c = Class.forName("xiang_113.Student");

		// private Student(String name)
		// Constructor<T> getDeclaredConstructor(Class<?>...parameterTypes)
		Constructor<?> con = c.getDeclaredConstructor(String.class);

		// 暴力反射
		// public void setAccessible(boolean flag):值為true,取消訪問檢查
		con.setAccessible(true);
		Object obj = con.newInstance("林老母");
		System.out.println(obj);
	}
}
