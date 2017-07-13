一、基础概念
1、什么是三范式
2、每个范式的作用分别是什么
3、如何查看 Scott 用户下的所有表?
select table_name from tabs;
4、使用哪个命令 查看 emp 表的结构
 desc emp;
5、分析实例表时，oracle 的字段类型分别有哪些?
6、SQL是哪些e文缩写
7、SQL语言的分类是什么
二、select查询列
1、查看 所有雇员名称
select ename from emp;
2、查看 所有雇员名称与工资
select ename,sal from emp;
3、查询 所有的部门信息
select * from dept;
4、查询 雇员的岗位，要求不重复
select distinct job from emp;
5、何为伪列? 请编写示例
不存在的列,构建虚拟的列
select ename, 12*sal 年收入 from emp;
6、何为虚表? 请编写示例
用于计算表达式,显示虚拟的列
select 1*2 from dual;
7、别名有什么作用? 
使用别名便于操作识别 隐藏底层信息。存在字段别名和表别名
8、查询 所有雇员的ename,sal,deptno, 使用别名: 姓名 工资 部门
select ename 姓名 ,sal 工资, deptno 部门 from emp;
9、数据库中 字符串使用 "" 对吗?
错误 应该使用 ''
10、"" 的作用是什么?
字段原样输出
11、如何拼接 字符串?请编写实例
使用|| select ename||'a'||'-->' info from emp; 
12、查看所有员工的姓名、工资、佣金，工资和佣金总和
select ename, sal, comm, sal+nvl(comm,0 )from emp;
13、nvl作用是什么?
nvl 内置函数，判断是否为 null, 如果为空，取默认值 0 ，否则取字段实际值
 14、*为什么要少用?
 *表示所有把不需要的也检索出来
15、检索 雇员的姓名,雇佣日期、工资
select ename, hiredate, sal from emp;
16、查询部门信息
select * from dept;
17、查询 雇员的部门编号 、上级
select deptno , mgr from emp;
18、查看1*2的结果
select 1*2 from dual;
19、编写拼接字符串的实例如 a||b
select 'a'||'b' from dual;
20、字符串||null -->字符串本身
如: select ename||null from emp;
21、字符串+数字 -->null
如: select sal+null from emp;
21、使用nvl查询员工的年薪
select ename ,12*(sal+nvl(comm,0)) 年薪 from emp;

