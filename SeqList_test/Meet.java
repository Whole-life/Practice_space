package two;

public class Meet {
	public void meet()
	{
		Integer[] values1={1,3,5,7};
		SeqList<Integer> A =new SeqList<Integer>(values1);
		
		Integer[] values2={2,4,5,7,10};
		SeqList<Integer> B =new SeqList<Integer>(values2);
		
		SeqList<Integer> C=new SeqList<Integer>(values1.length+values2.length);
		
		System.out.println("四、顺序表交集。");
		System.out.println("顺序表A："+A.toString());
		System.out.println("顺序表B："+B.toString());
		
		int i=0,j=0,k=0;
		while(i<A.size()&& j<B.size())
		{
			if(A.get(i)>(B.get(j)))//若两个数相等，则放入数组C中。
			{
				
				i++;
				j++;//记录该数组放了的个数,并控制循环。
			}
			
			if(A.get(i)<(B.get(j)))//若两个数相等，则放入数组C中。
			{
				i++;
				j++;					//记录该数组放了的个数,并控制循环。
			}
			
			else 
			{
			
				C.insert(k,A.get(i));
				i++;
				j++;
				k++;
				
			}
		}
			
		System.out.println("交集顺序表C："+C.toString());
	}
}

