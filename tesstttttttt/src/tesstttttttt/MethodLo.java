package tesstttttttt;

public class MethodLo {
	public  String studen(String name) {
		return name;
		
	}
	public String studen(String name, int age) {
		return "gopi"+10;
	}

	public static void main(String[] args) {
		
		MethodLo a=new MethodLo();
		System.out.println(a.studen("Gopi"));
		System.out.println(a.studen("Ram", 10));

	}
	
}
