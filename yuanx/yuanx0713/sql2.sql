1、查询部门编号为10的员工信息
select * from emp where deptno=10;
2、查询年薪大于3万的人员的姓名与部门编号
select ename, deptno from emp where 12*(sal+nvl(comm,0))>30000;
3、查询佣金为null的人员姓名与工资
select ename, sal from emp where comm is null;
4、查询工资大于1500 且 and 含有佣金的人员姓名
select ename from emp where sal>1500 intersect 
select ename from emp where comm is not  null;
5、查询工资大于1500 或 or含有佣金的人员姓名
select ename, comm from emp where sal>1500 union
select ename, comm from emp where comm is not null;
6、查询姓名里面含有 S 员工信息: 工资、名称
select sal, ename from emp where ename like '%S%';
7、求姓名以J开头第二个字符O的员工姓名的与工资
select ename ,sal from emp where ename like 'JO%';
8、求包含%的雇员姓名
select ename from emp where ename like '%a%%' escape('a'); 
9、使用in 查询部门名称为 SALES 和RESEARCH  的雇员姓名、工资、部门编号
select ename, sal, deptno
  from emp
 where deptno in
       (select deptno from dept where dname in ('SALES', 'ACCOUNTING'));
10、使用exists 查询部门名称为 SALES 和RESEARCH  的雇员姓名、工资、部门编号
--select * from dept;
select ename, sal, deptno
  from emp e
 where exists (select deptno
          from dept t
         where dname in ('SALES', 'ACCOUNTING')
           and e.deptno = t.deptno);
