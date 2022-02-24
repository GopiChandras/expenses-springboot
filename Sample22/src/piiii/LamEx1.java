package piiii;
interface To{
	public  void go();
}
public class LamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int width=20;
To a= ()->{
	System.out.println(width);
};
a.go();
	}

}
