package two;

public class Merge {
	public void merge(){
	Integer [] values1 = {10,30,50,70};
	SortedSinglyList<Integer> list1 = new SortedSinglyList<Integer>(values1);
	
	Integer [] values2 = {20,40,60,80};
	SortedSinglyList<Integer> list2 = new SortedSinglyList<Integer>(values2);
	
	SortedSinglyList<Integer> list3 = new SortedSinglyList<Integer>();
	System.out.println("三、数组合并");
	System.out.println("   数组1："+list1.toString());
	System.out.println("   数组2"+list2.toString());
	
	Node<Integer> p = list1.head;
	Node<Integer> q = list2.head;

	while(p.next!=null) {
		list3.insert(p.next.data);
		p = p.next;
	}
	while(q.next!=null) {
		list3.insert(q.next.data);
		q = q.next;
	}
	
	System.out.println("   "+list3.toString());
	}
}
