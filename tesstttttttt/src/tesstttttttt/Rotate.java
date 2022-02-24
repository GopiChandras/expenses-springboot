package tesstttttttt;

public class Rotate{
	public static void main(String [] args) {
		
		int[] arr=new int[] {1,2,3,4,5,6};
		 for(int i=0;i<arr.length;i++); 
		
		 
		 for(int i=arr.length-1;i>=0;i--) {
			 System.out.println(arr[i]);
		 }
		 
		 
		 int max=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max)
				 max=arr[i];
		 }
		 System.out.println(max);
		 
	}
}