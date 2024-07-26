package xiang_122;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = { 3, 5, 6, 9, 7, 1, 2 };
		int linearSearch = Linearsearch(a, 5);
		System.out.println(linearSearch);
	}

	public static int Linearsearch(int[] a, int target) {
		int m = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {

				return i;
			}

		}
		return -1;
	}
}
