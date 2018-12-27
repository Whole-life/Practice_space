package two;

/*3.	将两个顺序表合并为一个顺序表（表中元素有序）；*/
public class Merge {
	public void Merge(){
		Integer[] values1={1,3,5,7};
		SeqList<Integer> list1=new SeqList<Integer>(values1);
		
		Integer[] values2={2,4,6,8};
		SeqList<Integer> list2=new SeqList<Integer>(values2);
		
		SeqList<Integer> list3=new SeqList<Integer>(values1.length+values2.length);
		
		System.out.println("三、数组合并。");
		System.out.println("数组1："+list1.toString());
		System.out.println("数组2："+list2.toString());
		
		int i=0,j=0;
		while(i<list1.size()&& j<list2.size())
		{
			if(list1.get(i)<list2.get(j))//比较大小，小的放入数组3中。
			{
				list3.insert(list1.get(i));
				i++;					//记录该数组放了的个数,并控制循环。
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
		
		
		System.out.println("合并后的数组3："+list3.toString());
	}
}
