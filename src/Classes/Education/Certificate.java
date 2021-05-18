package Classes.Education;

import Classes.Date;
import Enums.Institute;
import Enums.ResultUnit;
import java.util.LinkedList;
import java.util.Scanner;

public class Certificate {
	private String name = null;
	private int age = 0;
	private Date birthDate = null;
	private String certificateName = null;
	private Institute instituteType = null;
	private final Institute [] institutes = {
		Institute.SCHOOL,
		Institute.COLLEGE,
		Institute.UNIVERSITY,
		Institute.OTHER
	};
	private String instituteName = null;
	private ResultUnit resultUnit = null;
	private float totalResult = 0;

	private final LinkedList<Semester> semesters = new LinkedList<Semester>();
	private String session = null;
	private String subject = null;

	private final Scanner scan = new Scanner(System.in);

	public Certificate(String name, int age, Date bd) {
		this.name = name;
		this.age = age;
		this.birthDate = bd;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCertificateName() {
		return this.certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public Institute getInstituteType() {
		return this.instituteType;
	}

	public void setInstituteType(Institute instituteType) {
		this.instituteType = instituteType;
	}

	public String getInstituteName() {
		return this.instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public ResultUnit getResultUnit() {
		return this.resultUnit;
	}

	public void setResultUnit(ResultUnit resultUnit) {
		this.resultUnit = resultUnit;
	}

	public float getTotalResult() {
		return this.totalResult;
	}

	public void setTotalResult(float totalResult) {
		this.totalResult += totalResult;
	}

	public LinkedList<Semester> getSemesters() {
		return this.semesters;
	}

	public void setSemesters(Semester semester) {
		this.semesters.add(semester);
		this.setTotalResult(semester.getResult());
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCertificate() {
		return String.format("""
  		-------------------------------------------------------------------------------
  		%s
  		Name: %s
  		Birth date: %s
  		Institute: %s %s
  		Total Result: %s %s
  		Semester: %s
  		Subject: %s
  		________________________________________________________________________________
		""",  this.getCertificateName(),
				this.getName(),
				this.getBirthDate().toDateFormat(),
				this.getInstituteName(),
				this.getInstituteType(),
				this.getTotalResult(),
				this.getResultUnit(),
				this.getSession(),
				this.getSubject());
	}

	public String getResultSheet() {
		StringBuilder resultSheet = new StringBuilder();

		this.semesters.forEach(semester -> {
			resultSheet.append("Semester number: ").append(semester.getSemesterNumber())
				.append("\n").append("Result: ").append(semester.getResult()).append("\n");
		});

		return resultSheet.toString();
	}

	public Certificate setCertificateByUser() {
		System.out.print("Enter certificate name: ");
		this.setCertificateName(scan.nextLine());

		for (int i = 0; i < 4; i++) {
			System.out.println(i + 1 + "." + this.institutes[i]);
		}
		System.out.print("Select institute type: ");
		this.setInstituteType(this.institutes[scan.nextInt() - 1]);
		scan.nextLine();

		System.out.print("Enter your institute name: ");
		this.setInstituteName(scan.nextLine());

		System.out.print("Enter your session: ");
		this.setSession(scan.nextLine());

		System.out.print("Enter your subject: ");
		this.setSubject(scan.nextLine());

		System.out.print("Enter your total semester: ");
		int semesterNumber = scan.nextInt();
		scan.nextLine();

		System.out.print("""
		1.CGPA
		2.GPA
		Select your result unit:  """);

		this.setResultUnit(scan.nextInt() == 1 ? ResultUnit.CGPA : ResultUnit.GPA);
		scan.nextLine();

		for (int i = 1; i <= semesterNumber; i++) {
			System.out.print("Enter the result of semester " + i + ": ");
			this.setSemesters(new Semester(i)
				.setResult(scan.nextFloat())
				.setResultUnit(this.getResultUnit()));
		}

		scan.nextLine();

		return this;
	}

	@Override
	public String toString() {
		return "Certificate {" + '\n' +
		" name = " + this.getName() + ",\n" +
		" age = " + this.getAge() + ",\n" +
		" birthDate = " + this.getBirthDate() + ",\n" +
		" instituteName = " + this.getInstituteName() + ",\n" +
		" totalResult = " + this.getTotalResult() + " " + this.getResultUnit() + ",\n" +
		" semesters = " + this.getSemesters().toString() + ",\n" +
		" session = " + this.getSession() + ",\n" +
		" subject = " + this.getSubject() + ",\n" +
		"}";
	}
}
