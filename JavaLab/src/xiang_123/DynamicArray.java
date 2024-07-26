package xiang_123;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

//動態數組
public class DynamicArray implements Iterable<Integer> {

	public static void main(String[] args) {
		DynamicArray dynamicArray = new DynamicArray();
//		dynamicArray.addLast(1);
//		dynamicArray.addLast(2);
//		dynamicArray.addLast(3);
//		dynamicArray.addLast(4);
		// dynamicArray.addLast(5);
//		dynamicArray.add(2, 5);

//		for (int i = 0; i < dynamicArray.size; i++) {
//			System.out.println(dynamicArray.get(i));
//		}

//		dynamicArray.forEach((element) -> {
//			System.out.println(element);
//		});
//		for (Integer element : dynamicArray) { // hasNext() next()
//			System.out.println(element);
//		}

//		dynamicArray.stream().forEach(element -> {
//			System.out.println(element);
//		});
//		int removed = dynamicArray.remove(1);
//		System.out.println(removed);
//		dynamicArray.stream().forEach(ele -> {
//			System.out.println(ele);
//		});

		for (int i = 0; i < 9; i++) {
			dynamicArray.addLast(i + 1);
			System.out.println(dynamicArray.get(i));
		}
		dynamicArray.forEach1(element -> {
			System.out.println(element);
		});

	}

	private int size = 0; // 邏輯大小
	private int capacity = 8; // 容量
	private int[] array = {};

	public void addLast(int element) {
//		array[size] = element;
//		size++;
		add(size, element);
	}

	public void add(int index, int element) {
		checkAndGrow();

		// 添加邏輯
		if (index >= 0 && index < size) {
			System.arraycopy(array, index, array, index + 1, size - index);

		}

		array[index] = element;
		size++;
	}

	private void checkAndGrow() {
		// 容量檢查

		if (size == 0) {
			array = new int[capacity];
		} else if (size == capacity) {
			// 進行擴容,1.5倍 1.618 2
			capacity += capacity >> 1;
			int[] newArray = new int[capacity];
			System.arraycopy(array, 0, newArray, 0, size);
			array = newArray;
		}
	}

	public int get(int index) {
		return array[index];
	}

	public void forEach1(Consumer<Integer> consumer) {
		for (int i = 0; i < size; i++) {
			// System.out.println(array[i]);
			// 提供array[i]
			// 返回 void
			consumer.accept(array[i]);
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			int i = 0;

			@Override
			public Integer next() { // 返回當前元素,並移動到下一個元素
				// TODO Auto-generated method stub
				return array[i++];
			}

			@Override
			public boolean hasNext() { // 有沒有下一個元素
				// TODO Auto-generated method stub
				return i < size;
			}
		};
	}

	public IntStream stream() {
		return IntStream.of(Arrays.copyOfRange(array, 0, size)); // 從0開始不包含size
	}

	public int remove(int index) { // [0...size)
		int removed = array[index];
		if (index < size - 1) {
			System.arraycopy(array, index + 1, array, index, size - index - 1);
		}
		size--;
		return removed;
	}
}
