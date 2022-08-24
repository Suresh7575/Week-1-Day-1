package Week1.day1;

public class LearnMobileMethods {


	String brandName="Oneplus";
	int price=32000;
	boolean buyMobile=false;
	long phNo=9840675759l;


	public long typeMessages() {
		long friendNo=9840675760l;
		System.out.println(phNo);
		return friendNo;
	}
	public void makeCalls() {
		System.out.println(price);
	}
	public static void main(String[] args) {
		LearnMobileMethods obj =new LearnMobileMethods();
		String name=obj.brandName;
		System.out.println(name);
		obj.typeMessages();
	}

}



