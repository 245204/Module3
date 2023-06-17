package ten;

import java.util.Scanner;
//non multiples
public class Six {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("numbers till");
		int N=sc.nextInt();
		System.out.println("Number1");
		int x=sc.nextInt();
		System.out.println("Number2");
		int y=sc.nextInt();
		for(int i=0;i<N;i++) {
			if((i%x==0)&&(i%y==0)) {
				sum=sum+i;
				
			}
		}
		System.out.println("total sum of non multiplies are "+sum);
				

	}

}
