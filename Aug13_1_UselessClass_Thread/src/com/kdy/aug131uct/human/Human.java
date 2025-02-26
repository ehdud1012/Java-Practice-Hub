package com.kdy.aug131uct.human;

// 웹사이트 : 여러명이 동시에
//		한 사람 접속할 때마다 그 사람을 처리하기 위한 쓰레드
//		=> 중요하지만, 다른 언어 프로그램에서는 자동으로 처리해줌
// multi-thread 상황에서 공유자원 문제
//		brain 을 이름과 취미가 같이 써서 발생
//		brain 을 critical-section (임계 영역) 설정

// synchronized 메소드
//		thread 가 몇개가 돌든 간에 
//		한 순간에는 synchronized 메소드 하나만 실행 가능
//		=> 나머지는 차례대로 대기

public class Human {
	private String brain;
	
	private synchronized void sayName() {
		for (int i = 0; i < 10; i++) {
			try {
				brain = "김도영";
				Thread.sleep(300);
				System.out.println("이름 : "+brain);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private synchronized void sayHobby() {
		for (int i = 0; i < 10; i++) {
			try {
				brain = "멍";
				Thread.sleep(700);
				System.out.println("취미 : "+brain);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void introduce() {
		new Thread() {
			public void run() {
				sayName();
			};
		}.start();
		
		sayHobby();
	}
}
