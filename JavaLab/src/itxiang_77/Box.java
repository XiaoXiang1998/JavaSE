package itxiang_77;

public class Box {
	// 定義成員變量,表示第x瓶奶,提供存儲牛奶和獲取牛奶的操作
	private int milk;
	// 定義一個成員變量,表示奶香的狀態
	private boolean state = false;

	// 提供存儲牛奶和獲取牛奶的操作
	public synchronized void put(int milk) {
		// 如果有牛奶,等待消費
		if (state) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 如果沒有牛奶就生產牛奶
		this.milk = milk;
		System.out.println("送奶工將第" + this.milk + "瓶放入奶箱");

		// 生產完畢之後,修改奶香狀態
		state = true;

		// 喚醒其他等待的線程
		notifyAll();
	}

	public synchronized void get() {
		// 如果沒有牛奶,等待生產
		if (!state) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 如果有牛奶,就消費牛奶
		System.out.println("用戶拿到第" + this.milk + "瓶奶");

		// 修改完畢之後,修改奶香狀態
		state = false;

		// 喚醒其他等待的線程
		notifyAll();
	}
}
