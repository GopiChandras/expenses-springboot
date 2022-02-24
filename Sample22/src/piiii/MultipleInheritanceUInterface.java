package piiii;
interface Add1{
	int age=10;
	void age();
}
interface Add2{
	int id=20;
	void id();
}
 class Addd implements Add1 ,Add2{
	public void age() {
		System.out.println(age);
	}
	public void id(){
		System.out.println(id);
	}
} 

public class MultipleInheritanceUInterface {
	public static void main(String[] args) {
		
	
	Addd a=new Addd();
	a.age();
	a.id();
}
}