һ����������
1��ʲô������ʽ
2��ÿ����ʽ�����÷ֱ���ʲô
3����β鿴 Scott �û��µ����б�?
select table_name from tabs;
4��ʹ���ĸ����� �鿴 emp ��Ľṹ
 desc emp;
5������ʵ����ʱ��oracle ���ֶ����ͷֱ�����Щ?
6��SQL����Щe����д
7��SQL���Եķ�����ʲô
����select��ѯ��
1���鿴 ���й�Ա����
select ename from emp;
2���鿴 ���й�Ա�����빤��
select ename,sal from emp;
3����ѯ ���еĲ�����Ϣ
select * from dept;
4����ѯ ��Ա�ĸ�λ��Ҫ���ظ�
select distinct job from emp;
5����Ϊα��? ���дʾ��
�����ڵ���,�����������
select ename, 12*sal ������ from emp;
6����Ϊ���? ���дʾ��
���ڼ�����ʽ,��ʾ�������
select 1*2 from dual;
7��������ʲô����? 
ʹ�ñ������ڲ���ʶ�� ���صײ���Ϣ�������ֶα����ͱ����
8����ѯ ���й�Ա��ename,sal,deptno, ʹ�ñ���: ���� ���� ����
select ename ���� ,sal ����, deptno ���� from emp;
9�����ݿ��� �ַ���ʹ�� "" ����?
���� Ӧ��ʹ�� ''
10��"" ��������ʲô?
�ֶ�ԭ�����
11�����ƴ�� �ַ���?���дʵ��
ʹ��|| select ename||'a'||'-->' info from emp; 
12���鿴����Ա�������������ʡ�Ӷ�𣬹��ʺ�Ӷ���ܺ�
select ename, sal, comm, sal+nvl(comm,0 )from emp;
13��nvl������ʲô?
nvl ���ú������ж��Ƿ�Ϊ null, ���Ϊ�գ�ȡĬ��ֵ 0 ������ȡ�ֶ�ʵ��ֵ
 14��*ΪʲôҪ����?
 *��ʾ���аѲ���Ҫ��Ҳ��������
15������ ��Ա������,��Ӷ���ڡ�����
select ename, hiredate, sal from emp;
16����ѯ������Ϣ
select * from dept;
17����ѯ ��Ա�Ĳ��ű�� ���ϼ�
select deptno , mgr from emp;
18���鿴1*2�Ľ��
select 1*2 from dual;
19����дƴ���ַ�����ʵ���� a||b
select 'a'||'b' from dual;
20���ַ���||null -->�ַ�������
��: select ename||null from emp;
21���ַ���+���� -->null
��: select sal+null from emp;
21��ʹ��nvl��ѯԱ������н
select ename ,12*(sal+nvl(comm,0)) ��н from emp;

