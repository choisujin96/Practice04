package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] data = new int[] {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int plus=0;  //개수
		int sum= 0;	 //총합	 
				
		//시작점은 0. i는 data의 방갯수(13)만큼. 한바퀴 돌때마다 1씩 올라감
		for(int i=0; i<data.length; i++) {
		
			//data안에 있는[숫자]를 3으로 나눠서 나머지가 0인 애들(3의 배수)
			if(data[i]%3==0) {
				
			// 	결과값이 plus에 매겨짐 = 3의배수인 애들이 통과할때마다 + 1씩 더할거임.
				plus = plus + 1;
			//	결과값이 sum에 매겨짐 = data[3의배수인애들]+초기화 한 0
				sum = data[i] + sum; 
			}
		} System.out.println("주어진 배열에서 3의 배수의 개수: " + plus); 
		  System.out.println("주어진 배열에서 3의 배수의 합: " + sum);
			
	}
		
		

		
		
	

}
