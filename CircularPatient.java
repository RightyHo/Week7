public class CircularPatient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	public Patient lastPatient = null;
	public static int numPat = 0;
	
	public CircularPatient(String name,int age,String illness){
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	public void addPatient(Patient newPatient){
		if(numPat == 0){
			this.nextPatient = newPatient;
			nextPatient.nextPatient = this.nextPatient;
			lastPatient = this.nextPatient;
			numPat++;
		} else {
			lastPatient = findLast();
			lastPatient.printPatient();					//debugging
			lastPatient.nextPatient = newPatient;
			numPat++;
			lastPatient = findLast();
		}
	}
	public boolean deletePatient(Patient patient){
		if(this.nextPatient.name.equals(patient.name)){
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} else if(this.nextPatient.name.equals(lastPatient.name)){
			return false;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}
	public void printPatient(){
		System.out.println("Patient Name: " + this.name);
		System.out.println("Patient Age: " + this.age);
		System.out.println("Patient Illness: " + this.illness);
	}
	public Patient findLast(){
		for(int i=0;i<numPat-1;i++){						//check if this should be numPat-1 or not
			this.nextPatient = nextPatient.nextPatient;
		}
		return this.nextPatient;
	}
}