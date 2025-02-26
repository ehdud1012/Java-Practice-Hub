package com.kdy.aug122uct.main;

// 파이썬(Python)은 동시작업 잘 못행 ㅠ.ㅠ
// 자바(Java)는 동시작업 잘해 ^ㅁ^/
// 고(Go)는 동시작업이 특기야 !! 자바보다 훨 잘해 !!

// 하나 끝나면 하나하고 이런 순차대로가 아닌
// 동시 작업

// Thread : 좌->우, 상->하 / 닿는 코드가 실행되는거

// 자바 프로젝트 최종
// 1) JVM이 OS위에 올라가고
// 2) 프로그램 소스(기계어 상태)가 stack 영역에
// 3) static 멤버변수가 static 영역에
// 4) JVM이 Thread 라는걸 하나 만들어서 UCMain.main(...)으로 보냄

// Multi-thread 프로그래밍
// 		main-thread : JVM이 만들어준 Thread
// 		sub-thread 	: 개발자가 만들어쓰는 Thread

public class UCMain {
	public static void main(String[] args) {
		
		// 1)
		KdyThread kt = new KdyThread();
		kt.start();  // 새 스래드 만들어서 run쪽으로 보내기
		
		// 2)
		Thread t = new Thread(new KdyThread2());
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("ㅇ3ㅇ");

			try {
				Thread.sleep(300); // Thread 의 진행을 0.3초 멈추기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
