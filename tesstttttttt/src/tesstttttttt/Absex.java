package tesstttttttt;

abstract class Ra{
	abstract void ra();
}

class Ra2 extends Ra{
	void ra() {
		System.out.println("hell");
	}
}

public class Absex  extends Ra{
	void ra() {
		System.out.println("hi");
	}
  public static void main(String[] args) {
	Ra a= new Absex();
	Ra b=new Ra2();
	a.ra();
	b.ra();
}
}
