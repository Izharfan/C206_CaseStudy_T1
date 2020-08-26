
public class CourseSchedule {
	private int course_schedule_id;
	private double price;
	private String start_date;
	private String end_date;
	private String start_time;
	private String end_time;
	private String location;
	
	public CourseSchedule(int course_schedule_id, double price,String start_date,String end_date, String start_time, String end_time, String location) {
		this.course_schedule_id = course_schedule_id;
		this.price = price;
		this.start_date = start_date;
		this.end_date = end_date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.location = location;
	}
	
	public int getCourseScheduleId() {
		return course_schedule_id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getStart_date() {
		return start_date;
	}
	
	public String getEnd_date() {
		return end_date;
	}
	
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	
	public String getStart_time() {
		return start_time;
	}
	
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	
	public String getEnd_time() {
		return end_time;
	}
	
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String display() {
		String output = course_schedule_id + price + start_date + start_time + end_date + end_time + location;
		return output;
	}
}
