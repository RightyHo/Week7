public class Spy {
	private	static int spyCount = 0;
	private int spyID;
//	private Spy nextSpy;

	public Spy(int spyID){
		this.spyID = spyID;
//		this.nextSpy = null;
		spyCount++;
		System.out.println("SpyID: " + this.spyID);
		System.out.println("Total number of spies so far: " + spyCount);
	}
	public void die(){
		System.out.println("SpyID: " + this.spyID + " has been  detected and eliminated");
		spyCount--;
		System.out.println("Total number of spies so far: " + spyCount);
//		if(this.nextSpy == null){
//			System.out.println("Invalid Spy, was unable to find spy on the list and eliminate");
//		} else if(this.nextSpy.spyID == deadSpy.spyID){
//			this.nextSpy = nextSpy.nextSpy;
//			spyCount--;
//			System.out.println("SpyID: " + deadSpy.spyID + " has been  detected and eliminated");
//			System.out.pringln("Total number of spies so far: " + spyCount);
//		} else {
//			this.nextSpy.die(deadSpy);
//		}
	}
	public static void main(String[] args){
			Spy spook1 = new Spy(101);
			Spy spook2 = new Spy(102);
			Spy spook3 = new Spy(103);
			Spy spook4 = new Spy(104);
			Spy spook5 = new Spy(105);
			Spy spook6 = new Spy(109);
			spook2.die();
			spook5.die();
	}
}