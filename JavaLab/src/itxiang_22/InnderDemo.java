package itxiang_22;
//測試類
public class InnderDemo {
	public static void main(String[] args) {
		//創建內部類對象,並調用方法
//		Outer.Inner oi =new Outer().new Inner();
//		oi.show();
		Outer outer=new Outer();
		outer.method();
	}
}
