package tesstttttttt;



class Overg{
	 int go() {
		return 7;
	}
}
class Overp extends Overg{
	 int go() {
		return 5;
	}
}
class Overl {

	public static void main(String[] args) {
		Overg a=new Overg();
		Overp b=new Overp();
		System.out.println(b.go());

	}

}
