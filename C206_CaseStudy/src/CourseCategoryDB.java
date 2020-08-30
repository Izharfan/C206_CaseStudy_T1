import java.util.ArrayList;

public class CourseCategoryDB {

	public static ArrayList<CourseCategory> courseCategoryList = new ArrayList<CourseCategory>();

	public static void addCourseCategory(CourseCategory new_courseCategory) {
		CourseCategoryDB.courseCategoryList.add(new_courseCategory);
		System.out.println("New Course Category added!");

	}

	public static String viewAllCourseCategory() {
		String output = "";
		if (courseCategoryList.size() > 0) {
			output = String.format("%-10s %-10s\n", "Name", "Description");
			for (int i = 0; i < courseCategoryList.size(); i++) {
				output += String.format("%-10s %-10s\n", courseCategoryList.get(i).getName(),
						courseCategoryList.get(i).getDescription());

			}
		} else {
			output = "No Course Category Found";
		}

		return output;
	}

	public static void deleteCourseCategory(String delete_courseCategory) {

		boolean isTrue = false;
		boolean isFound = false;
		for (int i = 0; i < courseCategoryList.size(); i++) {
			if (courseCategoryList.get(i).getName().equalsIgnoreCase(delete_courseCategory)) {
				isTrue = true;

				if (CourseDB.courseList.size() == 0) {
					courseCategoryList.remove(i);
					isFound = true;
				} else {
					for (int j = 0; j < CourseDB.courseList.size(); j++) {
						if (!CourseCategoryDB.courseCategoryList.get(j).getName()
								.equals(CourseDB.courseList.get(j).getCategoryName())) {
							courseCategoryList.remove(i);
							isFound = true;

						}
					}
				}
			}
		}

		if (isFound == false) {
			Helper.line(30, "-");

			System.out.println("You can't delete a course category that have been use for a course!");
		}
		if (isFound == true) {
			Helper.line(30, "-");
			System.out.println("Course Category Deleted!");
		}

		if (isTrue == false) {
			Helper.line(30, "-");
			System.out.println("Course Category does not Exist");
		}
	}

	public static String updateCategory(String name, String new_description) {

		String output = "";
		boolean isFound = false;
		for (int i = 0; i < courseCategoryList.size(); i++) {
			if (courseCategoryList.get(i).getName().equals(name)) {
				isFound = true;
				courseCategoryList.get(i).setDescription(new_description);
				output = "Category Description Updated!";
			}

		}
		if (isFound == false) {
			output = "Category Does not Exist";
		}

		return output;
	}

	public static String searchCategory(String name) {
		String output = "";
		boolean isTrue = false;
		for (int i = 0; i < courseCategoryList.size(); i++) {
			if (courseCategoryList.get(i).getName().equals(name)) {
				Helper.line(30, "-");
				System.out.println(String.format("%-10s %-10s\n", "Name", "Description"));
				System.out.println(String.format("%-10s %-10s\n", courseCategoryList.get(i).getName(),
						courseCategoryList.get(i).getDescription()));
				isTrue = true;
			}
		}
		if (isTrue == false) {
			Helper.line(30, "-");
			output += "Invalid Category Name!";
		}

		return output;
	}

	public static void listCourse(String name) {
		boolean isTrue = false;
		boolean isFound = false;

		for (int i = 0; i < courseCategoryList.size(); i++) {
			if (courseCategoryList.get(i).getName().equalsIgnoreCase(name)) {
				isTrue = true;
				for (int j = 0; j < CourseDB.courseList.size(); j++) {
					if (courseCategoryList.get(i).getName()
							.equalsIgnoreCase(CourseDB.courseList.get(j).getCategoryName())) {
						System.out.println(CourseDB.viewAllCourse());
						isFound = true;
						break;
					}
				}
			}
		}
		if (isTrue == false) {
			Helper.line(30, "-");
			System.out.println("Course Does Not Exist!");
		}
		if (isFound == false) {
			Helper.line(30, "-");
			System.out.println("Course Category Does Not Have Course!");
		}
	}

	public static void showCategoryMenu() {
		System.out.println("Course Category Menu");
		Helper.line(25, "-");
		System.out.println("1. Add Category");
		System.out.println("2. View Category");
		System.out.println("3. Delete Category");
		System.out.println("4. Update Category");
		System.out.println("5. Search Category");
		System.out.println("6. List Category");
		System.out.println("7. Quit");
		Helper.line(25, "-");

	}

}
