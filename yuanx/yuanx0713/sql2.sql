1����ѯ���ű��Ϊ10��Ա����Ϣ
select * from emp where deptno=10;
2����ѯ��н����3�����Ա�������벿�ű��
select ename, deptno from emp where 12*(sal+nvl(comm,0))>30000;
3����ѯӶ��Ϊnull����Ա�����빤��
select ename, sal from emp where comm is null;
4����ѯ���ʴ���1500 �� and ����Ӷ�����Ա����
select ename from emp where sal>1500 intersect 
select ename from emp where comm is not  null;
5����ѯ���ʴ���1500 �� or����Ӷ�����Ա����
select ename, comm from emp where sal>1500 union
select ename, comm from emp where comm is not null;
6����ѯ�������溬�� S Ա����Ϣ: ���ʡ�����
select sal, ename from emp where ename like '%S%';
7����������J��ͷ�ڶ����ַ�O��Ա���������빤��
select ename ,sal from emp where ename like 'JO%';
8�������%�Ĺ�Ա����
select ename from emp where ename like '%a%%' escape('a'); 
9��ʹ��in ��ѯ��������Ϊ SALES ��RESEARCH  �Ĺ�Ա���������ʡ����ű��
select ename, sal, deptno
  from emp
 where deptno in
       (select deptno from dept where dname in ('SALES', 'ACCOUNTING'));
10��ʹ��exists ��ѯ��������Ϊ SALES ��RESEARCH  �Ĺ�Ա���������ʡ����ű��
--select * from dept;
select ename, sal, deptno
  from emp e
 where exists (select deptno
          from dept t
         where dname in ('SALES', 'ACCOUNTING')
           and e.deptno = t.deptno);
