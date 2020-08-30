public class maintainCourseCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maintainCourseCategory mcc = new maintainCourseCategory();
		mcc.start();
	}

	public void start() {
		int option = 0;

		while (option != 7) {
			CourseCategoryDB.showCategoryMenu();

			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				Helper.line(30, "-");
				System.out.println("Add Course Category");
				Helper.line(30, "-");
				String catName = Helper.readString("Enter Category Name > ");
				doAddCourseCategory(catName);

			} else if (option == 2) {
				doViewCourseCategory();
			} else if (option == 3) {
				doDeleteCourseCategory();
			} else if (option == 4) {
				Helper.line(30, "-");
				System.out.println("Update Course Category");
				Helper.line(30, "-");
				String update_name = Helper.readString("Enter category name to update > ");
				String new_description = Helper.readString("Enter new category description > ");
				doUpdateCategory(update_name, new_description);
			} else if (option == 5) {
				Helper.line(30, "-");
				System.out.println("Search Course Category");
				Helper.line(30, "-");
				String search_name = Helper.readString("Enter category name to search > ");
				doSearchCategory(search_name);
			} else if (option == 6) {
				Helper.line(30, "-");
				System.out.println("List Course Category");
				Helper.line(30, "-");
				String name = Helper.readString("Enter category name to search > ");
				CourseCategoryDB.listCourse(name);
			} else if (option == 7) {
				System.out.println("Thank you!");
			} else {
				System.out.println("Invalid Option!");
			}
		}
	}

	public static void doAddCourseCategory(String courseCategoryName) {

		boolean duplicateFound = false;

		for (int i = 0; i < CourseCategoryDB.courseCategoryList.size(); i++) {
			if (CourseCategoryDB.courseCategoryList.get(i).getName().equals(courseCategoryName)) {
				duplicateFound = true;

			}
		}

		if (duplicateFound == true) {
			System.out.println("New Course Category cannot be a repeated course category!");
		} else {
			String courseCategoryDescription = Helper.readString("Enter Course Description > ");
			CourseCategory new_courseCategory = new CourseCategory(courseCategoryName, courseCategoryDescription);
			CourseCategoryDB.addCourseCategory(new_courseCategory);

		}

	}

	public static void doViewCourseCategory() {
		Helper.line(30, "-");
		System.out.println("View Course Category");
		Helper.line(30, "-");

		System.out.println(CourseCategoryDB.viewAllCourseCategory());

	}

	public static void doDeleteCourseCategory() {

		Helper.line(30, "-");
		System.out.println("Delete Course Category");
		Helper.line(30, "-");

		String delete_courseCategory = Helper.readString("Enter course category name to delete > ");

		CourseCategoryDB.deleteCourseCategory(delete_courseCategory);

	}

	public static void doUpdateCategory(String update_name, String new_description) {

		CourseCategoryDB.updateCategory(update_name, new_description);
	}

	public static void doSearchCategory(String search_name) {

		CourseCategoryDB.searchCategory(search_name);
	}
	public static void doListCategory(String list_name) {

		CourseCategoryDB.searchCategory(list_name);
	}
}
