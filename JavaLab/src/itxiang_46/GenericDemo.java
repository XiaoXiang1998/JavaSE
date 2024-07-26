package itxiang_46;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	public static void main(String[] args) {
		// 類型通配符:<?>
		List<?> list1 = new ArrayList<Object>();
		List<?> list2 = new ArrayList<Number>();
		List<?> list3 = new ArrayList<Integer>();
		System.out.println("-------------");
		// 類型通配符上限:<? extends 類型>
//		List<? extends Number> list4=new ArrayList<Object>(); 上限是number Object更大 不行
		List<? extends Number> list5 = new ArrayList<Number>();
		List<? extends Number> list6 = new ArrayList<Integer>();
		System.out.println("-------------");

		// 類型通配符下限:<? super類型>
		List<? super Number> list7 = new ArrayList<Object>();
		List<? super Number> list8 = new ArrayList<Number>();
//		List<? super Number> list8 = new ArrayList<Integer>(); 比number更小的 不行 會報錯

	}
}
