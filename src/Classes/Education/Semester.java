package Classes.Education;

import Enums.ResultUnit;

public class Semester {
	private int semesterNumber = 0;
	private float result = 0;
	private ResultUnit resultUnit = null;

	public Semester(int semesterNumber) {
		this.semesterNumber = semesterNumber;
	}

	public int getSemesterNumber() {
		return this.semesterNumber;
	}

	public void setSemesterNumber(int semesterNumber) {
		this.semesterNumber = semesterNumber;
	}

	public float getResult() {
		return this.result;
	}

	public Semester setResult(float result) {
		this.result = result;

		return this;
	}

	public ResultUnit getResultUnit() {
		return this.resultUnit;
	}

	public Semester setResultUnit(ResultUnit resultUnit) {
		this.resultUnit = resultUnit;

		return this;
	}

	@Override
	public String toString() {
		return "Semester {" + "\n" +
		" semesterNumber = " + this.getSemesterNumber() + ",\n" +
		" result = " + this.getResult() + " " + this.getResultUnit() + '\'' +
		'}';
	}
}
