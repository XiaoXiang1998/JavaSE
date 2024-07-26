package xiang_116;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo02 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 獲取class對象
		Class<?> c = Class.forName("xiang_113.Student");

		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();

		// s.method1();

		Method m1 = c.getMethod("method1");
		m1.invoke(obj);

		Method m2 = c.getMethod("method2", String.class);
		m2.invoke(obj, "林青霞");

		Method m3 = c.getMethod("method3", String.class, int.class);
		Object o = m3.invoke(obj, "林青霞", 30);
		System.out.println(o);

		// s.function();
		Method m4 = c.getDeclaredMethod("function");
		m4.setAccessible(true);
		m4.invoke(obj);
	}
}
