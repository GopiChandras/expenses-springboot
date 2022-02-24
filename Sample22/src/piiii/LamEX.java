package piiii;

interface Shift{
	public void run();
}
public class LamEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=10;
 Shift a=new Shift() {
	public void run() {System.out.println(width);}
 };
 a.run();
	}

}
