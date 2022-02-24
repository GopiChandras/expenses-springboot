package tesstttttttt;

public class LargestNumber {
	public static int getLargest(int[]a,int total) {
		int temp;
		
		
		for(int i= 0; i <total;i++) {
			
			for(int j=i+1;j<total;j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[i];
					
					a[i]=a[j];
					
					a[j]=temp;
				}
			}
		}
		return  a[total-2];
		
	}

	public static void main(String args[]) {
		int a[]= {6,5,8,2,9};

		System.out.println(getLargest(a,5));
	}

}
