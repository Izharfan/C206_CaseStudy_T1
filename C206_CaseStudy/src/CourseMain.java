package c206;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism
 *
 *19016196,30 Aug 2020,8:08:53 pm
 */
public class CourseMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		start();

	}
	
	public static void start() {
		int course_option = 0;
		while (course_option !=6) {
			courseDB.showMenu();
			course_option = Helper.readInt("Enter option > ");
			if (course_option == 1) {
				String courseCode = Helper.readString("Enter course code > ");
				addCourse(courseCode);
			}
			else if (course_option == 2) {
				viewCourse();
			}
			else if (course_option == 3) {
				deleteCourse();
			}
			else if (course_option == 4) {
				String new_title = Helper.readString("Enter new course title > ");
				String new_categoryName = Helper.readString("Enter new course category name > ");
				String new_description = Helper.readString("Enter new course description > ");
				int new_duration = Helper.readInt("Enter new course duration > ");
				String new_prerequisiteCourse = Helper.readString("Enter new pre-requisite course > ");
				updateCourse(new_title, new_categoryName, new_description, new_duration, new_prerequisiteCourse);
			}
			else if (course_option == 5) {
				searchCourse();
			}
			else {
				System.out.println("Invalid option!");
			}
		}
	}
	
	public static void addCourse(String courseCode) {
		Helper.line(40, "-");
		System.out.println("ADD COURSE");
		Helper.line(40, "-");
		boolean duplicateFound = false;
		
		for (int i = 0; i < courseDB.courseList.size(); i++) {
			if (courseDB.courseList.get(i).getCode().equals(courseCode)) {
				duplicateFound = true;
			}
		}
		if (duplicateFound == true) {
			System.out.println("New course cannot be repeated course");
		}
		else {
			String courseTitle = Helper.readString("Enter course title > ");
			String courseCategoryName = Helper.readString("Enter course category name > ");
			String courseDescription = Helper.readString("Enter course description > ");
			int courseDuration = Helper.readInt("Enter cours duration (years) > ");
			String coursePrerequisiteCourse = Helper.readString("Enter course pre-requisite course > ");
			course new_course = new course(courseCode, courseTitle, courseCategoryName, courseDescription, courseDuration, coursePrerequisiteCourse);
			courseDB.addCourse(new_course);
		}
	}

	public static void viewCourse() {
		Helper.line(40, "-");
		System.out.println("VIEW COURSE");
		Helper.line(40, "-");
		
		System.out.println(courseDB.viewAllCourse());
	}
	
	public static void deleteCourse() {
		Helper.line(40, "-");
		System.out.println("DELETE COURSE");
		Helper.line(40, "-");
		
		String deleteCourse = Helper.readString("Enter course name code to delete > ");
		courseDB.deleteCourse(delete_course, CourseScheduleList);
	}
	
	public static void updateCourse(String code, String new_title, String new_categoryName, String new_description, int new_duration, String new_prerequisiteCourse) {
		Helper.line(40, "-");
		System.out.println("UPDATE COURSE");
		Helper.line(40, "-");
		
		courseDB.updateCourse(code, new_title, new_categoryName, new_description, new_duration, new_prerequisiteCourse)
	}
	
	public static void searchCourse() {
		Helper.line(40, "-");
		System.out.println("SEARCH COURSE");
		Helper.line(40, "-");
		
		courseDB.searchCoures(categoryName);
	}
}
