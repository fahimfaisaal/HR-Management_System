package Interfaces;

import Enums.Gender;

public interface Human {
	String getName();
	void setName(String name);

	int getAge();
	void setAge(int age);

	String getBirthDate();
	void setBirthDate(String date);

	String getDeathDate();
	void setDeathDate(String date);

	String getLocation();
	void setLocation(String location);

	Gender getGender();

	String getProfession();
	void setProfession(String profession);

	String toString();
}