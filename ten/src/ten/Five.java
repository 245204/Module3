package ten;

import java.util.Scanner;
//odd numbers sum
public class Five {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array1");
		int n=sc.nextInt();
		int sum=0;
		int[] mainarr1=new int[n];
		System.out.println("Enter the numbers for the array1");
		for(int i=0;i<n;i++) {
			mainarr1[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			if(mainarr1[j]%2!=0) {
				sum=sum+mainarr1[j];
			}
		}
		System.out.println("sum of odd numbers are"+sum);
		
		
	}

}
