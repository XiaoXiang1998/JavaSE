package itxiang_27;

public class SystemDemo {
	public static void main(String[] args) {
		System.out.println("開始");
		//public static void exit(int status):終止當前運行的java虛擬機,非零表示異常中止
//		System.exit(0);
		System.out.println("結束");
			
		
		//public static long currentTimeMillis():返回當前時間(以毫秒為單位)
//		System.out.println(System.currentTimeMillis());
		
		System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365	+"年");
		
		long start=System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			System.out.println(i);
		}
		long end=System.currentTimeMillis();
		System.out.println("共耗時"+(end-start)+"毫秒");
	}	
}
