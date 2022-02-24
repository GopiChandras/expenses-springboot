package test;

public abstract class Bankk {
  abstract int loan();
}
 class Sbi extends Bankk{
	 int loan() {
		 return 10;
	 }
 }
 class Pnb extends Bankk{
	 int loan() {
		 return 12;
	 }
 }
  class All{
	 public static void main(String[] args) {
		Bankk A;
		A=new Sbi();
		System.out.println(A.loan());
	}
 }
