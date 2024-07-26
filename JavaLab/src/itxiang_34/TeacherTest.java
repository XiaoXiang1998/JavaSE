package itxiang_34;

import java.util.Scanner;

public class TeacherTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("請輸入分數:");
		int score=scanner.nextInt();
		
		Teacher teacher=new Teacher();
		try {
			teacher.checkScore(score);
		} catch (ScoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
