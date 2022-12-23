package model;

public class WorkshopModel {
	

	private String title;
	private String description;
	
	public WorkshopModel(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	
	public WorkshopModel() {
		super();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
