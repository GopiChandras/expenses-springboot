package tesstttttttt;

public class Arrlaer {
public static int getN(int[] a,int total) {
	int temp;
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
public static void main(String [] args) {
	int c[]= {1,2,3,4,5,6};
	
	System.out.println(getN(c,6));
}
}
