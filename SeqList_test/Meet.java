package two;

public class Meet {
	public void meet()
	{
		Integer[] values1={1,3,5,7};
		SeqList<Integer> A =new SeqList<Integer>(values1);
		
		Integer[] values2={2,4,5,7,10};
		SeqList<Integer> B =new SeqList<Integer>(values2);
		
		SeqList<Integer> C=new SeqList<Integer>(values1.length+values2.length);
		
		System.out.println("�ġ�˳�������");
		System.out.println("˳���A��"+A.toString());
		System.out.println("˳���B��"+B.toString());
		
		int i=0,j=0,k=0;
		while(i<A.size()&& j<B.size())
		{
			if(A.get(i)>(B.get(j)))//����������ȣ����������C�С�
			{
				
				i++;
				j++;//��¼��������˵ĸ���,������ѭ����
			}
			
			if(A.get(i)<(B.get(j)))//����������ȣ����������C�С�
			{
				i++;
				j++;					//��¼��������˵ĸ���,������ѭ����
			}
			
			else 
			{
			
				C.insert(k,A.get(i));
				i++;
				j++;
				k++;
				
			}
		}
			
		System.out.println("����˳���C��"+C.toString());
	}
}

