package tesstttttttt;

class Tre1 extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("hello");
		try{Thread.sleep(1000);
		      } 
		catch(Exception e) {} 
		}
	}
}


class Tre2 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("hi");
		try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

public class MultiThrea {

	public static void main(String[] args) {
		Tre1 b=new Tre1();
		Tre2 a=new Tre2();
		b.start();
		a.start(); 
	}
}
