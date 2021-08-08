package com.greedy.section02.looping_and_branching.level01.basic;

import java.util.Scanner;

/**
 * <pre>
 * Class : Application2
 * Comment : (basic) 1부터 입력받은 정수까지의 합계 구하는 문제
 * History
 * 2020/10/23 (김진호) 처음 작성함
 * </pre>
 * @author 김진호
 * @version 1.0.0
 * */
public class Application2 {

	public static void main(String[] args) {
		
		/* 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 정수를 입력하세요 : 5
		 * 
		 * -- 출력 예시 --
		 * 1부터 5까지의 합 : 15
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;

		for(int i = 0; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + num + "까지 합 : " + sum);
		
		sc.close();
	}

}
