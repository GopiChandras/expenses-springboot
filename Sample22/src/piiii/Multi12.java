package piiii;
   

interface Ram{
	void run();
}
interface Syam extends Ram{
	void run();
}
public class Multi12 implements Syam{
 public void run() {
	 System.out.println("yes");
 }
 
	public static void main(String[] args) {
		Multi12 O=new Multi12();
		O.run();
		
			
	}
}
