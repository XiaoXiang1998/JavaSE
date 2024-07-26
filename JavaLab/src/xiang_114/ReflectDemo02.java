package xiang_114;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("xiang_113.Student");

		// public Student(String name, int age, String address)
		// Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor<?> constructor = c.getConstructor(String.class, int.class, String.class);

		// T newInstance(Object...initargs)
		Object obj = constructor.newInstance("林青霞", 30, "西安");
		System.out.println(obj);
	}
}
