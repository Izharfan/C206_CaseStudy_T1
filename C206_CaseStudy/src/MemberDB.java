import java.util.ArrayList;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 18021723, 29 Aug 2020 5:16:51 PM
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 18021723, 29 Aug 2020 5:16:51 PM
 */

public class MemberDB {
	private static ArrayList<Member> memberArrayList;
	
	public static void registerMember(String name, String gender,String email,int mobile_number ,String date_of_birth,String country) {
//		String output = "";
//		String name = Helper.readString("Enter your name > ");
//		String gender = Helper.readString("Enter your gender (F/M) > ");
//		int mobile_number = Helper.readInt("Enter mobile number > ");
//		String email = Helper.readString("Enter email > ");
//		String date_of_birth = Helper.readString("Enter date of birth in this format (DD/MM/YYYY > ");
//		String country = Helper.readString("Enter country of residence > ");
		boolean checkEmail = false;	
		
		for(int i = 0; i < memberArrayList.size(); i++) {
			if(memberArrayList.get(i).getEmail() == email) {
				System.out.println("Account already exist");
				checkEmail = true;
				break;
			}
		if (checkEmail == false) {
			memberArrayList.add(new Member(name, gender,email,mobile_number , date_of_birth, country));
			System.out.println("Member successfully added");
		}
	}

	}
	
	public static String viewMember() {
		Helper.line(30, "=");
		System.out.println("View Member");
		String output = (String.format("-20s %-20s %-20s -20s %-20s %-20s\n","Name", "Gender", "Mobile Number","Email","Date of Birth","Country of Residence"));
		for(int i = 0; i < memberArrayList.size(); i++) {
		if(memberArrayList.isEmpty()==false) {
		output += (String.format("-20s %-20s %-20d -20s %-20s %-20s\n", memberArrayList.get(i).getName(),memberArrayList.get(i).getGender() ,memberArrayList.get(i).getNumber(),memberArrayList.get(i).getEmail(), memberArrayList.get(i).getDOB(),memberArrayList.get(i).getCountry()));
		}
		}
		return output;
	}
	
	

}
