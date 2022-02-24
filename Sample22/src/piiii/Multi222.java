package piiii;
interface Bank{
	float loan();
}
class Boy implements Bank{
	public float loan() {
		return 9.15f;
	}
}
class Boy1 implements Bank{
	public float loan() {
		return 10f;
	}
}

public class Multi222 {
	public static void main(String[] args) {
		Bank O=new Boy1();
		System.out.println(O.loan());
		Bank A=new Boy();
		System.out.println(A.loan());
		
	}

}
