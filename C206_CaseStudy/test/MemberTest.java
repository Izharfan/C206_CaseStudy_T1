/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 18021723, 29 Aug 2020 4:23:15 PM
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 18021723, 29 Aug 2020 4:23:15 PM
 */
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MemberTest {
	
	private Member testmem1;
	private Member testmem2;
	
	@Before
	public void setUp() throws Exception {
		testmem1 = new Member("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		testmem2 = new Member("David","M","david567@gmail.com",98849243,"07/07/2007","Thailand");
	}

	@After
	public void tearDown() throws Exception {
		testmem1 = null;
		testmem2 = null;
		MemberDB.memberArrayList.clear();
	}

	@Test
	public void registerMemberTest() {
		// Test that memberArrayList is not null
		assertNotNull("Test that memberArrayList is not null", MemberDB.memberArrayList);

		// Test that  memberArrayList is equals to 0
		assertEquals("Test that memberArrayList is equals to 0", 0, MemberDB.memberArrayList.size());

		// Test that memberArrayList equals 1 when added a member
		MemberDB.registerMember("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		assertEquals("Test that memberArrayList equals 1 when added a member", 1,
				MemberDB.memberArrayList.size());
		
		// Test that first item in memberArrayList is the same
		assertEquals("Test that first item in memberArrayList is the same", testmem1,
				MemberDB.memberArrayList.get(0));

		// Test that memberArrayList equals 2 when added a member
		MemberDB.registerMember("David","M","david567@gmail.com",98849243,"07/07/2007","Thailand");
		assertEquals("Test that memberArrayList equals 2 when added a member", 2,
				MemberDB.memberArrayList.size());

		// Test that second item in memberArrayList is the same
		assertEquals("Test that second item in memberArrayList is the same", testmem2,
				MemberDB.memberArrayList.get(1));
	}
	
	@Test
	public void viewMemberTest() {

		// Test that memberArrayList is not null but empty
		assertNotNull("Test that memberArrayList is not null to be able to retrieve something to view",
				MemberDB.memberArrayList);

		// Test that viewMember() method returns a String that equals
		// expectedOutput
		String expectedOutput = "No Course Category Found";
		String viewMember = MemberDB.viewMember();
		assertEquals("Test that viewMember() method returns a String that equals expectedOutput", expectedOutput,
				viewMember);

		// Test that viewMember() method return a String thats equals to
		// expectedOutput2
		MemberDB.registerMember("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		MemberDB.registerMember("David","M","david567@gmail.com",98849243,"07/07/2007","Thailand");
		String expectedOutput2 = (String.format("-20s %-20s %-20s -20s %-20s %-20s\n","Name", "Gender", "Mobile Number","Email","Date of Birth","Country of Residence"));

		for (int i = 0; i < MemberDB.memberArrayList.size(); i++) {
			expectedOutput2 += String.format("-20s %-20s %-20d -20s %-20s %-20s\n", MemberDB.memberArrayList.get(i).getName(),MemberDB.memberArrayList.get(i).getGender() ,MemberDB.memberArrayList.get(i).getNumber(),MemberDB.memberArrayList.get(i).getEmail(), MemberDB.memberArrayList.get(i).getDOB(),MemberDB.memberArrayList.get(i).getCountry());
		}
		String viewMember2 = MemberDB.viewMember();
		assertEquals("Test that viewMember() method return a String that equals expectedOutput2", expectedOutput2,
				viewMember2);

	}
	
	@Test
	public void deleteMemberTest() {
		// Test if the memberArrayList is null?
		assertNotNull("//Test that memberArrayList is not null", MemberDB.memberArrayList);

		// Test if the memberarraylist is still 0 after adding member into the array
		// list
		MemberDB.registerMember("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		MemberDB.deleteMember(testmem1.getEmail());
		assertEquals("Test if the memberArrayList is still 0 after adding and deleting", 0,
				MemberDB.memberArrayList.size());

		// Test if after adding testmem1 and testmem2 and deleting testmem2 from the arrayList to
		// check
		// if the arraylist is equals to 1 after deleting one from the arraylist
		MemberDB.registerMember("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		MemberDB.registerMember("David","M","david567@gmail.com",98849243,"07/07/2007","Thailand");
		MemberDB.deleteMember(testmem2.getEmail());
		assertEquals("Test if the memberArrayList is still 1 after adding 2 member and deleting 1 of the member",
				1, MemberDB.memberArrayList.size());
		MemberDB.deleteMember(testmem1.getEmail());

		// Test if both items are deleted from the arraylist and the size of the
		// arraylist is 0
		MemberDB.registerMember("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		MemberDB.registerMember("David","M","david567@gmail.com",98849243,"07/07/2007","Thailand");
		MemberDB.deleteMember(testmem1.getEmail());
		MemberDB.deleteMember(testmem2.getEmail());
		assertEquals("Test if the arraylist is 0 after deleting 2 member from the memberArrayList ", 0,
				MemberDB.memberArrayList.size());

		// Test if the memberArrayList.get(0) is testmem2 after deleting testmem1 from the
		// arraylist
		MemberDB.registerMember("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		MemberDB.registerMember("David","M","david567@gmail.com",98849243,"07/07/2007","Thailand");
		MemberDB.deleteMember(testmem1.getEmail());
		assertSame("Test if the memberArraylist.get(0) is testmem2 after deleting testmem1 from the arraylist ", testmem2,
				MemberDB.memberArrayList.get(0));
	}
	
	@Test
	public void updateMemberTest() {
		// Test that memberArrayList is not null
		assertNotNull("Test that memberArrayList is not null", MemberDB.memberArrayList);
		
		// Test that memberArrayList still equals 1 when update member account
		MemberDB.registerMember("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		MemberDB.updateMember(testmem1.getEmail());
		assertEquals("Test that categoryList still equals 1 when update category description", 1,
				MemberDB.memberArrayList.size());
		
		// Test that member profile is updated after using updateMember() method
		MemberDB.registerMember("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		String outcome = MemberDB.updateMember("PaSSwOrd","taiwan",98773993);
		assertEquals("Test that member profile is updated after using updateMember() method", "Member updated!",outcome);
		
		// Test that member profile does not update if country name does not exist
		MemberDB.registerMember("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		String output = MemberDB.updateMember("Tailand");
		assertEquals("Test that member profile does not update if country name does not exist", "Country Does not Exist",output);
		

	}
	
	@Test
	public void searchMemberTest() {
		// Test that memberArrayList is not null
		assertNotNull("Test that memberArrayList is not null", MemberDB.memberArrayList);
		
		// Test that member is shown when using searchMember() method
		MemberDB.registerMember("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		MemberDB.searchMember(testmem1.getCountry());
		assertEquals("Test that member is shown when using searchMember() method", testmem1, MemberDB.memberArrayList.get(0));
		
		// Test that member is not shown when an entered country name does not exist
		MemberDB.registerMember("Alicia","F","alicia123@gmail.com",98467263,"05/01/2001","Singapore");
		String outcome = MemberDB.searchMember("Tailand");
		assertEquals("Test that member is not shown when an entered country name does not exist", "Invalid Country Entered!", outcome);
		
		
	}


}
