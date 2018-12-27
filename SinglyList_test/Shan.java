package two;
/*删除第i个开始的k个元素。
 *删除递增有序单链表中所有值大于mink且小于maxk的元素。
 * */
public class Shan {
	
	public void shanChu() {
		Integer [] values = {10,20,30,40,50,60};
		SinglyList<Integer> list = new SinglyList<Integer>(values);
		System.out.println("测试数组："+list.toString());
		
		System.out.println("一、删除第2个开始的3个元素");
		
		for(int i=1;i<=3;i++)
		list.remove(1);
		System.out.println("   "+list.toString());
		
		System.out.println("二、删除递增有序单链表中所有值大于20且小于60的元素");
		int mink = 20;
		int maxk = 60;
		int i=0;
		Node<Integer> p = list.head;
		while(p.next!=null && p.next.data <mink)
		{
			p=p.next;
			i++;
		}
		while (p.next!=null && p.next.data<maxk)
		{
			list.remove(i);
		}
		
		System.out.println("   "+list.toString());
	}

}
