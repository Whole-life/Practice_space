package two;

/*
1.运用基本操作编写算法删除第i个开始的k个元素。
2.	编写高效算法删除第i个开始的k个元素。
*/
public class shan {
		
	public void Delet1(){
		Integer [] values = {10,20,30,40,50,60};//创建有6个整型元素的数组
		
		System.out.print("测试数组为：");	//输出数组
		System.out.print(values[0]);
		for(int i=1;i<values.length;i++)
		System.out.print(","+values[i]);
		System.out.println();
	
		SeqList<Integer> list = new SeqList<Integer>(values);
		
		System.out.println("一、删除第2个元素开始的3个元素。");
		for(int i=1;i<=2;i++)	//基本操作删除第2个元素开始的3个元素
			list.element[i]=list.element[i+3];
		
		System.out.print("打印新数组：");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length-3 ;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
		
		//编写高效算法删除第i个开始的k个元素。
		System.out.println("二、高效算法删除第2个元素开始的3个元素。");
		for(int i=1;i<=3;i++)	//基本操作删除第2个元素开始的3个元素
			list.remove(1);
		
		System.out.print("打印新数组：");
		System.out.print(list.element[0]);
		for(int i=1;i<list.element.length && list.element[i]!=null;i++)
		System.out.print(","+list.element[i]);
		System.out.println();
	}
}
