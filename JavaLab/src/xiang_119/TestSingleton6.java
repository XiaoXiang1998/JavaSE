package xiang_119;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSingleton6 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<Singleton6> c = new Callable<Singleton6>() {

			@Override
			public Singleton6 call() throws Exception {

				return Singleton6.getInstance();
			}
		};
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Singleton6> submit = es.submit(c);
		Future<Singleton6> submit2 = es.submit(c);

		Singleton6 singleton5 = submit.get();
		Singleton6 singleton52 = submit2.get();

		System.out.println(singleton5 == singleton52);
		System.out.println(singleton5);
		System.out.println(singleton52);

		es.shutdown();
	}
}
