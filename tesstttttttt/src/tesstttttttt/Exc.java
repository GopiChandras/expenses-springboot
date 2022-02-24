package tesstttttttt;

public class Exc {
	
public static void main(String[] args) {
	try {
		int a=50/0;
		System.out.println("hi");
	}catch(ArithmeticException e){
		System.out.println(e);
	}
	System.out.println("rest of code");
	
}
	
}
