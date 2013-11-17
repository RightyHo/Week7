public class NumberList {
	private int num;
	private NumberList nextNum;
	
	public NumberList(int num){
		this.num = num;
		nextNum = null;
	}
	public void addNum(NumberList anotherNum){
		if(this.nextNum == null){
			this.nextNum = anotherNum;
		} else {
			this.nextNum.addNum(anotherNum);
		}
	}
	public void printNum(){
		System.out.println("Number: " + this.num);
	}
}