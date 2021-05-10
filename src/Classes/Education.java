package Classes;

public class Education {
	private String university = null;
	private String college = null;
	private String school = null;

	private String SSC = null;
	private String HSC = null;
	private String graduate = null;

	private String department = null;

	public String getUniversity() {
		return this.university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSSC() {
		return this.SSC;
	}

	public void setSSC(float SSC) {
		this.SSC = SSC + " GPA";
	}

	public String getHSC() {
		return HSC;
	}

	public void setHSC(float HSC) {
		this.HSC = HSC + " GPA";
	}

	public String getGraduate() {
		return this.graduate;
	}

	public void setGraduate(float graduate) {
		this.graduate = graduate + " CGPA";
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
