package two;
/*ɾ����i����ʼ��k��Ԫ�ء�
 *ɾ��������������������ֵ����mink��С��maxk��Ԫ�ء�
 * */
public class Shan {
	
	public void shanChu() {
		Integer [] values = {10,20,30,40,50,60};
		SinglyList<Integer> list = new SinglyList<Integer>(values);
		System.out.println("�������飺"+list.toString());
		
		System.out.println("һ��ɾ����2����ʼ��3��Ԫ��");
		
		for(int i=1;i<=3;i++)
		list.remove(1);
		System.out.println("   "+list.toString());
		
		System.out.println("����ɾ��������������������ֵ����20��С��60��Ԫ��");
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
