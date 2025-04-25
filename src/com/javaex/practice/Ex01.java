package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArr = new int[5];
		intArr[0]=9;
		intArr[1]=6;
		intArr[2]=4;
		intArr[3]=5;
		
		int result=0; //result 초기화
		
		for (int i=0; i<intArr.length; i++) { //문제에는 i<=intArr.length 여서 오류가 났었음.
			result = result +intArr[i];
		} System.out.println(result);
		

	}

}
