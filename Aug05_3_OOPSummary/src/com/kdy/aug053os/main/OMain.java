package com.kdy.aug053os.main;

import com.kdy.aug053os.hero.Superman;
import com.kdy.aug053os.human.Human;
import com.kdy.aug053os.planet.Planet;

public class OMain {
	public static void main(String[] args) {
		// 이름이 지구인 행성
		Planet p = new Planet("지구");
		
		// 이름이 홍길동인 사람
		Human h = new Human("홍길동");
		p.add(h); // 홍길동이 지구에 살아
		
		// 아이언맨 , 헐크 ...
		// 무조건 공격하기 기능이 있어야함 
		// 슈퍼맨 ~
		Superman s = new Superman(); 
		
		// 전담 영웅으로 찜
		h.jjim(s);
		
		// 도움 요청
		h.helpme();
		
		// 그 행성 크기 500
		p.setSize(500);
		
		// 그 별 보임
		p.setVisible(true);
		
		
		
		
	}
}
