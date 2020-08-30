package c206;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism
 *
 *19016196,30 Aug 2020,3:49:08 pm
 */
public class Course {
	private String code;
	private String title;
	private String categoryName;
	private String description;
	private int duration;
	private String prerequisiteCourse;
	
	public Course(String code, String title, String categoryName, String description, int duration,
			String prerequisiteCourse) {
		super();
		this.code = code;
		this.title = title;
		this.categoryName = categoryName;
		this.description = description;
		this.duration = duration;
		this.prerequisiteCourse = prerequisiteCourse;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String getPrerequisiteCourse() {
		return prerequisiteCourse;
	}
	public void setPrerequisiteCourse(String prerequisiteCourse) {
		this.prerequisiteCourse = prerequisiteCourse;
	}
}
	