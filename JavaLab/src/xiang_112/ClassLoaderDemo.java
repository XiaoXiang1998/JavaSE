package xiang_112;

public class ClassLoaderDemo {
	public static void main(String[] args) {
		// static ClassLoader getSystemClassLoader():返回用於委派的系統類加載器
		ClassLoader c = ClassLoader.getSystemClassLoader();
		System.out.println(c); // AppClassLoader

		// ClassLoader getParent():返回父類加載器委派
		ClassLoader c2 = c.getParent();
		System.out.println(c2); // PlatformClassLoader

		ClassLoader c3 = c2.getParent();
		System.out.println(c3);
	}
}
