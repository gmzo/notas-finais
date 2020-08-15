package entities;

public class Student {

	private String name;
	private double gradeFirstQuarter;
	private double gradeSecondQuarter;
	private double gradeThirdQuarter;

	// Construtores
	public Student() {

	}

	public Student(String name, double gradeFirstQuarter, double gradeSecondQuarter, double gradeThirdQuarter) {

		this.name = name;
		this.gradeFirstQuarter = gradeFirstQuarter;
		this.gradeSecondQuarter = gradeSecondQuarter;
		this.gradeThirdQuarter = gradeThirdQuarter;
	}

	// Getters e setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGradeFirstQuarter() {
		return gradeFirstQuarter;
	}

	public void setGradeFirstQuarter(double gradeFirstQuarter) {
		this.gradeFirstQuarter = gradeFirstQuarter;
	}

	public double getGradeSecondQuarter() {
		return gradeSecondQuarter;
	}

	public void setGradeSecondQuarter(double gradeSecondQuarter) {
		this.gradeSecondQuarter = gradeSecondQuarter;
	}

	public double getGradeThirdQuarter() {
		return gradeThirdQuarter;
	}

	public void setGradeThirdQuarter(double gradeThirdQuarter) {
		this.gradeThirdQuarter = gradeThirdQuarter;
	}

	// Metodo utilitario
	public void finalResult(double gradeFirstQuarter, double gradeSecondQuarter, double gradeThirdQuarter) {

		double finalGrade = gradeFirstQuarter + gradeSecondQuarter + gradeThirdQuarter;

		if (finalGrade >= 60) {
			System.out.println("FINAL GRADE: " + String.format("%.2f", finalGrade) + "\nPASS");
		} else {
			System.out.println("FINAL GRADE: " + String.format("%.2f", finalGrade) + "\nFAILED\nMISSING "
					+ String.format("%.2f", (60.0 - finalGrade)) + " POINTS");
		}
	}

}
