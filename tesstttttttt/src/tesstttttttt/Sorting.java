package tesstttttttt;

public class Sorting {
	public static void main(String[] args) {
		int[] arr=  {1,2,4,3,5,6,7};
	int i;
int j;
int tmp=0;
		
		for(i=0;i<arr.length;i++){
			for(j=i+1;j<arr.length;j++){
			
				if(arr[i]>arr[j]){
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
	System.out.println(arr[i]);
		}
		
		
	}

}
