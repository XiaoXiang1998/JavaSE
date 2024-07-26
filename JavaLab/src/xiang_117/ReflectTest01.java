package xiang_117;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectTest01 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// 創建集合
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

//		arrayList.add(10);
//		arrayList.add(20);

		Class<? extends ArrayList> c = arrayList.getClass();
		Method m = c.getMethod("add", Object.class);
		m.invoke(arrayList, "hello");
		m.invoke(arrayList, "world");
		m.invoke(arrayList, "java");

		System.out.println(arrayList);
	}
}
