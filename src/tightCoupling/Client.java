package tightCoupling;

public class Client {
	public static void main(String[] args) {
		HandsetBrand ab;
		
		ab = new HandsetBrandMAddressList();
		ab.run();
		
		ab = new HandsetBrandMGame();
		ab.run();
		
		ab = new HandsetBrandNAddressList();
		ab.run();
		
		ab = new HandsetBrandNGame();
		ab.run();
	}

}
