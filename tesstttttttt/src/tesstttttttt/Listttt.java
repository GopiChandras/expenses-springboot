package tesstttttttt;

import java.util.ArrayList;
import java.util.Iterator;

public class Listttt {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Gopi");
		list.add("Ram");
		
		  Iterator itr=list.iterator();
		  while(itr.hasNext()) {
		  System.out.println(itr.next());
		                     }
	}

}
