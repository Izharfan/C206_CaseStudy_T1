
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19008634, 23 Aug 2020 7:35:49 pm
 */

public class Registration {
 
	public int registration_number;
	public int course_schedule_id;
	public String email;
	public boolean status;
	public String registration_date;
	public String registration_time;
	/**
	 * @param registration_number
	 * @param course_schedule_id
	 * @param email
	 * @param status
	 * @param registration_date
	 * @param registration_time
	 */
	public Registration(int registration_number, int course_schedule_id, String email, boolean status,
			String registration_date, String registration_time) {
		this.registration_number = registration_number;
		this.course_schedule_id = course_schedule_id;
		this.email = email;
		this.status = status;
		this.registration_date = registration_date;
		this.registration_time = registration_time;
	}
	/**
	 * @return the registration_number
	 */
	public int getRegistration_number() {
		return registration_number;
	}
	/**
	 * @param registration_number the registration_number to set
	 */
	public void setRegistration_number(int registration_number) {
		this.registration_number = registration_number;
	}
	/**
	 * @return the course_schedule_id
	 */
	public int getCourse_schedule_id() {
		return course_schedule_id;
	}
	/**
	 * @param course_schedule_id the course_schedule_id to set
	 */
	public void setCourse_schedule_id(int course_schedule_id) {
		this.course_schedule_id = course_schedule_id;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the registration_date
	 */
	public String getRegistration_date() {
		return registration_date;
	}
	/**
	 * @param registration_date the registration_date to set
	 */
	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}
	/**
	 * @return the registration_time
	 */
	public String getRegistration_time() {
		return registration_time;
	}
	/**
	 * @param registration_time the registration_time to set
	 */
	public void setRegistration_time(String registration_time) {
		this.registration_time = registration_time;
	}
	
	
}
