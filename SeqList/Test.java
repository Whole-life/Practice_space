package one;

public class Test {
	
		void ways () {
		String [] values = {"10","11","20","22","30","33"};//������6������Ԫ�ص�����
		
		System.out.print("��������Ϊ��");	//�������
		System.out.print(values[0]);
		for(int i=1;i<values.length;i++)
		System.out.print(","+values[i]);
		System.out.println();
		
		System.out.println("���Կ�ʼ:");
		SeqList<String> list = new SeqList<String>(values);

		System.out.println("һ���ж����Ա��Ƿ�Ϊ��:");
		if(list.isEmpty() == true) 	//�ж����Ա��Ƿ��   
		    System.out.println("���Ա�Ϊ��");
		else
			System.out.println("���Ա�Ϊ�ա�");
		
		System.out.print("�������Ա���Ϊ:");	
		System.out.println(""+list.size());	//�������Ա���
		
		System.out.print("�������ص�2��Ԫ��:");     
		System.out.println(""+list.get(2));	//���ص�i��i��0����Ԫ��
		
		System.out.print("�ġ����õ�2��Ԫ��ֵΪ88��");
		list.set(1,"88");	//���õ�i��Ԫ��ֵΪx
		System.out.print("��ӡ�����飺");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
		
		System.out.print("�塢����60Ϊ�ڶ���Ԫ�ء�");
		list.insert(1,"60");	//����x��Ϊ��i��Ԫ��
		System.out.print("��ӡ�����飺");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length && list.element[i]!=null;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
		
		 System.out.print("���������Ա�������100��");
		list.insert("100");	//�����Ա�������xԪ��
		System.out.print("��ӡ�����飺");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length && list.element[i]!=null;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
		
		System.out.print("�ߡ�ɾ����2��Ԫ�ز����ر�ɾ������");
		System.out.println("ɾ������Ϊ��"+list.remove(1));	//ɾ����i��Ԫ�ز����ر�ɾ������
		System.out.print("��ӡ�����飺");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length && list.element[i]!=null;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
		
		
		 System.out.println("�ˡ������״γ��ֵĹؼ���Ϊ10��Ԫ�ص�λ��");
		System.out.println("�״γ���10��Ԫ�ص�λ��Ϊ��"+list.search("10"));	//���ң������״γ��ֵĹؼ���Ϊkey��Ԫ�ص�λ��      
		
		System.out.println(""+list.toString());	//����˳�������Ԫ�ص������ַ�������ʽΪ����������
		
		list.removeAll();	//ɾ�����Ա�����Ԫ��  
		}
		public static void main(String args[]){
			Test student = new Test();
			student.ways();

	}
	
}
