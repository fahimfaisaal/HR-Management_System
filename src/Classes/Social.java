package Classes;

import java.util.Scanner;

public class Social {
	private String facebook = null;
	private String linkedin = null;
	private String github = null;
	private String twitter = null;
	private String stackoverflow = null;

	private String portfolio = null;
	private Scanner scan = new Scanner(System.in);

	public String getFacebook() {
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = "https://www.facebook.com/" + facebook;
	}

	public String getLinkedin() {
		return this.linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = "https://www.linkedin.com/in/" + linkedin;
	}

	public String getGithub() {
		return this.github;
	}

	public void setGithub(String github) {
		this.github = "https://www.github.com/" + github;
	}

	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = "https://www.twitter.com/" + twitter;
	}

	public String getStackoverflow() {
		return this.stackoverflow;
	}

	public void setStackoverflow(String stackoverflow) {
		this.stackoverflow = "https://www.stackoverflow.com/" + stackoverflow;
	}

	public String getPortfolio() {
		return this.portfolio;
	}

	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	public void setSocialByUser() {
		System.out.print("Enter your facebook user name: ");
		this.setFacebook(scan.nextLine());

		System.out.print("Enter your twitter user name: ");
		this.setTwitter(scan.nextLine());

		System.out.print("Enter your linkedin user name: ");
		this.setLinkedin(scan.nextLine());

		System.out.print("Enter your github user name: ");
		this.setGithub(scan.nextLine());

		System.out.print("Enter your twitter user name: ");
		this.setStackoverflow(scan.nextLine());

		System.out.print("Enter your portfolio link: ");
		this.setPortfolio(scan.nextLine());
	}

	@Override
	public String toString() {
		return "Social {" + '\n' +
		" facebook = '" + this.getFacebook() + '\'' + ",\n" +
		" linkedin = '" + this.getLinkedin() + '\'' + ",\n"  +
		" github = '" + this.getGithub() + '\'' + ",\n"  +
		" twitter = '" + this.getTwitter() + '\'' + ",\n"  +
		" stackoverflow = '" + this.getStackoverflow() +  '\'' + ",\n" +
		" portfolio = '" + this.getPortfolio() + '\'' + ",\n"  +
		'}';
	}
}
