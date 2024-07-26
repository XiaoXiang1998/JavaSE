package xiang_130;

public interface Stack<E> {
	/*
	 * 向棧頂壓入元素 Params: value-待壓入值 Returns: 壓入成功返回true,否則返回fasle
	 */
	boolean push(E value);

	/*
	 * 從棧頂彈出元素 Returns:棧非空返回棧頂元素,棧為空返回null
	 */
	E pop();

	/*
	 * 返回棧頂元素 不彈出 Returns:棧非空返回棧頂元素,棧為空返回null
	 */

	/*
	 * 返回棧頂元素,不彈出 Returns:棧非空返回棧頂元素,棧為空返回null
	 */
	E peek();

	/*
	 * 判斷棧是否為空 Returns:空返回true,否則返回false
	 */
	boolean isEmpty();

	/*
	 * 判斷棧是否為滿 Returns:滿返回true,否則返回false
	 */
	boolean isFull();
}
