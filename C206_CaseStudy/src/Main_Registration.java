import java.util.ArrayList;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19008634, 29 Aug 2020 1:07:35 pm
 */

public class Main_Registration {
	
	public static void main(String[] args) {
		start();
	}

	public static void start() {

		int option = 0;
		while (option != 6) {

			Main_Registration.registrationMenu();
			option = Helper.readInt("Enter an option > ");
			int registration_number = 0;
			
			if (option == 1) {
				registration_number = Helper.readInt("Enter registration number > ");
				RegistrationDB.registerCourse(registration_number);
			} else if (option == 2) {
				RegistrationDB.viewRegistration();
			} else if (option == 3) {
				registration_number = Helper.readInt("Enter registration number > ");
				RegistrationDB.deleteRegistration(registration_number);
			} else if (option == 4) {
				RegistrationDB.updateRegistration(registration_number);
			} else if (option == 5) {
				int course_schedule_id = Helper.readInt("Enter Course Schedule ID > ");
				RegistrationDB.searchByCourseScheduleID(course_schedule_id);
			} else if (option == 6) {
				System.out.println("Goodbye!");
			} else {
				System.out.println("Invalid option");
			}

		}
	}

	public static void registrationMenu() {
		Main_Registration.setHeader("Registration");
		System.out.println("1. Add Registration");
		System.out.println("2. View All Registration");
		System.out.println("3. Delete Rehistration");
		System.out.println("4. Update Course Registration (Status)");
		System.out.println("5. Search Registrations by Course Schedule Id");
		System.out.println("6. Quit");
		Helper.line(80, "-");
	}

	/**
	 * @param string
	 */
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");

	}

	public static void registerCourse() {
		int registration_number = Helper.readInt("Enter registration number > ");
		RegistrationDB.registerCourse(registration_number);
	}

	public static void deleteRegistration() {
		int registration_number = Helper.readInt("Enter registration number > ");
		RegistrationDB.deleteRegistration(registration_number);
	}

	public static void viewRegistration() {
		// view all registrations
		RegistrationDB.viewRegistration();

	}

	public static void updateRegistration() {

		int registration_number = Helper.readInt("Enter registration number > ");
		RegistrationDB.updateRegistration(registration_number);

	}
	
	public static void searchByCourseScheduleID() {
		int course_schedule_id = Helper.readInt("Enter course schedule id > ");
		RegistrationDB.searchByCourseScheduleID(course_schedule_id);
	}
}
