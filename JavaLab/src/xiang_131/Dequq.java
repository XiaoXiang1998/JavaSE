package xiang_131;

/*
 * 雙端隊列接口
 * Type parameters:<E> -隊列中 元素類型
 */
public interface Dequq<E> {

	/*
	 * 
	 */

	boolean offerFirst(E e);

	boolean offerLast(E e);

	E pollFirst();

	E pollLast();

	E peekFirst();

	E peekLast();

	boolean isEmpty();

	boolean isFull();
}
