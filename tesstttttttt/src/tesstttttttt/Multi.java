package tesstttttttt;


interface Runnable {
	void run();
}
interface Slowable{
	void slow();
}
 public class Multi implements Runnable ,Slowable {
	
public void run() {
	System.out.println("hi");
}
public void slow() {
	System.out.println("hello");
}
  public static void main(String[] args) {
	Multi a= new Multi();
	a.run();
	a.slow();
}
}
