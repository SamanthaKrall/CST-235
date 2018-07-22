package Milestone;

public class Animals {
	int id =0;
	String name= "";
	String color = "";
	int age =0;
	String breed = "";
	String healthIssues = "";
	String behavioralIssues = "";
	String vetTreatment ="";
	String intakeDate;
	String availAdoptDate;
	String adoptedDate;
	
	public Animals(int id, String name, String color, int age, 
			String breed, String healthIssues, 
			String behavioralIssues, String vetTreatment, 
			String intakeDate, String availAdoptDate, 
			String adoptedDate){
		this.id = id;
		this.name = name;
		this.color = color;
		this.age = age;
		this.breed = breed;
		this.healthIssues = healthIssues;
		this.behavioralIssues = behavioralIssues;
		this.vetTreatment = vetTreatment;
		this.intakeDate = intakeDate;
		this.availAdoptDate = availAdoptDate;
		this.adoptedDate = adoptedDate;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getHealthIssues() {
		return healthIssues;
	}

	public void setHealthIssues(String healthIssues) {
		this.healthIssues = healthIssues;
	}

	public String getBehavioralIssues() {
		return behavioralIssues;
	}

	public void setBehavioralIssues(String behavioralIssues) {
		this.behavioralIssues = behavioralIssues;
	}

	public String getVetTreatment() {
		return vetTreatment;
	}

	public void setVetTreatment(String vetTreatment) {
		this.vetTreatment = vetTreatment;
	}

	public String getIntakeDate() {
		return intakeDate;
	}

	public void setIntakeDate(String intakeDate) {
		this.intakeDate = intakeDate;
	}

	public String getAvailAdoptDate() {
		return availAdoptDate;
	}

	public void setAvailAdoptDate(String availAdoptDate) {
		this.availAdoptDate = availAdoptDate;
	}

	public String getAdoptedDate() {
		return adoptedDate;
	}

	public void setAdoptedDate(String adoptedDate) {
		this.adoptedDate = adoptedDate;
	}

}
