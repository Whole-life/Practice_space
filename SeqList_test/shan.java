package two;

/*
1.���û���������д�㷨ɾ����i����ʼ��k��Ԫ�ء�
2.	��д��Ч�㷨ɾ����i����ʼ��k��Ԫ�ء�
*/
public class shan {
		
	public void Delet1(){
		Integer [] values = {10,20,30,40,50,60};//������6������Ԫ�ص�����
		
		System.out.print("��������Ϊ��");	//�������
		System.out.print(values[0]);
		for(int i=1;i<values.length;i++)
		System.out.print(","+values[i]);
		System.out.println();
	
		SeqList<Integer> list = new SeqList<Integer>(values);
		
		System.out.println("һ��ɾ����2��Ԫ�ؿ�ʼ��3��Ԫ�ء�");
		for(int i=1;i<=2;i++)	//��������ɾ����2��Ԫ�ؿ�ʼ��3��Ԫ��
			list.element[i]=list.element[i+3];
		
		System.out.print("��ӡ�����飺");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length-3 ;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
		
		//��д��Ч�㷨ɾ����i����ʼ��k��Ԫ�ء�
		System.out.println("������Ч�㷨ɾ����2��Ԫ�ؿ�ʼ��3��Ԫ�ء�");
		for(int i=1;i<=3;i++)	//��������ɾ����2��Ԫ�ؿ�ʼ��3��Ԫ��
			list.remove(1);
		
		System.out.print("��ӡ�����飺");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length && list.element[i]!=null;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
	}
}
