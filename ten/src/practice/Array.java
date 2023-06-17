package practice;

public class Array {


	public static void main(String[] args) {

		int arr[]= {0,1,0};
		int leap=1;
		int n=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				i=i+1;
				if(i>=n) {
					System.out.println(true);
				}
				i=i-1;
				
			}
			else {
				//i=i-1;
				i=i+leap;
				if(i>=n) {
					System.out.println(true);
				}
				else {
					System.out.println(false);
				}
			}
			
		}
	}

}



		

