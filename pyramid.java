package com.patterns;

//     *           * * * *            1
//    * *           * * *            2 2
//   * * *           * *            3 3 3
//  * * * *           *            4 4 4 4

public class Pyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=(4-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		System.out.println("----------------");
		
		for(int i=1;i<=4;i++) {
			for(int j=1; j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=4-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=(4-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}

}