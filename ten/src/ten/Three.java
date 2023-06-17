package ten;
//less than 50

public class Three {
	
	public static void middlelastfirstelements(int num){
		int r=0;
		r=num%10;
		System.out.println("Last element"+r);
		num=num/10;
		r=num%10;
		System.out.println("Second element"+r);
		num=num/10;
		r=num%10;
		System.out.println("First element"+r);
	}
		
	public static void main(String[] args) {
		int num=7;
		middlelastfirstelements(num);
		
		/*
		 * int a[]= {12,73,89,45}; for(int i=0;i<a.length;i++) {// if(a[i]<50) {
		 * System.out.println(a[i]); } }
		 */
	}

}
