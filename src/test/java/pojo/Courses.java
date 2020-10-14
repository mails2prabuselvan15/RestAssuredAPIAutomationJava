package pojo;

import java.util.List;

public class Courses {
	private List <WebAutomation> webAutomation;
	private List <Api> api;
	private List <Appium> appium;
	
	public void setWebAutomation(List<WebAutomation> webAutomation) {
		this.webAutomation=webAutomation;
	}
	public void setapi(List<Api> api) {
		this.api=api;
	}
	public void setappium(List<Appium> appium) {
		this.appium=appium;
	}
	public List<WebAutomation> getWebAutomtion() {
		return webAutomation;
	}
	public List<Api> getapi() {
		return api;
	}
	public List<Appium> getappium() {
		return appium;
	}

}
