package piiii;
 
 interface Gopi{
	 void coding();
 }
 interface Vishal{
	 void coding();
 }

 
public class Multi implements Gopi, Vishal{ 
	 public void coding() {
		 System.out.println("done");
	 }
	
  public static void main(String[] args) {
	Multi O=new Multi();
	O.coding();
}
}
