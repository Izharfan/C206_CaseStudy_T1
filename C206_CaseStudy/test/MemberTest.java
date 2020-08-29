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
	private ArrayList<Member> memberArrayList;
	
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
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
