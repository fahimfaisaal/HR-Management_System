package Classes.Human;

import Classes.Date;
import Enums.Gender;
import Enums.Relationship;
import Interfaces.Human;

import java.util.Scanner;

public class Employ implements Human {
	private String name;
	private int age;
	private Date birthDate;
	private Date deathDate;
	private String location;
	private String profession;
	private Relationship relationship = Relationship.SINGLE;

	private final Scanner scan = new Scanner(System.in);

	public Employ(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;

		this.birthDate = new Date();
		this.deathDate = new Date();
		this.profession = null;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public Date getBirthDate() {
		return this.birthDate;
	}

	@Override
	public void setBirthDate(Date date) {
		this.birthDate = date;
	}

	public void setBirthDateByUser() {
		String event = "birth";

		this.birthDate.setDayByUser(event);
		this.birthDate.setDateByUser(event);
		this.birthDate.setMonthByUser(event);
		this.birthDate.setYearByUser(event);
	}

	@Override
	public Date getDeathDate() {
		return this.deathDate;
	}

	@Override
	public void setDeathDate(Date date) {
		this.deathDate = date;
	}

	public void setDeathDateByUser() {
		String event = "death";

		this.deathDate.setDayByUser(event);
		this.deathDate.setDateByUser(event);
		this.deathDate.setMonthByUser(event);
		this.deathDate.setYearByUser(event);
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
		return Gender.MALE;
	}

	@Override
	public Relationship getRelationship() {
		return this.relationship;
	}

	@Override
	public void setRelationship(Relationship relationship) {
		this.relationship = relationship;
	}

	public void setRelationshipByUser() {
		System.out.println("1. Single\n2. Married");
		System.out.print("Select relation status: ");

		int in = scan.nextInt();

		if (in == 2) {
			this.setRelationship(Relationship.MARRIED);
		}
	}

	@Override
	public String getProfession() {
		return this.profession;
	}

	@Override
	public void setProfession(String profession) {
		this.profession = profession;
	}


	@Override
	public String toString() {
		return "Male {" + '\n' +
		" name = " + this.getName() + ",\n" +
		" age = " + this.getAge() + ",\n" +
		" location = " + this.getLocation() + ",\n" +
		" birthDate = " + this.getBirthDate() + ",\n" +
		" deathDate = " + (this.getDeathDate().getDay() == null ? "Alive" : this.getDeathDate()) + ",\n" +
		" profession = " + this.getProfession() + ",\n" +
		" relationship = " + this.getRelationship() + ",\n" +
		"}\n";
	}
}
