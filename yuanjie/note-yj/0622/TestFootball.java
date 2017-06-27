package com.shsxt.jie;

public class TestFootball {
	public static void main(String[] args){
		FootballPlayer fp = new FootballPlayer();
		fp.age = 18;
		fp.name = "梅西";
		fp.gander = true;
		
		String skillName = "射门";
		fp.skill(skillName);
		
	}
}
