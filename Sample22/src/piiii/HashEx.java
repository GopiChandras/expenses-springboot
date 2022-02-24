package piiii;

import java.util.HashMap;

public class HashEx {

	public static void main(String[] args) {
		HashMap<String , Integer>map=new HashMap<>();
       print(map);
       map.put("abc", 20);
       System.out.println(map.size());
       print(map);
       if(map.containsKey("abc")) {
    	   Integer a= map.get("abc");
    	   System.out.println(a);
       }
	}

	private static void print(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		
	}

}
