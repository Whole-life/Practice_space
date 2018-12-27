package two;
//求交集
public class Meet {
	public void meet() {
		
		Integer [] values1 = {10,30,50,70};
		SortedSinglyList<Integer> A = new SortedSinglyList<Integer>(values1);
		
		Integer [] values2 = {50,70,80,90};
		SortedSinglyList<Integer> B = new SortedSinglyList<Integer>(values2);
		
		SortedSinglyList<Integer> C = new SortedSinglyList<Integer>();
		
		System.out.println("数组1："+A.toString());
		System.out.println("数组2"+B.toString());
		
		Node<Integer> p = A.head;
		Node<Integer> q = B.head;

		for(p=p.next;p!=null;p=p.next) {
			for(q=q.next;q!=null;q=q.next) {
			if( p!=null && q!=null && (p.data).compareTo(q.data)==0 ) 
				C.insert(p.data);
			break;
		}
			q = B.head;
		}
		System.out.println("数组交集："+C.toString());
	}
}
