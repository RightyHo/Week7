public class ListUtilities {
	static private NumberList numListStart = null;
	
	public static NumberList array2list(int[] myArray){
		for(int i=0;i<myArray.length;i++){
			NumberList numElement = new NumberList(myArray[i]);
			if(numListStart.nextNum == null){
					numListStart.nextNum = numElement;
			} else {
				NumberList findLast = numListStart;
				while(findLast.nextNum != null){
					findLast = findLast.nextNum;
				}
				findLast.nextNum = numElement;
				}
			}
	}
	
	public static void main(String[] args){
		ListUtilities lu = new ListUtilities();
		lu.launch();
	}
	public void launch(){
		int[] convertThis = {11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		NumberList myList = array2list(convertThis);
		
	}
	public void printDetails(NumberList numToPrint){
		if(numToPrint == null){
						return;
		} else {
			numToPrint.printNum();
			printDetails(numToPrint.nextNum);
		}
	}
}
