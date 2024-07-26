package itxiang_01;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone phone=new Phone();	
		
		//使用成員變量
		System.out.println(phone.brand);
		System.out.println(phone.price);
		
		phone.brand="小米";
		phone.price=2999;
		System.out.println(phone.brand);
		System.out.println(phone.price);
		
		//使用成員方法
		phone.call();
		phone.sendMessage();
	}
	
}
