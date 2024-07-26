package xiang_119;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSingleton4 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		Singleton4 s1 = Singleton4.getInstance();
//		Singleton4 s2 = Singleton4.getInstance();
//
//		System.out.println(s1 == s2);
//		System.out.println(s1);
//		System.out.println(s2);

		Callable<Singleton4> c = new Callable<Singleton4>() {

			@Override
			public Singleton4 call() throws Exception {

				return Singleton4.getInstance();
			}
		};
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Singleton4> submit = es.submit(c);
		Future<Singleton4> submit2 = es.submit(c);

		Singleton4 singleton4 = submit.get();
		Singleton4 singleton42 = submit2.get();

		System.out.println(singleton4 == singleton42);
		System.out.println(singleton4);
		System.out.println(singleton42);

		es.shutdown();
	}
}
