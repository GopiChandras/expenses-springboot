package tesstttttttt;

public class Excep {

	public static void main(String[] args) {
		
		try {
			int a=50/0 ;
			System.out.println("hi");
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("hello");

	}

}
