package tesstttttttt;

interface Goip{
	void run();
}
interface Gap{
	void gone();
}

	


public class MultIn implements Goip,Gap {
	
	public void run() {
		System.out.println("run");
	}
	
	public void gone() {
		System.out.println("gone");
	}
public static void main(String[] args) {
	MultIn a=new MultIn();
	a.run();
	a.gone();
}
}
