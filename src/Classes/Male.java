package Classes;

import Enums.Gender;
import Interfaces.Human;

public class Male implements Human {
	private String name;
	private int age;
	private String birthDate;
	private String deathDate;
	private String location;
	private String profession;

	public Male(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;

		this.birthDate = null;
		this.deathDate = null;
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
	public String getBirthDate() {
		return this.birthDate;
	}

	@Override
	public void setBirthDate(String date) {
		this.birthDate = date;
	}

	@Override
	public String getDeathDate() {
		return this.deathDate;
	}

	@Override
	public void setDeathDate(String date) {
		this.deathDate = date;
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
		" deathDate = " + this.getDeathDate() + ",\n" +
		"}\n";
	}
}
