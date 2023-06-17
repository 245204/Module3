package ten;

public class Two {
//sorted arrays
	public static void main(String[] args) {
		int a[]= {2,55,6,3,4};
		int len=a.length;
		int half=len/2;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
				}
		}
		System.out.println("sorted array");
		for(int k=0;k<a.length;k++) {
		System.out.print(a[k]+" ");
		}

	}

}
