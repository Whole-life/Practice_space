package two;

/*3.	������˳���ϲ�Ϊһ��˳�������Ԫ�����򣩣�*/
public class Merge {
	public void Merge(){
		Integer[] values1={1,3,5,7};
		SeqList<Integer> list1=new SeqList<Integer>(values1);
		
		Integer[] values2={2,4,6,8};
		SeqList<Integer> list2=new SeqList<Integer>(values2);
		
		SeqList<Integer> list3=new SeqList<Integer>(values1.length+values2.length);
		
		System.out.println("��������ϲ���");
		System.out.println("����1��"+list1.toString());
		System.out.println("����2��"+list2.toString());
		
		int i=0,j=0;
		while(i<list1.size()&& j<list2.size())
		{
			if(list1.get(i)<list2.get(j))//�Ƚϴ�С��С�ķ�������3�С�
			{
				list3.insert(list1.get(i));
				i++;					//��¼��������˵ĸ���,������ѭ����
			}
			else 
			{
				list3.insert(list2.get(j));
				j++;
			}
		}
		while(i<list1.size())				
		{
			list3.insert(list1.get(i));
			i++;
		}
		while(j<list2.size())
		{
			list3.insert(list2.get(j));
			j++;
		}
		
		
		System.out.println("�ϲ��������3��"+list3.toString());
	}
}
