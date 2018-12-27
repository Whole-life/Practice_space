package one;

public class Test {
	
		void ways () {
		String [] values = {"10","11","20","22","30","33"};//创建有6个整型元素的数组
		
		System.out.print("测试数组为：");	//输出数组
		System.out.print(values[0]);
		for(int i=1;i<values.length;i++)
		System.out.print(","+values[i]);
		System.out.println();
		
		System.out.println("测试开始:");
		SeqList<String> list = new SeqList<String>(values);

		System.out.println("一、判断线性表是否为空:");
		if(list.isEmpty() == true) 	//判断线性表是否空   
		    System.out.println("线性表为空");
		else
			System.out.println("线性表不为空。");
		
		System.out.print("二、线性表长度为:");	
		System.out.println(""+list.size());	//返回线性表长度
		
		System.out.print("三、返回第2个元素:");     
		System.out.println(""+list.get(2));	//返回第i（i≥0）个元素
		
		System.out.print("四、设置第2个元素值为88。");
		list.set(1,"88");	//设置第i个元素值为x
		System.out.print("打印新数组：");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
		
		System.out.print("五、插入60为第二个元素。");
		list.insert(1,"60");	//插入x作为第i个元素
		System.out.print("打印新数组：");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length && list.element[i]!=null;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
		
		 System.out.print("六、在线性表最后插入100。");
		list.insert("100");	//在线性表最后插入x元素
		System.out.print("打印新数组：");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length && list.element[i]!=null;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
		
		System.out.print("七、删除第2个元素并返回被删除对象。");
		System.out.println("删除对象为："+list.remove(1));	//删除第i个元素并返回被删除对象
		System.out.print("打印新数组：");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length && list.element[i]!=null;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
		
		
		 System.out.println("八、返回首次出现的关键字为10的元素的位序");
		System.out.println("首次出现10的元素的位序为："+list.search("10"));	//查找，返回首次出现的关键字为key的元素的位序      
		
		System.out.println(""+list.toString());	//返回顺序表所有元素的描述字符串，形式为“（，）”
		
		list.removeAll();	//删除线性表所有元素  
		}
		public static void main(String args[]){
			Test student = new Test();
			student.ways();

	}
	
}
