package com.shsxt.yuanx;
/*成员变量的使用结构：
modifier type  varName[=值;]或
modifier type varName;
权限修饰符：
public：公共的、任何地方均可访问
default：默认（什么都不写）；同包可以访问
private：私有的，仅在当前可以访问*/
public class Variable {
private String name="随便";
private int age=11;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge( int age) {
	this.age = age;
}

}
