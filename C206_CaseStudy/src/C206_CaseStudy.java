import java.util.ArrayList;

public class C206_CaseStudy {

	private static ArrayList<Registration> registrationArrayList;
	private static ArrayList<Member> memberArrayList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option = 0;
		while (option != 6) {
			
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// Member 1 pls fill up
				System.out.println("1. Register member> ");
				System.out.println("2. View member");
				System.out.println("3. Delete member");
				int registerMember_option = Helper.readInt("Enter an option > ");
				
				//Sub menu for registration
				if (registerMember_option == 1){
					String name = Helper.readString("Enter your name > ");
					String gender = Helper.readString("Enter your gender (F/M) > ");
					int mobile_number = Helper.readInt("Enter mobile number > ");
					String email = Helper.readString("Enter email > ");
					String date_of_birth = Helper.readString("Enter date of birth in this format (DD/MM/YYYY > ");
					String country = Helper.readString("Enter country of residence > ");
					
					memberArrayList.add(new Member(name, gender,email,mobile_number , date_of_birth, country));
				}
				else if (registerMember_option == 2){
					Helper.line(30, "=");
					System.out.println("View Member");
					System.out.println(String.format("-20s %-20s %-20s -20s %-20s %-20s\n","Name", "Gender", "Mobile Number","Email","Date of Birth","Country of Residence"));
					for(int i = 0; i < registrationArrayList.size(); i++) {
					if(memberArrayList.isEmpty()==false) {
					System.out.println(String.format("-20s %-20s %-20d -20s %-20s %-20s\n", memberArrayList.get(i).getName(),memberArrayList.get(i).getGender() ,memberArrayList.get(i).getNumber(),memberArrayList.get(i).getEmail(), memberArrayList.get(i).getDOB(),memberArrayList.get(i).getCountry()));
					}
					}
				}
				else if (registerMember_option == 3) {
					String email = Helper.readString("Enter email > ");
					for(int i = 0; i < registrationArrayList.size(); i++) {
						if(memberArrayList.isEmpty()==false) {
							if(memberArrayList.get(i).getEmail() == email){
								System.out.println("Member deleted");
							}
							else {
								System.out.println("Enter valid email");
							}
						}
				}
				}	
				else{
				System.out.println("Please enter a correct option, Thank you");
				}
				
				
				
				
				
				

			} else if (option == 2) {
				// Member 2 pls fill up
				

			} else if (option == 3) {
				// Member 3 pls fill up
				

			} else if (option == 4) {
				// Member 4 pls fill up
				

			
			
			
			} else if (option == 5) {
				// Member 5
				System.out.println("1. Register for a course");
				System.out.println("2. View all registrations");
				System.out.println("3. Delete registration");
				int registration_option = Helper.readInt("Enter an option > ");
			
			//sub menu for registration
			if(registration_option == 1) {
				//
				int registration_number = Helper.readInt("Enter registration number > ");
				int course_schedule_id =  Helper.readInt("Enter course schdeule id > ");
				String email = Helper.readString("Enter email address" );
				String registration_date = Helper.readString("Enter date in this format (DD/MM/YYYY > ");
				String status = "Pending";
				String registration_time = Helper.readString("Enter time in 24hr format");
				
				if(registrationArrayList.contains(registration_number)) {
					registrationArrayList.add(new Registration(registration_number, course_schedule_id, email,status,
							registration_date, registration_time));
				}
			}else if(registration_option == 2) {
				// view all registrations
				Helper.line(30, "=");
				System.out.println("View All Registrations");
				System.out.println(String.format("-20s %-20s %-20s\n","Member name", "Date", "Time"));
				for(int i = 0; i < registrationArrayList.size(); i++) {
					if(registrationArrayList.isEmpty()==false) {
					System.out.println(String.format("-20s -20s %-20s %-20s\n", registrationArrayList.get(i).getEmail(),registrationArrayList.get(i).getRegistration_date(),  registrationArrayList.get(i).getRegistration_time()));
				}
				}
			
			}else if (registration_option == 3) {
				//delete registration
				
				int registration_number = Helper.readInt("Enter registration number > ");
		
				for(int i = 0; i < registrationArrayList.size(); i++) {
			}
			
			
			
			
			} else if (option == 6) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

			}
	}

	// menu for course managment system
	public static void menu() {
		C206_CaseStudy.setHeader("Course Management System");
		System.out.println("1. Members");
		System.out.println("2. Course category");
		System.out.println("3. Course");
		System.out.println("4. Course schedule");
		System.out.println("5. Registration");
		System.out.println("6. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

}
