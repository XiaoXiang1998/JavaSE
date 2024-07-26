package xiang_132;

public class TestPriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue1<Entry> queue = new PriorityQueue1<Entry>(5);
		queue.offer(new Entry("taks1", 4));
		queue.offer(new Entry("taks1", 3));
		queue.offer(new Entry("taks1", 2));
		queue.offer(new Entry("taks1", 5));
		queue.offer(new Entry("taks1", 1));
		for (Entry entry : queue) {
			System.out.println(entry);
		}
		System.out.println("-------------");
		queue.poll().priority();
		queue.poll().priority();
		for (Entry entry : queue) {
			System.out.println(entry);
		}
	}
}
