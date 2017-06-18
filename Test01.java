package com.shsxt.Lisa;
/*
 * 要把大象关到冰箱里
 */
public class Test01 {
    public static void main(String[] args) {
	//new一个冰箱
	IceBox shBx=new IceBox();
	shBx.brand="格力";
	shBx.color="银色";
	shBx.size=1.80;
	
	//new 一个大象
	Elephant ele=new Elephant();
	ele.name="提莫";
	
	shBx.openDoor(ele);
	shBx.closeDoor(ele);
	shBx.refrigerate(ele);
	
    }
}
