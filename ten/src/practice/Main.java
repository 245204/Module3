package practice;

import java.util.Arrays;
import java.util.Scanner;

	public class Main {
		public static void main(String[] args)
		{
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter size of array");
			int n=sc.nextInt();
			
			int[] mainarr=new int[n];
			System.out.println("enter elements");
			
			for(int i=0;i<n;i++) {
				
				mainarr[i]=sc.nextInt();
			}
		Main obj=new Main();
			obj.evenodd(mainarr,n);
			
		}
	
		
		
		
		public void evenodd(int[] mainarr,int n ) {
			System.out.println("startss");
			int[] newarr=new int[n];
			
			int j=0;
			int k=0;
			int w=0;
			int count1=0;
			int count2=0;
			for(int i=0;i<n;i++) {
				if(mainarr[i]%2==0) {
					count1++;
						
					}
				else {
					count2++;
					
				}
			}
			int[] oddarr=new int[count2];
			int[] evenarr=new int[count1];
			
			
			if(count1<n&&count2<n) {
			for(int t=0;t<n;t++) {
				if(mainarr[t]%2==0) {
						 evenarr[j]=mainarr[t];
						j++;
					}
				else {
					oddarr[k]=mainarr[t];
					k++;
					
				}
			}
			System.out.println("even array:");
			for(int m=0;m<evenarr.length;m++) {
				System.out.print(evenarr[m]+" ");	
			}
			System.out.println("");
			System.out.println("odd array:");
			for(int m=0;m<oddarr.length;m++) {
				System.out.print(oddarr[m]+" ");	
			}
			}
			System.out.println(" ");
			System.out.println("new arr appendend");
			for(int q=0;q<n;q++) {
				if(q<count1) {
					newarr[q]=evenarr[q];
				}
				else {
					newarr[q]=oddarr[w];
					w++;
				}
			}
			for(int e=0;e<n;e++) {
			System.out.print(newarr[e]+" ");
			}
			
			
			
			
		}
	}


