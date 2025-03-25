package com.patterns;

//1           *
//2 3         * *
//4 5 6       * * *
//7 8 9 10    * * * *

public class Triangles {
	public static void main(String[] args) {
		// Number triangle
		int num = 1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
		// * triangle
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}