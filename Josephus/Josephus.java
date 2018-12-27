package there;

public class Josephus {
	//��֪n���ˣ��Ա��1��2��3...n�ֱ��ʾ��Χ����һ��Բ����Χ��
	//�ӱ��Ϊ1���˿�ʼ����������2���Ǹ��˳��У�
	//������һ�����ִ�1��ʼ����������m���Ǹ����ֳ��У����˹����ظ���ȥ��ֱ��Բ����Χ����ȫ�����С�
	//Ҫ��������д���
	public Josephus(int n,int k,int m) {   //n���ˣ���k��ʼ����������m���˳���
		   
	       System.out.print("Josephus("+n+","+k+","+m);
	       SeqList<String>list=new SeqList<String>(n);
	       
	       for(int i=0;i<n;i++)
	    	   list.insert((1+i)+"");
	           System.out.println(list.toString());
	           int i=k;
	           while(list.size()>1) {
	        	   i=(i+m-1)%list.size();
	        	   System.out.print("����"+list.remove(i).toString()+",");
	        	   System.out.println(list.toString());
	           }
	           System.out.println("�������"+list.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������5���ˣ����Ϊ1��2��3��4��5���ӱ��Ϊ1���˿�ʼ����������2���Ǹ��˳��С�");
          new Josephus(5,0,2);
	}

}
