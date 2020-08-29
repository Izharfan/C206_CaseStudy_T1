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
	
	public static void deleteMember (String email) {
		boolean checkE = false;
		for (int i = 0; i < memberArrayList.size();i++) {
			if (email == memberArrayList.get(i).getEmail()) {
				memberArrayList.remove(memberArrayList.get(i));
				System.out.println("Email Deleted!");
				checkE = true;
			}
		}
		if (checkE == false) {
			System.out.println("Email not found");
		}
	}
	
	//Sprint 2
	public static void updateMember (String email) {
		boolean checkEM = false;
		for (int i = 0; i < memberArrayList.size();i++) {
			if (email == memberArrayList.get(i).getEmail()) {
				showUpdate();
				int option = Helper.readInt("Enter Update Option > ");
				if (option == 1) {
					String pw = Helper.readString("Enter new password > ");
					memberArrayList.get(i).setPw(pw);
					System.out.println("Password Updated!");
				} else if (option == 2) {
					String cor = Helper.readString("Enter new country of residence > ");
					memberArrayList.get(i).setCountry(cor);
					System.out.println("Country of residence updated!");
				} else if (option == 3) {
					int no = Helper.readInt("Enter new mobile number > ");
					memberArrayList.get(i).setNumber(no);
					System.out.println("Mobile Updated!");
				} else if (option == 4) {
					String pw = Helper.readString("Enter new password > ");
					String cor = Helper.readString("Enter new country of residence > ");
					int no = Helper.readInt("Enter new mobile number > ");
					memberArrayList.get(i).setPw(pw);
					memberArrayList.get(i).setCountry(cor);
					memberArrayList.get(i).setNumber(no);
					System.out.println("Member Password, Country of residence and Mobile Updated!");
				} else {
					System.out.println("Invalid Option!");
				}
				checkEM = true;
			}
		}
		if (checkEM == false) {
			System.out.println("Invalid Option Entered.");
		}
		
	}
	
	public static void searchMember(String country) {
		boolean checkMem =false;
		String output = (String.format("-20s %-20s %-20s -20s %-20s %-20s\n","Name", "Gender", "Mobile Number","Email","Date of Birth","Country of Residence"));
		for(int i = 0; i < memberArrayList.size(); i++) {
		if(country == memberArrayList.get(i).getCountry()) {
			output += (String.format("-20s %-20s %-20d -20s %-20s %-20s\n", memberArrayList.get(i).getName(),memberArrayList.get(i).getGender() ,memberArrayList.get(i).getNumber(),memberArrayList.get(i).getEmail(), memberArrayList.get(i).getDOB(),memberArrayList.get(i).getCountry()));
			checkMem =true;
		}
		}
		if(checkMem =false) {
			System.out.println("Invalid country");
		} else {
			System.out.println(output);
		}
	}
	
	public static void showMenu() {
		Helper.line(40, "-");
		System.out.println("1. Register Member");
		System.out.println("2. View Member");
		System.out.println("3. Delete Member");
		//Sprint 2
		System.out.println("4. Update Member Information");
		System.out.println("5. Search Member");
		System.out.println("6. Quit");
	}
	
	//Sprint2
	public static void showUpdate() {
		Helper.line(40, "-");
		System.out.println("1. Update Password");
		System.out.println("2. Update Country of residence");
		System.out.println("3. Update Mobile");
		System.out.println("4. All of the above");
	}

}
