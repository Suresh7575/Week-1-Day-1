package Week1.day1;

public class FriendMobile {

	public void takePhotos() {
		System.out.println("Take Photos");
	}
	public static void main(String[] args) {
		LearnMobileMethods call =new LearnMobileMethods();	
		System.out.println(call.brandName);
		call.makeCalls();
		FriendMobile Owner =new FriendMobile();
		Owner.takePhotos();
	}

}
