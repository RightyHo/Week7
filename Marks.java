public class Marks {
	private int numDistinctions;
	private	int	numPasses;
	private int numFails;
	private int numInvalid;
	
	public Marks(){
		numDistinctions = 0;
		numPasses = 0;
		numInvalid = 0;
	}
	public static void main(String[] args){
		Marks readMarks = new Marks();
		readMarks.launch();
	} 
	private void launch(){
		System.out.println("Enter a list of marks between 0 and 100 - one per line and key in -1 when you are finished: ");
		int examMark = 0;
		do {
			examMark = Integer.parseInt(System.console().readLine());
			if(examMark >=70 && examMark <= 100){
				numDistinctions++;
			} else if(examMark >= 50 && examMark <= 69){
				numPasses++;
			} else if(examMark >= 0 && examMark <= 49){
				numFails++;
			} else {
				numInvalid++;
			}
		} while(examMark != -1);
		System.out.println("Number of Distinctions: " + numDistinctions);
		System.out.println("Number of Passes: " + numPasses);
		System.out.println("Number of Fails: " + numFails);
		System.out.println("Number of invalid marks entered: " + numInvalid);
		System.out.println("Total number of marks entered: " + (numDistinctions + numPasses + numFails + numInvalid));		
	}
}