package ten;

import java.util.Scanner;
//even numbers print
public class Eight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		int[] arr=new int[5];
		int[] arreven=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Even numbers are");
		for(int j=0;j<5;j++) {
			if(arr[j]%2==0) {
				System.out.println(arr[j]);
			}
				

			
		}
	
	}

}
