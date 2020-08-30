/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 18021723, 29 Aug 2020 11:42:14 PM
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 18021723, 29 Aug 2020 11:42:14 PM
 */

public class MemberMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int member_option = 0;
		while (member_option != 6) {
			MemberDB.showMenu();
			member_option = Helper.readInt("Enter an option > ");
			
			if (member_option == 1) {
				registerMember();
			} else if (member_option == 2) {
				viewMember();
			} else if(member_option == 3) {
				 deleteMember();
			} else if (member_option == 4) {
				updateMember();
			} else if (member_option == 5) {
				searchMember();
			} else if (member_option == 6) {
				System.out.println("Thank You! Back to Main Menu.");
			} else {
				System.out.println("Invalid option entered.");
			}	
		}
	}
	
	public static void registerMember() {
		Helper.line(80, "-");
		System.out.println("REGISTER MEMBER");
		Helper.line(80, "-");
		String name = Helper.readString("Enter your name > ");
		String gender = Helper.readString("Enter your gender (F/M) > ");
		int mobile_number = Helper.readInt("Enter mobile number > ");
		String email = Helper.readString("Enter email > ");
		String date_of_birth = Helper.readString("Enter date of birth in this format (DD/MM/YYYY > ");
		String country = Helper.readString("Enter country of residence > ");
		MemberDB.registerMember(name,gender,email,mobile_number,date_of_birth,country);
	}
	
	public static void viewMember() {
		Helper.line(80, "-");
		System.out.println("VIEW MEMBER");
		Helper.line(80, "-");
		System.out.println(MemberDB.viewMember());
		
	}
	
	public static void deleteMember() {
		Helper.line(80, "-");
		System.out.println("DELETE MEMBER");
		Helper.line(80, "-");
		String emil= Helper.readString("Enter Member email to be deleted > ");
		MemberDB.deleteMember(emil);
	}
	
	public static void updateMember() {
		Helper.line(80, "-");
		System.out.println("UPDATE MEMBER");
		Helper.line(80, "-");
		String emil= Helper.readString("Enter Member email to be deleted > ");
		MemberDB.updateMember(emil);
	}
	
	public static void searchMember() {
		Helper.line(80, "-");
		System.out.println("SEARCH MEMBER");
		Helper.line(80, "-");
		String count = Helper.readString("Enter country to be search > ");
		MemberDB.searchMember(count);
	}
	

}
