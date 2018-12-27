package one;

public class Test {
	
	public static void main(String args[]) {
		
		String [] values = {"A","B","C","D","E"};
		SinglyList<String> list1 = new SinglyList<String>(values);
		
		System.out.println("测试数组："+list1.toString());
		System.out.println("一、是否为空："+list1.isEmpty());
		System.out.println("二、长度："+list1.size());
		
		System.out.println("三、返回第3（i≥0）个元素："+list1.get(2));
		System.out.print("四、设第2个元素值为20	");
		list1.set(2,"20");
		System.out.println(""+list1.toString());
		
		System.out.print("五、插入30作为第3个元素	 "+list1. insert(2,"30"));
		System.out.println(""+list1.toString());
		
		System.out.print("六、线性表最后插入100元素		");
		list1.insert("100");
		System.out.println(""+list1.toString());
		
		System.out.print("七、删除第3个元素并返回被删除对象    	"+list1.remove(2));
		
		System.out.println(""+list1.toString());
		
		System.out.println("八、查找，返回首次出现的关键字为D元素	"+list1.search("D"));
		
		System.out.println("九、顺序表所有元素的描述字符串，形式为“（，）”"+ list1.toString());
		
		System.out.println("十、删除线性表所有元素");
		list1.removeAll();
		System.out.println(""+list1.toString());
		
		
		
	}

}
