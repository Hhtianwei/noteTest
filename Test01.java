package com.shsxt.Lisa;
/*
 * Ҫ�Ѵ���ص�������
 */
public class Test01 {
    public static void main(String[] args) {
	//newһ������
	IceBox shBx=new IceBox();
	shBx.brand="����";
	shBx.color="��ɫ";
	shBx.size=1.80;
	
	//new һ������
	Elephant ele=new Elephant();
	ele.name="��Ī";
	
	shBx.openDoor(ele);
	shBx.closeDoor(ele);
	shBx.refrigerate(ele);
	
    }
}
