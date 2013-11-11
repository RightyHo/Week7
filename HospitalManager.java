public class HospitalManager{
	private Patient patientListStart = null;

	public static void main(String args[]){
		HospitalManager hm = new HospitalManager();
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
		Patient p2print = null;
		p2print = patientListStart;
		printDetails(p2print);
		System.out.println("Number of patients: " + rListLength(patientListStart));
		System.out.println("Iterative calc of total patients: " + iListLength(patientListStart));
		//delete a couple of patients
		patientListStart.deletePatient(seventhPatient);
		patientListStart.deletePatient(thirdPatient);
		printDetails(p2print);
		System.out.println("Number of patients: " + rListLength(patientListStart));
		System.out.println("Iterative calc of total patients: " + iListLength(patientListStart));
		//delete the first patient
		patientListStart = patientListStart.nextPatient;
		p2print = patientListStart;
		printDetails(p2print);
		System.out.println("Number of patients: " + rListLength(patientListStart));
		System.out.println("Iterative calc of total patients: " + iListLength(patientListStart));
		//question 5
		Patient traversePrint = null;
		traversePrint = patientListStart;
		printDetails(traversePrint);
		do {
			traversePrint = traversePrint.nextPatient;
		} while(traversePrint.nextPatient != null);
		reversePrint(traversePrint);
	}
	public void printDetails(Patient patientToPrint){
		if(patientToPrint == null){
						return;
		} else {
			patientToPrint.printPatient();
			printDetails(patientToPrint.nextPatient);
		}
	}
	//Recursive count method...
	public int rListLength(Patient patient){
		if(patient == null){
			return 0;
	} else {
		int result = 1 + rListLength(patient.nextPatient);
		return result;
		}
	}
	//Iterative count method...
	public int iListLength(Patient patient){
		boolean finished = false;
		int count = 0;
		while(!finished){
			if(patient == null){
				finished = true;
			} else {
				count++;
				patient = patient.nextPatient;
			}
		}
		return count;
	}
	public void reversePrint(Patient patientToPrint){
			if(patientToPrint == null){
							return;
			} else {
				patientToPrint.printPatient();
				reversePrint(patientToPrint.prevPatient);
			}
	}
}