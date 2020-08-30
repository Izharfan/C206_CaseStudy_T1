import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19008634, 24 Aug 2020 7:06:01 pm
 */

public class Registration_Test {
	private Registration r1;
	private Registration r2;

	private ArrayList<Registration> registrationArrayList;

	public Registration_Test() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// prepare test data
		r1 = new Registration(100, 001, "ruyi@gmail.com", "pending", "30/08/2020", "12:30");
		r2 = new Registration(101, 002, "1900@gmail.com", "pending", "24/09/2020", "11:30");

		registrationArrayList = new ArrayList<Registration>();

	}

	@Test
	public void addRegistrationTest() {
		// Registration list is not null, so that can add a new registration - boundary
		assertNotNull("Check if there is valid Registration arraylist to add to", registrationArrayList);

		// Given an empty list, after adding 1 registration, the size of the list is 1 -
		// normal
		// The item just added is as same as the first item of the list
		C206_CaseStudy.registerCourse(registrationArrayList);
		assertEquals("Check that Registration arraylist size is 1", 1, registrationArrayList.size());
		assertSame("Check that Registration is added", r1, registrationArrayList.get(0));

		// Add another registration. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		C206_CaseStudy.registerCourse(registrationArrayList);
		assertEquals("Check that Camcorder arraylist size is 2", 2, registrationArrayList.size());
		assertSame("Check that Registration is added", r2, registrationArrayList.get(1));

	}
	
	@Test
	public void viewRegistrationTest() {
		// Test if Registration list is not null but empty -boundary
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", registrationArrayList);

		// test if the list of registrations retrieved from the list is empty - boundary
		String allRegistration = Main_Registration.viewRegistration();
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allRegistration);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.registerCourse(registrationArrayList);

		C206_CaseStudy.registerCourse(registrationArrayList);
		assertEquals("Test that Camcorder arraylist size is 2", 2, registrationArrayList.size());

		// test if the expected output string same as the list of Registrations
		// retrieved from the C206_CaseStudy
		allRegistration = Main_Registration.viewRegistration();
		testOutput = String.format("%-10d %-30d %-10s %-10s %-20s\n", 100, 001, "ruyi@gmail.com", "pending",
				"30/08/2020", "1230");
		testOutput += String.format("%-10d %-30d %-10s %-10s %-20s\n", 101, 002, "1900@gmail.com", "pending",
				"24/09/2020", "1130");

		assertEquals("Test that ViewAllRegistrationArrayList", testOutput, allRegistration);

	}

	@Test
	public void delRegistrationTest() {
		// normal
		// test if there is valid registration arraylist to delete from
		assertNotNull("Test if there is valid Registration arraylist to delete to", registrationArrayList);
		Main_Registration.deleteRegistration();

		// boundary
		// test if
		assertNotNull("test if there is valid Registration arraylist to delete from", registrationArrayList);

		Main_Registration.registerCourse();
	}
	
	@Test
	public void updateRegistration() {
		//Normal
		// Test that registration arraylist is not null 
		assertNotNull("Test if there is valid Registration arraylist to update to", registrationArrayList);	
		//Test that registration arraylist when update registration status
		Main_Registration.registerCourse();
		Main_Registration.updateRegistration();
		
		//Error
		// If the list is empty, after add 1 item, the size of the list is still 0
		Main_Registration.updateRegistration();
		assertEquals("Check that registration arraylist size is 0", 0, registrationArrayList.size());
	}
	
	@Test
	public void searchByCourseScheduleID() {
		//Normal
		// Test registration arraylist is not null, so that there is valid registration arraylist to update registration status
		assertNotNull("Test if there is valid Registration arraylist to delete from", registrationArrayList);
		Main_Registration.searchByCourseScheduleID();
		
		// Error
		// Test if there if it is still possible to search from registrationArrayList when registrationArrayList.size() is 0;
		assertEquals("Check that Customer arraylist size is 0", 0, registrationArrayList.size());
	}

}
