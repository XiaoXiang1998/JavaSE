package xiang_119;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSingleton5 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<Singleton5> c = new Callable<Singleton5>() {

			@Override
			public Singleton5 call() throws Exception {

				return Singleton5.getInstance();
			}
		};
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Singleton5> submit = es.submit(c);
		Future<Singleton5> submit2 = es.submit(c);

		Singleton5 singleton5 = submit.get();
		Singleton5 singleton52 = submit2.get();

		System.out.println(singleton5 == singleton52);
		System.out.println(singleton5);
		System.out.println(singleton52);

		es.shutdown();
	}
}
