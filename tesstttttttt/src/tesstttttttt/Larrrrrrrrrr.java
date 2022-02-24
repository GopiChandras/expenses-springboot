package tesstttttttt;

public class Larrrrrrrrrr {
	public static int get(int[]a,int total) {
		int temp=0;
		
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		return a[total-2];
	}
    public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println(get(a, 5));
	}
}
