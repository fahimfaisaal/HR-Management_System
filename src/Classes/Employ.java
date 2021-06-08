package Classes;

import Enums.Gender;
import Enums.Relationship;

import java.util.Scanner;

public class Employ {
	private String name;
	private int age;
	private Date birthDate;
	private Date deathDate;
	private String location;
	private String profession;
	private Gender gender;
	private Relationship relationship = Relationship.SINGLE;
	private Resume resume = null;

	private final Scanner scan = new Scanner(System.in);

	public Employ(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.resume = new Resume(this.getName(), this.getAge(), this.getBirthDate());

		this.location = null;
		this.birthDate = new Date();
		this.deathDate = new Date();
		this.profession = null;
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

	public void setBirthDate(Date date) {
		this.birthDate = date;
		this.resume.setBirthDate(this.getBirthDate());
	}

	public Employ setBirthDateByUser() {
		String event = "birth";

		this.birthDate.setDayByUser(event);
		this.birthDate.setDateByUser(event);
		this.birthDate.setMonthByUser(event);
		this.birthDate.setYearByUser(event);

		this.resume.setBirthDate(this.getBirthDate());

		return this;
	}

	@Override
	public Date getDeathDate() {
		return this.deathDate;
	}

	@Override
	public void setDeathDate(Date date) {
		this.deathDate = date;
	}

	public Employ setDeathDateByUser() {
		String event = "death";

		this.deathDate.setDayByUser(event);
		this.deathDate.setDateByUser(event);
		this.deathDate.setMonthByUser(event);
		this.deathDate.setYearByUser(event);

		return this;
	}

	@Override
	public String getLocation() {
		return this.location;
	}

	@Override
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public Gender getGender() {
		return this.gender;
	}

	@Override
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public Relationship getRelationship() {
		return this.relationship;
	}

	@Override
	public void setRelationship(Relationship relationship) {
		this.relationship = relationship;
	}

	public Employ setRelationshipByUser() {
		System.out.println("1. Single\n2. Married");
		System.out.print("Select relation status: ");

		int in = scan.nextInt();
		scan.nextLine();

		if (in == 2) {
			this.setRelationship(Relationship.MARRIED);
		}

		return this;
	}

	@Override
	public String getProfession() {
		return this.profession;
	}

	@Override
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Employ setProfessionByUser() {
		System.out.print("Enter you profession: ");

		this.setProfession(scan.nextLine());

		return this;
	}

	public Resume getResume() {
		return this.resume;
	}

	@Override
	public String toString() {
		return "Employ {" + '\n' +
		" name = " + this.getName() + ",\n" +
		" age = " + this.getAge() + ",\n" +
		" location = " + this.getLocation() + ",\n" +
		" birthDate = " + this.getBirthDate() + ",\n" +
		" deathDate = " + (this.getDeathDate().getDay() == null ? "Alive" : this.getDeathDate()) + ",\n" +
		" profession = " + this.getProfession() + ",\n" +
		" gender = " + this.getGender().toString() + ",\n" +
		" relationship = " + this.getRelationship() + "\n" +
		" resume = " + this.getResume().toString() + "\n" +
		"}\n";
	}
}
