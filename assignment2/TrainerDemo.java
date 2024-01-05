package assignment5;
/*
 * 1) Create a Trainer class having instance variables:- trainerId, trainerName, subject, officeLocation.
Make getter setters in this class.
 */
class Trainer{
	int trainerId;
	String trainerName;
	String subject;
	String officeLocation;

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	
	
	
}
public class TrainerDemo {
	public static void main(String[] args) {
		Trainer t1 = new Trainer();
		t1.setTrainerId(1);
		t1.setTrainerName("Yogesh");
		t1.setSubject("SQL");
		t1.setOfficeLocation("Vashi");
		System.out.println(t1.getTrainerId()+" "+t1.getTrainerName()+" "+t1.getSubject()+" "+t1.getOfficeLocation());
	}
}
