1�������� ����鿴 ���е�Ա����Ϣ
select * from emp order by sal desc;
2�������� ��������ͬ������Ա������� �鿴 ���е�Ա����Ϣ 
select * from emp  order by sal desc , empno asc;
3�������� ���� �鿴���е�Ա����Ϣ
select * from emp order by comm  desc nulls last;
4����ѯ��н����3�����Ա�������벿�ű�� ����н ����
select ename ,deptno from emp where 12*(sal+nvl(comm,0))>30000 order by 12*(sal+nvl(comm,0)) desc;
5������null ���� null�ں�
select * from emp order by comm desc nulls last; 
