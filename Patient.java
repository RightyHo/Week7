public class Patient {
	private String name;
	private int age;
	private String illness;
	Patient nextPatient;
	Patient prevPatient;

	public Patient(String name,int age,String illness){
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.prevPatient = null;
	}
	public void addPatient(Patient newPatient){
		if(this.nextPatient == null){
			this.nextPatient = newPatient;
			newPatient.prevPatient = this;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	//need to change the deletePatient method to focus on this
	//patient and not the next patient otherwise will get a null
	//pointer exception for the last 3 Patients in the list
	public boolean deletePatient(Patient patient){
		if(this.nextPatient == null){
			return false;
		} else if(this.nextPatient.name.equals(patient.name)){
			this.nextPatient.nextPatient.prevPatient = this;
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}
	public void printPatient(){
		System.out.println("Patient Name: " + this.name);
		System.out.println("Patient Age: " + this.age);
		System.out.println("Patient Illness: " + this.illness);
	}
}