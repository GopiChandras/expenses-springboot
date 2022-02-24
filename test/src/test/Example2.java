package test;

public abstract class Example2 {
	abstract void go();

}
  class Gopi extends Example2{
	 void go() {
		 System.out.println("hii");
	 }
	 public static void main(String[] args) {
		Example2 A= new Gopi();
		A.go();
	}
 }
