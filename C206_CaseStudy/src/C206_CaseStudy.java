import java.util.ArrayList;

public class C206_CaseStudy {

	private static ArrayList<Reigstration> registrationArrayList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option = 0;
		while (option != 6) {
			
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// Member 1 pls fill up
				

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
				
				String registration_date = Helper.readString("Enter date in this format (DD/MM/YYYY > ");
				String registration_time = Helper.readString("Enter time in 24hr format");
				
				if(memberArrayList.contains(member)) {
					registrationArrayList.add(new Registration(member, registration_date, registration_time));
				}
			}else if(registration_option == 2) {
				// view all registrations
				Helper.line(30, "=");
				System.out.println("View All Registrations");
				System.out.println(String.format("-20s %-20s %-20s\n","Member name", "Date", "Time"));
				for(int i = 0; i < registrationArrayList.size(); i++) {
					if(registrationArrayList.isEmpty()==false) {
					System.out.println(String.format("-20s %-20s %-20s\n", registrationArrayList.get(i).getDate(), , registrationArrayList.get(i).getTime()));
				}
				}
			
			}else if (registration_option == 3) {
				//delete registration
				
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
