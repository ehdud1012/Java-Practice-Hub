package com.kdy.aug122uct.main;

// main-thread : 0.3초마다 ⊙_⊙ 찍기 x 10-> 대략 3초정도
// sub-thread : 0.5초마다 ^ㅁ^/ 찍기 x 무한 -> 안끝남

// 이 프로그램의 기능 : ⊙_⊙ 찍기 x 10
// 메인 기능이 끝나면 돌고있는 sub-thread는 알아서 끝나겠지 --> XXXX 꺼줘야함
public class UCMain2 {
	public static void main(String[] args) {

		// anonymous inner class
		Thread t = new Thread() {
			@Override
			public void run() {
				super.run();
				while (true) {
					for (int i = 0; i < 10; i++) {
						System.out.println("^ㅁ^/");

						try {
							Thread.sleep(500); // Thread 의 진행을 0.3초 멈추기
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("⊙_⊙");

			try {
				Thread.sleep(300); // Thread 의 진행을 0.3초 멈추기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
