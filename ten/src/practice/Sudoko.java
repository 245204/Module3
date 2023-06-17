package practice;

import java.util.Random;

public class Sudoko {
	public static void main(String[] args) {
		int[][] arr=new int[10][10];
		Random rand = new Random();
//		int row1=rand.nextInt(10);
//		int col1=rand.nextInt(10);
		int row=9;
		int column=9;
		//int value=1;
//		System.out.println(row1);
//		System.out.println(col1);
		
		//number generating
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=rand.nextInt(10);
				//arr[i][j]=value;
				//value++;
			}
		}
		
		//checking random number
	int k=0;
	int m=0;
	
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<column;j++) 
					{
						
							if((arr[i][j]==arr[i][0])||(arr[i][j]==arr[0][j])) 
							{
								arr[i][j]=rand.nextInt(10);
							}
							
						
						
					}
				}

		
		
		System.out.println("sudoko is");
		for(int p=0;p<row;p++) {
			for(int q=0;q<column;q++) {
				System.out.print(arr[p][q]+"");
				
			}System.out.println("");
		
	}

}
}
