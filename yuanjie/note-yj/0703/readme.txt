反射：

1、了解： Class类   Class对象    Person 类   Person对象

2、获取Class对象
	1）对象.getClass()
	2）类名.class
	3）Class.forName("")   ; 有异常需要处理， 最常用， 最强大
	
	
3、获取 某个 clz 描述的类的构造方法， 获取类的构造器
	clz.getConstructor(Class<?>...clzs)
4、实例化一个对象（clz描述的哪个类的实例）
	clz.newInstance();  // 空构造必须存在
	Constructor con;
	con.newInstance(...);
5、获取类的属性
	属性的名字
	属性类型



