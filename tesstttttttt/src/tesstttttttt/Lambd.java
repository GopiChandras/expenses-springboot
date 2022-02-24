package tesstttttttt;

interface Roi{
	int add(int a,int b);
}

public class Lambd {
   
	public static void main(String[] args) {
		
		Roi c=(a,b)->(a+b);
		System.out.println(c.add(2, 3));
	}
}
