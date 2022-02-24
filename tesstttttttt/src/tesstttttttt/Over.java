package tesstttttttt;

public class Over {
	public  int get(int a, int b) {
		return a+b;
	}


	 public  int get(int a,int b,int c) {
		 return a+b+c;
	 }
 
	 public static void main(String[] args) {
		 Over b = new Over();
		System.out.println(b.get(3, 4));
		System.out.println(b.get(3,4 , 5));
	}
 }