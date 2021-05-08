package Interfaces;

import Enums.Gender;
import Classes.Date;
import Enums.Relationship;

public interface Human {
	String getName();
	void setName(String name);

	int getAge();
	void setAge(int age);

	Date getBirthDate();
	void setBirthDate(Date date);

	Date getDeathDate();
	void setDeathDate(Date date);

	String getLocation();
	void setLocation(String location);

	Gender getGender();
	void setGender(Gender gender);

	Relationship getRelationship();
	void setRelationship(Relationship relationship);

	String getProfession();
	void setProfession(String profession);

	String toString();
}