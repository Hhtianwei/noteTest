-- select ���
-- select �ֶ��� from ����; ��Ҫ�ӱ���������ѯ�ֶ�����Ӧ������
-- ��ѯԱ����������ЩԱ�������ƣ�
select ename from emp;
-- �鿴����Ա���ı��
select empno from emp;
-- ������|��ѯ��|��������Ա���Ĺ���
select sal from emp;

-- select �ֶ���1,�ֶ���2 from ����;
-- ��������Ա�������ƺ͹���
select ename,sal from emp;
--��������Ա�����ƣ����ʣ��ϼ����
select ename,sal,mgr from emp;
--��ѯ�����ֶ� * ���о�����
--��ѯ����Ա����������Ϣ
--ÿ���ֶζ��оٳ��������ܲ����������ǿ���ָ��˳��
select empno,ename,job,sal,comm,mgr,deptno,hiredate from emp;
--*�ܱ�֤ȫ����Ϣ��ѯ�������ֶε�˳���ǰ��ձ�Ĭ�ϵ�˳��
select * from emp;

--��ѯ���е�Ա�����ƣ�����,�����ո��˫���ţ�ԭ�����
select ename as ���� from emp;
select ename "�� ��" from emp;

--�ֶα������Ը�as��Ҳ���Բ���as�������������������дas
select ename as ���� from emp e;

--��������Ա���Ĳ��ű��
select deptno from emp;
--�������д���Ա���Ĳ��ű��
--distinctȥ���ظ���¼
select distinct deptno from emp;

--��������Ա�����ƺ����ڵĲ��ű�ţ�ȥ�����ظ���¼
select distinct deptno,ename from emp;

--����1+1��ֵ  ���ͣ�number�Զ����㣬�ַ���ԭ�����
-- ''->�ַ���   ""��>ԭ�����
select 1+1 from dept;
select '1+1' from dept;
--select "1+1" from dept;  �������
select '1+1' "1+1" from dept;
