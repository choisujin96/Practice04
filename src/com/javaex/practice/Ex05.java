package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		
		for(int i =1; i<=5; i++) {
			System.out.print("");
			int num = sc.nextInt();
			sum = num + sum;
			
		}
			System.out.println("평균은 " + sum/5 + " 입니다.");	
		
			sc.close();
	}

}
