package xiang_116;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo01 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 獲取class對象
		Class<?> c = Class.forName("xiang_113.Student");

		// Method[] getMethods() 返回一个包含 方法对象的数组， 方法对象反映此
		// 类对象所表示的类或接口的所有公共方法，包括由类或接口声明的那些以及从超类和超接口继承的那些。
		// Method[] getDeclaredMethods() 返回一个包含 方法对象的数组， 方法对象反映此
		// 类对象表示的类或接口的所有已声明方法，包括public，protected，default（package）访问和私有方法，但不包括继承的方法。
//		Method[] methods = c.getMethods();
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

		System.out.println("-------------");

		// Method getMethod​(String name, 类<?>... parameterTypes) 返回 方法对象，该对象反映此
		// 类对象表示的类或接口的指定公共成员方法。
		// Method getDeclaredMethod​(String name, 类<?>... parameterTypes) 返回 方法对象，该对象反映此
		// 类对象表示的类或接口的指定声明方法
		Method m = c.getMethod("method1");

		// 獲取無參構造方法創建對象
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();

		// Object invoke(Object obj,Object ...args)在具有指定參數的指定對象調用此方法對象表示的基礎方法
		// Object:返回值類型
		// obj:調用方法的對象
		// args:方法需要的參數
		m.invoke(obj);

	}
}
