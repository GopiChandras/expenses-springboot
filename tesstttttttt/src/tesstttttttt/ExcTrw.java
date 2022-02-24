package tesstttttttt;

public class ExcTrw {
  public static void validate(int age){
	  if(age<18) {
		  throw new ArithmeticException("not eligible");
	  }else {
		  System.out.println("eligible");
	  }
  }
  
  public static void main(String[] args) {
	validate(19);
	System.out.println("rest");
}
}
