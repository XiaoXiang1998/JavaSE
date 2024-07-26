package itxiang_38;

import java.util.HashSet;
import java.util.Set;
/*
 * set集合特點
 * 不包含重複元素的集合
 * 沒有帶索引的方法,所以不能使用普通for循環邊勵
 * 
 * HashSet:對集合的迭代順序不做任何保證
 */
public class SetDemo {
	public static void main(String[] args) {
		//創建集合對象
		Set<String> set=new HashSet<String>();
		
		//添加元素
		set.add("hello");
		set.add("world");
		set.add("java");
		//不包含重複元素
		set.add("world");

		for (String string : set) {
			System.out.println(string);
		}
	}
}
