package com.itxiang;

public class Test03 {

	public static void main(String[] args) {
		//第一層循環,用於表示雞翁的範圍,初始化表達式的變量定義為x =0,判斷條件是x<=20
		for(int x=0;x<=20;x++) {
			//第2層循環,用於表示雞母的範圍,初始化表達式的變量定義為y=0,判斷條件是y<=33
			for(int y=0;y<=33;y++) {
				//這個時候,用於表示雞除的變量z=100-x-y
				int z = 100 -x -y;
				
				//判斷表達式 z%3==0 和表達式5*x+3*y +z/3 =100 是否同時成立
				if(z %3==0 &&5*x+3*y +z/3==100) {
					System.out.println(x+","+y+","+z);
				}
			}
		}
	}

}
