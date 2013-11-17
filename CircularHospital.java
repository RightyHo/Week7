public class CircularHospital{
	private Patient patientListStart = null;

	public static void main(String args[]){
		CircularHospital hm = new CircularHospital();
		hm.launch();
	}
	public void launch(){
		Patient firstPatient = new Patient("Andrew",35,"too many muscles");
		patientListStart = firstPatient;
		Patient secondPatient = new Patient("Jamie",34,"tennis elbow");
		patientListStart.addPatient(secondPatient);
		Patient thirdPatient = new Patient("Travis",33,"plastic surgery");
		patientListStart.addPatient(thirdPatient);
		Patient fourthPatient = new Patient("Wade",36,"fainting");
		patientListStart.addPatient(fourthPatient);
		Patient fifthPatient = new Patient("Laura",29,"knee");
		patientListStart.addPatient(fifthPatient);
		Patient sixthPatient = new Patient("Lynette",60,"archilles");
		patientListStart.addPatient(sixthPatient);
		Patient seventhPatient = new Patient("Ken",65,"finger broken");
		patientListStart.addPatient(seventhPatient);
		Patient eighthPatient = new Patient("Nicky",32,"wrist");
		patientListStart.addPatient(eighthPatient);
		Patient ninethPatient = new Patient("Phillippa",30,"ankle");
		patientListStart.addPatient(ninethPatient);
		Patient tenthPatient = new Patient("Willem",31,"toe");
		patientListStart.addPatient(tenthPatient);
		Patient eleventhPatient = new Patient("Hannah",26,"stomach");
		patientListStart.addPatient(eleventhPatient);
		//print patient list
		printDetails(patientListStart);

		//delete a couple of patients
		patientListStart.deletePatient(seventhPatient);
		patientListStart.deletePatient(thirdPatient);
		printDetails(patientListStart);

		//add a new element to the list. Try to delete an element that is NOT in the list.

		Patient newPatient = new Patient("Mesut Ozil",26,"too good at football");
		Patient shinPadsPatient = new Patient("John Terry",30,"idiot");
		patientListStart.addPatient(newPatient);
		patientListStart.deletePatient(shinPadsPatient);
		printDetails(patientListStart);
	}
	public void printDetails(Patient patientToPrint){
		if(patientToPrint == null){
						return;
		} else {
			patientToPrint.printPatient();
			printDetails(patientToPrint.nextPatient);
		}
	}
}