package one;

public class Test {
	
	public static void main(String args[]) {
		
		String [] values = {"A","B","C","D","E"};
		SinglyList<String> list1 = new SinglyList<String>(values);
		
		System.out.println("�������飺"+list1.toString());
		System.out.println("һ���Ƿ�Ϊ�գ�"+list1.isEmpty());
		System.out.println("�������ȣ�"+list1.size());
		
		System.out.println("�������ص�3��i��0����Ԫ�أ�"+list1.get(2));
		System.out.print("�ġ����2��Ԫ��ֵΪ20	");
		list1.set(2,"20");
		System.out.println(""+list1.toString());
		
		System.out.print("�塢����30��Ϊ��3��Ԫ��	 "+list1. insert(2,"30"));
		System.out.println(""+list1.toString());
		
		System.out.print("�������Ա�������100Ԫ��		");
		list1.insert("100");
		System.out.println(""+list1.toString());
		
		System.out.print("�ߡ�ɾ����3��Ԫ�ز����ر�ɾ������    	"+list1.remove(2));
		
		System.out.println(""+list1.toString());
		
		System.out.println("�ˡ����ң������״γ��ֵĹؼ���ΪDԪ��	"+list1.search("D"));
		
		System.out.println("�š�˳�������Ԫ�ص������ַ�������ʽΪ����������"+ list1.toString());
		
		System.out.println("ʮ��ɾ�����Ա�����Ԫ��");
		list1.removeAll();
		System.out.println(""+list1.toString());
		
		
		
	}

}
