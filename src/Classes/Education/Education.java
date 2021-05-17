package Classes.Education;

import Classes.Date;

import java.util.LinkedList;
import java.util.Scanner;

public class Education {
	private String name = null;
	private int age = 0;
	private Date birthDate = null;
	private boolean graduate = false;
	private final LinkedList<Certificate> certificates = new LinkedList<>();

	private final Scanner scan = new Scanner(System.in);

	public Education(String name, int age, Date bd) {
		this.name = name;
		this.age = age;
		this.birthDate = bd;
	}

	public boolean getGraduate() {
		return this.graduate;
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

	public void setGraduate(boolean graduate) {
		this.graduate  = graduate;
	}

	public LinkedList<Certificate> getCertificates() {
		return this.certificates;
	}


	public Education setCertificate() {
		this.certificates.add(new Certificate(this.getName(), this.getAge(), this.getBirthDate())
				.setCertificateByUser());

		return this;
	}

	public void setCertificatesByUser() {
		System.out.print("Enter the number of certificates: ");

		int numberOfCertificates = scan.nextInt();

		for (int i = 0; i < numberOfCertificates; i++) {
			this.setCertificate();
		}
	}

	@Override
	public String toString() {
		return "Certificate {" + '\n' +
		" name = " + this.getName() + ",\n" +
		" age = " + this.getAge() + ",\n" +
		" birthDate = " + this.getBirthDate() + ",\n" +
		" isGraduate = " + this.getGraduate() + ",\n" +
		" certificates = " + this.getCertificates() + ",\n" +
		"}";
	}
}
