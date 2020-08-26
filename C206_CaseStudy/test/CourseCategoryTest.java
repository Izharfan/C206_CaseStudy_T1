import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CourseCategoryTest {

	private CourseCategory cat1;
	private CourseCategory cat2;

	@Before
	public void setUp() throws Exception {
		cat1 = new CourseCategory("1", "Uniformed Groups");
		cat2 = new CourseCategory("2", "Sports");
	}

	@After
	public void tearDown() throws Exception {
		cat1 = null;
		cat2 = null;
		CourseCategoryDB.courseCategoryList.clear();
	}

	@Test
	public void addCategoryTest() {
		// Test that categoryList is not null
		assertNotNull("Test that categoryList is not null", CourseCategoryDB.courseCategoryList);

		// Test that categoryList is equals to 0
		assertEquals("Test that categoryList is equals to 0", 0, CourseCategoryDB.courseCategoryList.size());

		// Test that categoryList equals 1 when added a category
		CourseCategoryDB.addCourseCategory(cat1);
		assertEquals("Test that categoryList equals 1 when added a category", 1,
				CourseCategoryDB.courseCategoryList.size());
		// Test that first item in categoryList is the same
		assertEquals("Test that first item in catergoryList is the same", cat1,
				CourseCategoryDB.courseCategoryList.get(0));

		// Test that categoryList equals 2 when added a category
		CourseCategoryDB.addCourseCategory(cat2);
		assertEquals("Test that categoryList equals 2 when added a category", 2,
				CourseCategoryDB.courseCategoryList.size());

		// Test that second item in categoryList is the same
		assertEquals("Test that second item in catergoryList is the same", cat2,
				CourseCategoryDB.courseCategoryList.get(1));
	}

	@Test
	public void ViewCategoryTest() {

		// Test that categoryList is not null but empty
		assertNotNull("Test that categoryList is not null to be able to retrieve something to view",
				CourseCategoryDB.courseCategoryList);

		// Test that viewAllCategory() method returns a String that equals
		// expectedOutput
		String expectedOutput = "No Category Found";
		String viewCategory = CourseCategoryDB.viewAllCourseCategory();
		assertEquals("Test that viewAllCategory() method returns a String that equals expectedOutput", expectedOutput,
				viewCategory);

		// Test that viewAllCategory() method return a String thats equals to
		// expectedOutput2
		CourseCategoryDB.addCourseCategory(cat1);
		CourseCategoryDB.addCourseCategory(cat2);
		String expectedOutput2 = String.format("%-10s %-10s\n", "ID", "NAME");

		for (int i = 0; i < CourseCategoryDB.courseCategoryList.size(); i++) {
			expectedOutput2 += String.format("%-10s %-10s\n", CourseCategoryDB.courseCategoryList.get(i).getName(),
					CourseCategoryDB.courseCategoryList.get(i).getDescription());

		}
		String viewCategory2 = CourseCategoryDB.viewAllCourseCategory();
		assertEquals("Test that viewAllCategory() method return a String that equals expectedOutput2", expectedOutput2,
				viewCategory2);

	}

	@Test
	public void deleteCategoryTest() {
		// Test if the category ArrayList is null?
		assertNotNull("//Test that categoryList is not null", CourseCategoryDB.courseCategoryList);

		// Test if the item arraylist is still 0 after adding student 1 into the array
		// list
		CourseCategoryDB.addCourseCategory(cat1);
		CourseCategoryDB.deleteCourseCategory(cat1.getName());
		assertEquals("Test if the category arraylist is still 0 after adding and deleting", 0,
				CourseCategoryDB.courseCategoryList.size());

		// Test if after adding cat1 and cat2 and deleting cat2 from the arrayList to
		// check
		// if the arraylist is equals to 1 after deleting one from the arraylist
		CourseCategoryDB.addCourseCategory(cat1);
		CourseCategoryDB.addCourseCategory(cat2);
		CourseCategoryDB.deleteCourseCategory(cat2.getName());
		assertEquals("Test if the category arraylist is still 1 after adding 2 category and deleting 1 of the category",
				1, CourseCategoryDB.courseCategoryList.size());
		CourseCategoryDB.deleteCourseCategory(cat1.getName());

		// Test if both items are deleted from the arraylist and the size of the
		// arraylist is 0
		CourseCategoryDB.addCourseCategory(cat1);
		CourseCategoryDB.addCourseCategory(cat2);
		CourseCategoryDB.deleteCourseCategory(cat1.getName());
		CourseCategoryDB.deleteCourseCategory(cat2.getName());
		assertEquals("Test if the arraylist is 0 after deleting 2 object from the categoryList ", 0,
				CourseCategoryDB.courseCategoryList.size());

		// Test if the categorylist.get(0) is cat2 after deleting cat1 from the
		// arraylist
		CourseCategoryDB.addCourseCategory(cat1);
		CourseCategoryDB.addCourseCategory(cat2);
		CourseCategoryDB.deleteCourseCategory(cat1.getName());
		assertSame("Test if the arraylist.get(0) is cat2 after deleting category 1 from the arraylist ", cat2,
				CourseCategoryDB.courseCategoryList.get(0));
	}
	
	@Test
	public void updateCategoryTest() {
		maintainCourseCategory.doAddCourseCategory("Sports");
		//Test that category description is updated after using doUpdateCategory() method
		maintainCourseCategory.doUpdateCategory("1", "Uniformed Groups");
		String updated_description = CourseCategoryDB.courseCategoryList.get(0).getDescription();
		assertEquals("Test that category description is updated after using the doUpdateCategory() method", updated_description, "Uniformed Groups");
		
	}
}