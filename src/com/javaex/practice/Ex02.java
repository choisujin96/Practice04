package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		double[] doubleArr = new double[3];
		
		doubleArr [0] = 1.2;
		doubleArr [1] = 3.3;
		doubleArr [2] = 6.7;
		
		/*
		//차례대로
		for(int i=0; i<doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		*/
		
		
		// 거꾸로 (시작점/ 방갯수(3개)와 방번호(0~2번)의 숫자는 -1 차이가 나니까 -1; 는 0까지 돌아야하고; 한바퀴 돌때마다 -1)
		for(int i=doubleArr.length-1; i>=0; i--) {
			System.out.println(doubleArr[i]);
		}
			
			
			
	}
	
}
