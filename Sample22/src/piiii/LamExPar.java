package piiii;
interface Run{
	public String run(String  name);
}
public class LamExPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Run a=(name)->{
    	 return "hello"+name;
     }; 
     a.run("gopi");
  System.out.println(a.run("gopi"));   
	
	Run b= (name)->{
		return "hi"+name;
	};
	b.run("ram");
	System.out.println(b.run("ram"));
	}
}
