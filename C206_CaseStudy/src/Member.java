
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 18021723, 24 Aug 2020 1:11:02 PM
 */

public class Member {
	public String name;
	public String gender;
	public String email;
	public int mobile_number;
	public String date_of_birth;
	public String country;
	//Sprint 2
	public String password;
	
	/**
	 * @param name
	 * @param gender
	 * @param email
	 * @param mobile_number
	 * @param date_of_birth
	 * @param country
	 */
	
	public Member(String name, String gender,String email,int mobile_number,String date_of_birth, String country) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.mobile_number = mobile_number;
		this.date_of_birth = date_of_birth;
		this.country = country;
	}
	//Sprint 2
	public Member (String password) {
		this.password=password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNumber() {
		return mobile_number;
	}
	
	public void setNumber(int mobile_number) {
		this.mobile_number = mobile_number;
	}
	
	public String getDOB() {
		return date_of_birth;
	}
	
	public void setDOB(String date_of_birth) {
		this.date_of_birth=date_of_birth;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country=country;
	}
	//sprint 2
	public String getPw() {
		return password;
	}
	
	public void setPw(String password) {
		this.password=password;
	}

}
