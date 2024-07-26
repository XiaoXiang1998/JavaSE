package itxiang_10;

public class PhoneDemo {

	public static void main(String[] args) {
		//創建對象 調用方法
		Phone phone =new Phone();
		phone.call("林青霞");
		System.out.println("-------------");
		
		NewPhone newPhone =new NewPhone();
		newPhone.call("林青霞");
	}

}
