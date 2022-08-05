package com.codingCompanyQuestion;

import java.util.Scanner;

class Solve{
	
	public static int[] solve (int [][] product){
		int answer[]=new int[product.length];
		
		for(int i=0; i<product.length;i++) {
			int maximum=Integer.MIN_VALUE;
			for(int j=0;j<product[0].length-1;j++) {
				maximum=Math.max(product[i][j],product[i][j+1]);
			}
			answer[i]=maximum;
		}	
		return answer;
	}
}

public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		int column=scan.nextInt();
		
		int product[][]=new int[row][column];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				product[i][j]=scan.nextInt();
			}
		}
		int arr[]=Solve.solve(product);
		for(int i=0;i<row;i++) {
		System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}
