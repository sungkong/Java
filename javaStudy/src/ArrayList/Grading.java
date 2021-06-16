package ArrayList;

import java.util.ArrayList;

public class Grading {

	public static void main(String[] args) {
		
		Student Lee = new Student(1001, "Lee");
		Student Kim = new Student(1002, "Kim");
		
		Lee.addSubject("국어", 90);
		Lee.addSubject("수학", 50);
		
		Kim.addSubject("국어", 90);
		Kim.addSubject("수학", 50);
		
		Lee.showScoreInfo();
		Kim.showScoreInfo();
	}

}
