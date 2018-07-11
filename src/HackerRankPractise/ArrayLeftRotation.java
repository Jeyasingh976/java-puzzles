package HackerRankPractise;

import java.util.Scanner;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int rotateVal=in.nextInt();
		
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			int index=(i+ (n-rotateVal)) %n;
			arr[index]=in.nextInt();
			
			
		}
		
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i] +" ");
		}
		
		
		

	}

}
