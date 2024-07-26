package xiang_117;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest02 {
	public static void main(String[] args)
			throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*
		 * class.txt className=xxx methodName=xxx
		 */

		// 加載數據
		Properties prop = new Properties();
		FileReader fr = new FileReader("C:\\Javahometrain\\JavaLab\\src\\xiang_117\\class.txt");
		prop.load(fr);
		fr.close();

		/*
		 * className=itxiang_117.Student methodName=study
		 * 
		 */
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");

		// 通過反射來使用
		Class<?> c = Class.forName(className); // itxiang_117.Student
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();

		Method m = c.getMethod(methodName); // study
		m.invoke(obj);
	}
}
