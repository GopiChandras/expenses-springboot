package test;

public class Methodd {
void sum(int a,int b) {
	System.out.println(a+b);
}
}
class Methodd1 extends Methodd{
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
	
	Methodd1 a=new Methodd1();
	a.sum(1,3);
}
}
