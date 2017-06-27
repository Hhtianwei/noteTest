package com.shsxt.jie;
/*
 * 成员变量的使用结构：
 * modifier  type    varName[=值;]
 * 或
 * modifier  type   varName;
 * 权限修饰符:
 * public:公共的、任何地方均可访问
 * default:默认 (什么都不写),同包可以访问
 * private:私有的，仅在当前可以访问  
 */
public class Variable {
	//default修饰符，同包可以访问
	String name = "Lenovo";
	 //private修饰符，仅在当前类有效
	private int age = 5;
	//提供公共方法，进行私有变量的赋值|取值
	//取值
	public int getAge() {
		return age;
	}
	//赋值
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
