package itxiang_01;

import javax.imageio.ImageTranscoder;

public class Phone {
	//成員變量
	String brand;
	int price;
	
	//成員方法
	public void call() {
		System.out.println("打電話");
	}
	
	public void sendMessage() {
		System.out.println("發短信");
	}
}
