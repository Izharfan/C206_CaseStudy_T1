import java.util.ArrayList;

public class CourseScheduleDB {
	public static ArrayList <CourseSchedule> courseScheduleList = new ArrayList <CourseSchedule> ();
	
	public static String viewCourseSchedule() {
		Helper.line(80, "-");
		System.out.println("VIEW COURSE SCHEDULE");
		Helper.line(80, "-");
		String output = "";
		if (courseScheduleList.size() == 0) {
			output = "No Course Schedule Currently";
		} else {
			output = String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s\n" ,"COURSE SCHEDULE ID", "PRICE($)","START DATE", "START TIME", "END DATE", "END TIME", "LOCATION");
			for (int i = 0; i < courseScheduleList.size(); i++) {
				output += String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s\n", courseScheduleList.get(i).getCourseScheduleId(), courseScheduleList.get(i).getPrice(), courseScheduleList.get(i).getStart_date(), courseScheduleList.get(i).getStart_time()
						, courseScheduleList.get(i).getEnd_date(), courseScheduleList.get(i).getEnd_time(), courseScheduleList.get(i).getLocation()); 
			}
		}
		return output;
	}
	
	public static void addCourseSchedule(int courseSchedule_id) {
		Helper.line(80, "-");
		System.out.println("ADD COURSE SCHEDULE");
		Helper.line(80, "-");
		boolean checkID = false;
		for (int i = 0; i < courseScheduleList.size();i++) {
			if (courseSchedule_id == courseScheduleList.get(i).getCourseScheduleId()) {
				System.out.println("ID is taken. Please choose another ID.");
				checkID = true;
				break;
			}
		}
		if (checkID == false) {
			double cost = Helper.readDouble("Enter price > ");
			String startDate = Helper.readString("Enter start date (DD/MM/YYYY) > ");
			String endDate = Helper.readString("Enter end date (DD/MM/YYYY) > ");
			String startTime = Helper.readString("Enter start time (24 hours clock in HH:MM) > ");
			String endTime = Helper.readString("Enter end time (24 hours clock in HH:MM) > ");
			String place = Helper.readString("Enter location > " );
			courseScheduleList.add(new CourseSchedule(courseSchedule_id,cost,startDate,endDate,startTime,endTime,place));
			System.out.println("Course Schedule Added!");
		}
	}

	
	public static void deleteCourseSchedule(int courseSchedule_id) {
		Helper.line(80, "-");
		System.out.println("DELETE COURSE SCHEDULE");
		Helper.line(80, "-");
		boolean check = false;
		boolean ans = checkCourseMember(courseSchedule_id);
		if (ans == true) {
			System.out.println("This Course Schedule cannot be deleted. A member had registered in this course schedule.");
		} else {
			for (int i = 0; i < courseScheduleList.size();i++) {
				if (courseSchedule_id == courseScheduleList.get(i).getCourseScheduleId()) {
					courseScheduleList.remove(courseScheduleList.get(i));
					System.out.println("Course Schedule Deleted!");
					check = true;
				}
			}
			if (check == false) {
				System.out.println("Invalid Course Schedule ID entered.");
			}
		}
	}
	
	public static boolean checkCourseMember (int courseSchedule_id) {
		boolean check1 = false;
		for (int i = 0; i < C206_CaseStudy.registrationArrayList.size();i++) {
			if (C206_CaseStudy.registrationArrayList.get(i).getCourse_schedule_id() == courseSchedule_id) {
				check1 = true;
			} else {
				check1 = false;
			}
		}
		if (check1 == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void viewMemberCourseSchedule(int courseSchedule_id) {
		Helper.line(80, "-");
		System.out.println("VIEW MEMBER COURSE SCHEDULE");
		Helper.line(80, "-");
		String output = "";
		boolean check = false;
		ArrayList name = new ArrayList();
		for (int i = 0; i < C206_CaseStudy.registrationArrayList.size();i++) {
			if (C206_CaseStudy.registrationArrayList.get(i).getCourse_schedule_id() == courseSchedule_id) {
				output = String.format("%-20s %-15s\n" ,"COURSE SCHEDULE ID","NAME");
				for (int z = 0; z < C206_CaseStudy.memberArrayList.size();z++) {
					if ((C206_CaseStudy.registrationArrayList.get(i).getEmail().equalsIgnoreCase(C206_CaseStudy.memberArrayList.get(z).getEmail()))){
						name.add(C206_CaseStudy.memberArrayList.get(z).getName());
						System.out.println(C206_CaseStudy.memberArrayList.get(z).getName());
						check = true;
					}
				}
			} else {
				output = "No member in the course schedule";
			}
		}
		if (check == true) {
			for (int x = 0; x < name.size(); x++) {
				output += String.format("%-20s %-15s\n", courseSchedule_id, name.get(x));
			}
		}
		System.out.println(output);
	}
	
	public static void updateCourseSchedule(int courseSchedule_id) {
		Helper.line(80, "-");
		System.out.println("UPDATE COURSE SCHEDULE");
		Helper.line(80, "-");
		boolean checkID = false;
		for (int i = 0; i < courseScheduleList.size();i++) {
			if (courseSchedule_id == courseScheduleList.get(i).getCourseScheduleId()) {
				showUpdateMenu();
				int option = Helper.readInt("Enter Update Option > ");
				if (option == 1) {
					double price = Helper.readDouble("Enter new price > ");
					courseScheduleList.get(i).setPrice(price);
					System.out.println("Price Updated!");
				} else if (option == 2) {
					String startDate = Helper.readString("Enter new start date (DD/MM/YYYY) > ");
					String startTime = Helper.readString("Enter new start time (24 hours clock in HH:MM) > ");
					courseScheduleList.get(i).setStart_date(startDate);
					courseScheduleList.get(i).setStart_time(startTime);
					System.out.println("Start Date / Time Updated!");
				} else if (option == 3) {
					String endDate = Helper.readString("Enter new end date (DD/MM/YYYY) > ");
					String endTime = Helper.readString("Enter new end time (24 hours clock in HH:MM) > ");
					courseScheduleList.get(i).setEnd_date(endDate);
					courseScheduleList.get(i).setEnd_time(endTime);
					System.out.println("End Date / Time Updated!");
				} else if (option == 4) {
					String loca = Helper.readString("Enter new location > ");
					courseScheduleList.get(i).setLocation(loca);
					System.out.println("Location Updated!");
				} else if (option == 5) {
					double price = Helper.readDouble("Enter new price > ");
					String startDate = Helper.readString("Enter new start date (DD/MM/YYYY) > ");
					String startTime = Helper.readString("Enter new start time (24 hours clock in HH:MM) > ");
					String endDate = Helper.readString("Enter new end date (DD/MM/YYYY) > ");
					String endTime = Helper.readString("Enter new end time (24 hours clock in HH:MM) > ");
					String loca = Helper.readString("Enter new location > ");
					courseScheduleList.get(i).setPrice(price);
					courseScheduleList.get(i).setStart_date(startDate);
					courseScheduleList.get(i).setStart_time(startTime);
					courseScheduleList.get(i).setEnd_date(endDate);
					courseScheduleList.get(i).setEnd_time(endTime);
					courseScheduleList.get(i).setLocation(loca);
					System.out.println("Course Schedule Updated!");
				} else {
					System.out.println("Invalid Option!");
				}
				checkID = true;
			}
		}
		if (checkID == false) {
			System.out.println("Invalid Option Entered.");
		}
	}
	
	public static void searchCoursePrice(double price) {
		Helper.line(80, "-");
		System.out.println("SEARCH COURSE SCHEDULE BY PRICE");
		Helper.line(80, "-");
		boolean checkPrice = false;
		String output = String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s\n" ,"COURSE SCHEDULE ID", "PRICE($)","START DATE", "START TIME", "END DATE", "END TIME", "LOCATION");
		for (int i = 0; i < courseScheduleList.size();i++) {
			if (courseScheduleList.get(i).getPrice() == price) {
				output += String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s\n", courseScheduleList.get(i).getCourseScheduleId(), courseScheduleList.get(i).getPrice(), courseScheduleList.get(i).getStart_date(), courseScheduleList.get(i).getStart_time()
						, courseScheduleList.get(i).getEnd_date(), courseScheduleList.get(i).getEnd_time(), courseScheduleList.get(i).getLocation()); 
				checkPrice = true;
			}
		}
		if (checkPrice == false) {
			System.out.println("No Course Schedule with that price.");
		} else {
			System.out.println(output);
		}
	}
	
	public static void showMenu() {
		Helper.line(80, "=");
		System.out.println("1. View All Course Schedule");
		System.out.println("2. Add a new Course Schedule");
		System.out.println("3. Delete Course Schedule ");
		System.out.println("4. Update Course Schedule");
		System.out.println("5. Search Course Schedule by price");
		System.out.println("6. View members schedule");
		System.out.println("7. Quit");
	}
	
	public static void showUpdateMenu() {
		Helper.line(40, "-");
		System.out.println("1. Update Price");
		System.out.println("2. Update Start Date / Time");
		System.out.println("3. Update End Date / Time");
		System.out.println("4. Update Location");
		System.out.println("5. All of the above");
	}
	
}

