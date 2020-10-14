package pojo;
import pojo.*;
public class GetCourse {
	
	private String url;
	private String services;
	private String expertise;
	private  pojo.Courses course;
	private String instructor;
	private String linkedin;

	public void setUrl(String url) {
		this.url=url;
	}
	public void setServices(String services) {
		this.services=services;
	}
	public void setExpertise(String expertise) {	
		this.expertise=expertise;
	}
	public void setCourse(pojo.Courses course) {
		this.setCourse(course);
	}
	public void setInstructor(String instructor) {
		this.instructor=instructor;
	}
	public void setLinkedin(String Linkedin) {
		this.linkedin=Linkedin;
	}
	public String getUrl() {
		return  url;
	}
	public String getServices() {
		return services;
	}
	
	public String getExpertise() {
		return expertise;
	}
	
	public pojo.Courses getCourse() {
		return course;
	}
	public String getInstructor() {
		return instructor;
	}
	public String getLinkedin() {
		return linkedin;
	}
}
