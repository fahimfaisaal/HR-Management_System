package Classes;

import Classes.Education.Education;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Resume {
	private String name = null;
	private int age = 0;
	private Date birthDate = null;
	private String phone = null;

	private final Social socialLinks = new Social();
	private Education education = null;
	private final LinkedList<String> skills = new LinkedList<>();
	private final LinkedList<String> language = new LinkedList<>();
	private final Scanner scan = new Scanner(System.in);

	public Resume(String name, int age, Date bd) {
		this.name = name;
		this.age = age;
		this.birthDate = bd;

		this.education = new Education(this.getName(), this.getAge(), this.getBirthDate());
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
		this.education.setBirthDate(birthDate);
	}

	public Social getSocialLinks() {
		return this.socialLinks;
	}

	public Education getEducation() {
		return this.education;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		StringBuilder validPhone = new StringBuilder();

		for (int i = 0; i < phone.length(); i++) {
			char digit = phone.charAt(i);

			if (
				(int)digit < 48 || (int)digit > 57 ||
				phone.length() > 12 || phone.length() < 8
			) {
				System.out.println("\n__Error, Phone number is Invalid!__\n");
				return;
			}

			validPhone.append(digit);
		}

		this.phone = validPhone.toString();
	}

	public LinkedList<String> getSkills() {
		return this.skills;
	}

	public void setSkills(String skill) {
		this.skills.add(skill);
	}

	public void setSkillsByUser() {
		System.out.print("Enter the number of skills: ");
		int numberOfSkills = scan.nextInt();
		scan.nextLine();

		for (int i = 1; i <= numberOfSkills; i++) {
			System.out.print("Add skill " + i + " : ");
			this.setSkills(scan.nextLine());
		}
	}

	public String getAllSkills() {
		StringBuilder skills = new StringBuilder();

		AtomicReference<String> comma = new AtomicReference<>("");

		this.getSkills().forEach(skill -> {
			skills.append(comma.get());
			skills.append(skill);

			comma.set(", ");
		});

		return skills.toString();
	}

	public LinkedList<String> getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.getLanguage().add(language);
	}

	public void setLanguageByUser() {
		System.out.print("Enter the number of language: ");
		int numberOfLanguage = scan.nextInt();
		scan.nextLine();

		for (int i = 1; i <= numberOfLanguage; i++) {
			System.out.print("Add language " + i + " : ");
			this.setLanguage(scan.nextLine());
		}
	}

	public String getAllLanguage() {
		StringBuilder languages = new StringBuilder();

		this.getLanguage().forEach(language -> {
			languages.append(language).append(",");
		});

		return languages.toString();
	}

	@Override
	public String toString() {
		return "Resume {" + '\n' +
		" social = " + this.getSocialLinks() +
		" education = " + this.getEducation() + ",\n" +
		" phone = " + this.getPhone() + ",\n" +
		" skills = [" + this.getAllSkills() + "],\n" +
		" language = [" + this.getAllLanguage() + "]\n" +
		"}\n";
	}
}
