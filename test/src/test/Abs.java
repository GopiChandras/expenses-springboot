package test;

abstract class Example{
	abstract int get();
}
 class Abs extends Example {
	int get() {
	return 10;
	}
	class Disk extends Example{
		int get() {
			return 12;
		}
	}
 public static void main(String[] args) {
	
	 
	Example a;
	a= new Abs();
	System.out.println(a.get());

}
}
