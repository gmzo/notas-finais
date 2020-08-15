package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Student student1 = new Student();
		
		System.out.print("NAME: ");
		student1.setName(sc.nextLine());

		System.out.print("GRADE FIRST QUARTER: ");
		student1.setGradeFirstQuarter(sc.nextDouble());

		System.out.print("GRADE SECOND QUARTER: ");
		student1.setGradeSecondQuarter(sc.nextDouble());

		System.out.print("GRADE THIRD QUARTER: ");
		student1.setGradeThirdQuarter(sc.nextDouble());

		sc.close();

		student1.finalResult(student1.getGradeFirstQuarter(), student1.getGradeSecondQuarter(), student1.getGradeThirdQuarter());

	}

}
