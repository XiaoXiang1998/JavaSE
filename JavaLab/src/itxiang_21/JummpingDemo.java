package itxiang_21;

public class JummpingDemo {

	public static void main(String[] args) {
		//創建操作類對象,並調用方法
		JummpingOperator jo =new JummpingOperator();
		Jummping j =new Cat();
		jo.useJumpping(j);
		Jummping j2= jo.getJummping(); //new Cat();
		j2.jump();
	}

}
