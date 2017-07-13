1、按工资 降序查看 所有的员工信息
select * from emp order by sal desc;
2、按工资 降序工资相同，按雇员编号升序 查看 所有的员工信息 
select * from emp  order by sal desc , empno asc;
3、按奖金 降序 查看所有的员工信息
select * from emp order by comm  desc nulls last;
4、查询年薪大于3万的人员的姓名与部门编号 按年薪 降序
select ename ,deptno from emp where 12*(sal+nvl(comm,0))>30000 order by 12*(sal+nvl(comm,0)) desc;
5、处理null 降序 null在后
select * from emp order by comm desc nulls last; 
