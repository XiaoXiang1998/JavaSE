package itxiang_26;

public class MathDemo {

	public static void main(String[] args) {
		//public static int abc(int a): 返回參數的絕對值
		System.out.println(Math.abs(88));
		System.out.println(Math.abs(-88));
		
		System.out.println("------------");
		
		//public static double ceil(double a):  返回大於或等於參數的最小double值,等於一個整數
		System.out.println(Math.ceil(12.34));
		System.out.println(Math.ceil(12.56));
		System.out.println("----------");
		
		//public static double floor 返回小於或等於參數的最大double值,等於一個整數

		System.out.println(Math.floor(12.34));
		System.out.println(Math.floor(12.56));
		System.out.println("----------");
		
		//public static int round(float a):  按照四捨五入返回最接近參數的int
		System.out.println(Math.round(12.34F));
		System.out.println(Math.round(12.56F));
		System.out.println("----------");
		
		//public static max(int a,int b):返回兩個int值中的較大值
		System.out.println(Math.max(66, 88));
		//public static min (int a,int b):返回兩個int值中的較小值
		System.out.println(Math.min(66, 88));
		
		//public static double pow(double a,double b):返回a的b是次覓的值
		System.out.println(Math.pow(3.0, 5.0));
		
		//public static double random(): 返回值為double的正值,[0.0,1.0]
//		System.out.println(Math.random());
		System.out.println((int)(Math.random()*100)+1); //1-100

	}

}
