package itxiang_28;

public class ArrayDemo {
	public static void main(String[] args) {
		//定義一個數組
		int[] arr= {24,69,80,57,13};
		System.out.println("排序前:"+arrayToString(arr));
//		
//		//第一次比較
//		for(int i=0;i<arr.length-1-0;i++) {
//			if(arr[i]>arr[i+1]) {
//				int temp=arr[i];
//				arr[i]=arr[i+1];
//				arr[i+1]=temp;
//			}
//		}
//		System.out.println("第一次比較後:"+arrayToString(arr));
//		
//		//第二次比較
//				for(int i=0;i<arr.length-1-1;i++) {
//					if(arr[i]>arr[i+1]) {
//						int temp=arr[i];
//						arr[i]=arr[i+1];
//						arr[i+1]=temp;
//					}
//				}
//				System.out.println("第二次比較後:"+arrayToString(arr));
//				//第三次比較
//				for(int i=0;i<arr.length-1-2;i++) {
//					if(arr[i]>arr[i+1]) {
//						int temp=arr[i];
//						arr[i]=arr[i+1];
//						arr[i+1]=temp;
//					}
//				}
//				System.out.println("第三次比較後:"+arrayToString(arr));
//				//第四次比較
//				for(int i=0;i<arr.length-1-3;i++) {
//					if(arr[i]>arr[i+1]) {
//						int temp=arr[i];
//						arr[i]=arr[i+1];
//						arr[i+1]=temp;
//					}
//				}
//				System.out.println("第四次比較後:"+arrayToString(arr));
			for(int x=0;x<arr.length-1;x++) {
				for(int i=0;i<arr.length-1-x;i++) {
					if(arr[i]>arr[i+1]) {
						int temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
				}
			}
			System.out.println("排序後:"+arrayToString(arr));

	}
	
	//把數組中的元素按照指定的規則組成一個字符串:[元素1,元素2]
	public static String arrayToString(int []arr) {
		StringBuilder sb =new StringBuilder();
		sb.append("[");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(",");
			}
		}
		sb.append("]");
		String s =sb.toString();
		return s;
	}
}
