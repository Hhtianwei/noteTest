package com.shsxt.jie;

/*
 * 背景:公交车在路上行驶 当车速超过60km/h的时候  会提醒司机 "您已超速,注意安全"
	1.根据上述情景 利用面向对象思想 设计公交车类  
	2 创建公交车实例  设定公交车车速 然后调用行驶方法
 */
public class Bus {
	int speed;
	
	public static void notice(int speed){
		if(speed>60){
			System.out.println("您已超速，注意安全！");
		}else{
			System.out.println("您正在安全行驶");
		}
	}
}
