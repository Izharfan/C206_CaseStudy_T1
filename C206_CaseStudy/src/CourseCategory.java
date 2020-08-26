public class CourseCategory {

	private String Name;
	private String Description;

	public CourseCategory(String name, String description) {
		super();
		Name = name;
		this.Description = description;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

}