package piiii;
import java.util.Scanner;

class Exc {
	static void validateInput(int number)throws InvalidInputException{
		if(number>100) {
			throw new InvalidInputException("Exception");
		}
		System.out.println("valid Input");
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
       System.out.println(":");
       int number=scanner.nextInt();
       try {
    	   validateInput(number);
       }catch (InvalidInputException e) {
    	   System.out.println("jjj");
		
	}
	}

}
class InvalidInputException extends Exception{
	public InvalidInputException(String exceptionText) {
		super(exceptionText);
	}
}