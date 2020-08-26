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
		for (int i = 0; i < courseCategoryList.size(); i++) {
			if (courseCategoryList.get(i).getName().equals(delete_courseCategory)) {
				courseCategoryList.remove(i);
				isTrue = true;
			}
		}

		if (isTrue == false) {
			System.out.println("Course Category Does not Exist");
		} else {
			System.out.println("Course Category Deleted!");
		}
	}

	public static void updateCategory(String name, String new_description) {

		boolean isFound = false;
		for (int i = 0; i < courseCategoryList.size(); i++) {
			if (courseCategoryList.get(i).getName().equals(name)) {
				isFound = true;

				boolean duplicateFound = false;
				for (int a = 0; a < CourseCategoryDB.courseCategoryList.size(); a++) {
					if (CourseCategoryDB.courseCategoryList.get(a).getDescription().equals(new_description)) {
						duplicateFound = true;
					}
				}

				if (duplicateFound == true) {
					System.out.println("New description cannot be a duplicate of an old description!");

				} else {
					courseCategoryList.get(i).setDescription(new_description);
					System.out.println("Category Description Updated!");
				}
			}

			if (isFound == false) {
				System.out.println("Category Does not Exist");
			}
		}
	}

	public static void showCategoryMenu() {
		System.out.println("Course Category Menu");
		Helper.line(25, "-");
		System.out.println("1. Add Category");
		System.out.println("2. View Category");
		System.out.println("3. Delete Category");
		System.out.println("4. Update Category");
		System.out.println("5. Quit");
		Helper.line(25, "-");

	}

}