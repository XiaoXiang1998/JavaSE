package itxiang_34;

public class Teacher {
	public void checkScore(int score) throws ScoreException  {
		if(score<0 ||score>100) {
//			throw new ScoreException();
			throw new ScoreException("你給的分數有誤,分數應該在0-100之間");

		}else {
			System.out.println("分數正常");
		}
	}
}
