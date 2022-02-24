package piiii;
 class Demo{
	 int id;
	 String name;
	 public int getId() {
	 	return id;
	 }
	 public void setId(int id) {
	 	this.id = id;
	 }
	 public String getName() {
	 	return name;
	 }
	 public void setName(String name) {
	 	this.name = name;
	 }
	
}

public class EncapsolationDemo {

public static void main(String[] args) {
	Demo a=new Demo();
	a.setName("gopi");
	a.setId(1);
	System.out.println(a.getId());
	System.out.println(a.getName());
}
}
