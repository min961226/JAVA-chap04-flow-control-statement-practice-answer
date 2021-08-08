package com.greedy.section02.looping_and_branching.level02.normal;

/**
 * <pre>
 * Class : Application2
 * Comment : (normal) 알파벳 a부터 z까지 출력 문제
 * History
 * 2020/10/23 (김진호) 처음 작성함
 * </pre>
 * @author 김진호
 * @version 1.0.0
 * */
public class Application2 {

	public static void main(String[] args) {
		
		/* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
		 * 
		 * -- 출력 예시 --
		 * abcdefghijklmnopqrstuvwxyz
		 * */
		
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print((char) i);
		}

	}

}
