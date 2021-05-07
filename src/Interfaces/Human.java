package Interfaces;

import Enums.Gender;
import Classes.Date;

public interface Human {
	String getName();
	void setName(String name);

	int getAge();
	void setAge(int age);

	Date getBirthDate();
	void setBirthDate();

	Date getDeathDate();
	void setDeathDate();

	String getLocation();
	void setLocation(String location);

	Gender getGender();

	String getProfession();
	void setProfession(String profession);

	String toString();
}