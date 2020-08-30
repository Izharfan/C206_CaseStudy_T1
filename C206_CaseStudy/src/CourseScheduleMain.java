
public class CourseScheduleMain {

	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		int course_option = 0;
		while (course_option != 7) {
			CourseScheduleDB.showMenu();
			course_option = Helper.readInt("Enter an option > ");
			if (course_option == 1) {
				System.out.println(CourseScheduleDB.viewCourseSchedule());
			} else if (course_option == 2) {
				int id = Helper.readInt("Enter Course Schedule ID > ");
				CourseScheduleDB.addCourseSchedule(id);
			} else if(course_option == 3) {
				int id = Helper.readInt("Enter Course Schedule ID to be deleted > ");
				CourseScheduleDB.deleteCourseSchedule(id);
			} else if (course_option == 4) {
				int id = Helper.readInt("Enter Course Schedule ID to be updated > ");
				CourseScheduleDB.updateCourseSchedule(id);
			} else if (course_option == 5) {
				double price = Helper.readDouble("Enter price to be search > ");
				CourseScheduleDB.searchCoursePrice(price);
			} else if (course_option == 6) {
				int id = Helper.readInt("Enter Course Schedule ID to be view > ");
				CourseScheduleDB.viewMemberCourseSchedule(id);
			} else if (course_option == 7) {
				System.out.println("Thank You! Back to Main Menu.");
			} else {
				System.out.println("Invalid option entered.");
			}
		}
	}
	
	public static void viewCourseSchedule() {
		Helper.line(80, "-");
		System.out.println("VIEW COURSE SCHEDULE");
		Helper.line(80, "-");
		System.out.println(CourseScheduleDB.viewCourseSchedule());
	
	}

	public static void addCourseSchedule() {
		Helper.line(80, "-");
		System.out.println("ADD COURSE SCHEDULE");
		Helper.line(80, "-");
		int id = Helper.readInt("Enter Course Schedule ID > ");
		CourseScheduleDB.addCourseSchedule(id);
	}

	public static void deleteCourseSchedule() {
		Helper.line(80, "-");
		System.out.println("DELETE COURSE SCHEDULE");
		Helper.line(80, "-");
		int id = Helper.readInt("Enter Course Schedule ID to be deleted > ");
		CourseScheduleDB.deleteCourseSchedule(id);
	}
	
	public static void updateCourseSchedule() {
		Helper.line(80, "-");
		System.out.println("UPDATE COURSE SCHEDULE");
		Helper.line(80, "-");
		int id = Helper.readInt("Enter Course Schedule ID to be updated > ");
		CourseScheduleDB.updateCourseSchedule(id);
	}
	
	public static void searchCourseByPrice() {
		Helper.line(80, "-");
		System.out.println("SEARCH COURSE SCHEDULE BY PRICE");
		Helper.line(80, "-");
		double price = Helper.readDouble("Enter price to be search > ");
		CourseScheduleDB.searchCoursePrice(price);
	}
	
	public static void viewMemberSchedule() {
		Helper.line(80, "-");
		System.out.println("VIEW MEMBER COURSE SCHEDULE");
		Helper.line(80, "-");
		int id = Helper.readInt("Enter Course Schedule ID to be view > ");
		CourseScheduleDB.viewMemberCourseSchedule(id);
	}

}
