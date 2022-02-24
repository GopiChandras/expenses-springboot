package tesstttttttt;

class Bank{
	int rate() {
		return 0;
	}
	
}
class Sbi extends Bank{
	int rate() {
		return 1;
	}
}
class Cbhi extends Bank{
	int rate() {
		return 2;
	}
}

public class MethodRi {
public static void main(String[] args) {
	Sbi a= new Sbi();
	Cbhi d = new Cbhi();
	System.out.println(a.rate());
	System.out.println(d.rate());

}
}
