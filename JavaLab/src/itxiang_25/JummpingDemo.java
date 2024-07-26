package itxiang_25;

public class JummpingDemo {

	public static void main(String[] args) {
		//需求:創建接口類操作的對象,調用method方法
		JumppingOperator jo=new JumppingOperator();
		Jummping j=new Cat();
		jo.method(j);
		
		System.out.println("-------------");
		
		jo.method(new Jummping() {
			
			@Override
			public void jump() {
				System.out.println("貓可以跳高了");
			}
		});
		
		jo.method(new Jummping() {
			
			@Override
			public void jump() {
				System.out.println("狗可以跳高了");
			}
		});
	}

}
