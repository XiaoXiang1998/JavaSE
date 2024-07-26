package xiang_129;

public interface Queue<E> {

	// 向隊列尾插入值
	// Params:value-待插入值
	// Returns:插入成功返回true,失敗返回false
	boolean offer(E value);

	// 從對列頭獲取值,並移除
	// Returns:如果對列非空返回對頭值 否則返回null
	E poll();

	// 從對列頭獲取值,步移除
	// Returns:如果對列非空返回對頭值 否則返回null
	E peek();

	// 檢查對列是否為空
	// Returns:空返回true,否則返回false
	boolean isEmpty();

	/*
	 * 檢查對列是否已滿
	 * 
	 * @return 滿返回ture,否則返回false
	 */

	boolean isFull();
}
