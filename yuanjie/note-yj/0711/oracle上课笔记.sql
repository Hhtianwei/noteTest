-- select 语句
-- select 字段名 from 表名; 我要从表名（表）查询字段名对应的内容
-- 查询员工表中有哪些员工（名称）
select ename from emp;
-- 查看所有员工的编号
select empno from emp;
-- 检索出|查询出|请获得所有员工的工资
select sal from emp;

-- select 字段名1,字段名2 from 表名;
-- 检索所有员工的名称和工资
select ename,sal from emp;
--检索所有员工名称，工资，上级编号
select ename,sal,mgr from emp;
--查询所有字段 * ，列举所有
--查询所有员工的所有信息
--每个字段都列举出来，可能不完整，但是可以指定顺序
select empno,ename,job,sal,comm,mgr,deptno,hiredate from emp;
--*能保证全部信息查询完整，字段的顺序是按照表默认的顺序
select * from emp;

--查询所有的员工名称，名字,遇到空格加双引号，原样输出
select ename as 名字 from emp;
select ename "名 字" from emp;

--字段别名可以跟as，也可以不跟as，给表名起别名，不能写as
select ename as 名字 from emp e;

--检索所有员工的部门编号
select deptno from emp;
--检索所有存在员工的部门编号
--distinct去除重复记录
select distinct deptno from emp;

--检索所有员工名称和所在的部门编号，去除掉重复记录
select distinct deptno,ename from emp;

--计算1+1的值  类型：number自动计算，字符串原样输出
-- ''->字符串   ""—>原样输出
select 1+1 from dept;
select '1+1' from dept;
--select "1+1" from dept;  不能输出
select '1+1' "1+1" from dept;
