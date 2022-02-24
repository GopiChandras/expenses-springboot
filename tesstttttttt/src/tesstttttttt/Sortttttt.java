package tesstttttttt;

public class Sortttttt {
	
	public int get(int[]a,int count) {
		
		for(int i=0;i<count;i++) {
			
			for(int j=i+1;j<count;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		return a[count-2];
	}
	
	public static void main(String[] args) {
		Sortttttt a= new Sortttttt();
	
		int c[]= {1,2,3,4,5};
		System.out.println(a.get(c,5));
	}

}
