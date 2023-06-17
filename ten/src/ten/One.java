package ten;

import java.util.Scanner;
//number found or not
public class One {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find");
		int i=sc.nextInt();
		int arr[]= {10,2,34,7};   // index or element
		boolean flag=false;
		for(int j=0;j<arr.length;j++) {
		if(i==arr[j]) {
		    flag=true;
			
		}
		if(flag) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}

		}
	}
}

