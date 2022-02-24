package test;
 

interface Ram{
	void goat();
}
public class Inter implements Ram {
	 public void goat() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Inter a = new Inter();
		a.goat();
	}

}
