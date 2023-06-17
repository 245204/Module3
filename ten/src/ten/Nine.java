package ten;

import java.util.Scanner;
//table
public class Nine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int multi=1;
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		System.out.println("table of"+num1+"is:");
		for(int i=1;i<=10;i++) {
			multi=num1*i;
			System.out.println(i+"*"+num1+"="+multi);
		}
		

	}

}
