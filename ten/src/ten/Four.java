package ten;

import java.util.Scanner;
//Concatenate
public class Four {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string 1 ");
	String s1=sc.nextLine();
	System.out.println("enter string 2");
	String s2=sc.nextLine();
	String s3= s1.concat(s2);
	System.out.println(s3);
	

	}

}
