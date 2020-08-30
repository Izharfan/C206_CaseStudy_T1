import java.util.ArrayList;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19008634, 30 Aug 2020 9:44:26 am
 */

public class RegistrationDB {

	public static ArrayList<Registration> registrationArrayList = new ArrayList<Registration>();

	// TODO Auto-generated method stub

	/**
	 * @param registration_number
	 */
	public static void registerCourse(int registration_number) {
		// TODO Auto-generated method stub
		Helper.line(30, "=");
		System.out.println("Register For A Couse");
		Helper.line(30, "=");

		boolean checkRegNo = false;

		for (int i = 0; i < registrationArrayList.size(); i++) {
			if (registration_number == registrationArrayList.get(i).getRegistration_number()) {
				System.out.println("Registration id existed!");
				checkRegNo = true;
			}
		}
		if (checkRegNo == false) {
			int course_schedule_id = Helper.readInt("Enter course schdeule id > ");
			String email = Helper.readString("Enter email address >");
			String status = "Pending";
			String registration_date = Helper.readString("Enter date in this format (DD/MM/YYYY) > ");
			String registration_time = Helper.readString("Enter time in 24hr format");
			registrationArrayList.add(new Registration(registration_number, course_schedule_id, email, status,
					registration_date, registration_time));
			System.out.println("Registration successful!");
		}
	}

	public static void deleteRegistration(int registration_number) {
		Helper.line(30, "=");
		System.out.println("Delete a registration");
		Helper.line(30, "=");

		boolean checkRegNo = false;

		for (int i = 0; i < registrationArrayList.size(); i++) {
			if (registration_number == registrationArrayList.get(i).getRegistration_number()) {
				registrationArrayList.remove(registrationArrayList.get(i));
				System.out.println("Registration deleted!");
				checkRegNo = true;
			}
		}
		if (checkRegNo = false) {
			System.out.println("Invalid registration number");
		}

	}

	public static void viewRegistration() {
		// view all registrations
		Helper.line(30, "=");
		System.out.println("View All Registrations");
		Helper.line(30, "=");

		String output = " ";

		if (registrationArrayList.size() == 0) {
			System.out.println("No registration yet");

		} else {
			output = String.format("%-20s %-35s %-20s %-20s %-20s %-20s\n", "Registration number", "Course Schdeule Id",
					"Status", "Email", "Date", "Time");
			for (int i = 0; i < registrationArrayList.size(); i++) {

				output += String.format("%-20d %-35d %-20s %-20s %-20s %-20s\n",
						registrationArrayList.get(i).getRegistration_number(),
						registrationArrayList.get(i).getCourse_schedule_id(), registrationArrayList.get(i).getStatus(),
						registrationArrayList.get(i).getEmail(), registrationArrayList.get(i).getRegistration_date(),
						registrationArrayList.get(i).getRegistration_time());
			}

		}
		System.out.println(output);

	}

	public static void updateRegistration(int registration_id) {

		RegistrationDB.viewRegistration();

		Helper.line(30, "=");
		System.out.println("Update Registration");
		Helper.line(30, "=");
		int registration_no = Helper.readInt("Enter registration number > ");

		boolean checkRegNum = false;

		for (int i = 0; i < registrationArrayList.size(); i++) {
			if (registration_no == registrationArrayList.get(i).getRegistration_number()) {
				String status = Helper.readString("Enter new status>  ");
				registrationArrayList.get(i).setStatus(status);
				System.out.println("Status updated!");
				checkRegNum = true;
			}
		}
		if (checkRegNum == false) {
			System.out.println("Invalid registration number!");

		}
	}

	/**
	 * 
	 */
	public static void searchByCourseScheduleID(int course_schedule_id){
		// TODO Auto-generated method stub
		Helper.line(30, "=");
		System.out.println("Search Registration by Course Schedule ID");
		Helper.line(30, "=");
		
		boolean checkCourseScheduleID = false;
		String output= " ";
		
		output = String.format("%-20s %-35s %-20s %-20s %-20s %-20s\n", "Registration number", "Course Schdeule Id",
				"Status", "Email", "Date", "Time");
		for(int i = 0 ;  i < registrationArrayList.size(); i++) {
			if(course_schedule_id == registrationArrayList.get(i).getCourse_schedule_id()){
				output += String.format("%-20d %-35d %-20s %-20s %-20s %-20s\n",
						registrationArrayList.get(i).getRegistration_number(),
						registrationArrayList.get(i).getCourse_schedule_id(), registrationArrayList.get(i).getStatus(),
						registrationArrayList.get(i).getEmail(), registrationArrayList.get(i).getRegistration_date(),
						registrationArrayList.get(i).getRegistration_time());
				checkCourseScheduleID = true;
			}
		}System.out.println(output);
	if(checkCourseScheduleID == false) {
			System.out.println("No such Course Schedule ID!");
		}
	}

}
