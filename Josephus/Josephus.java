package there;

public class Josephus {
	//已知n个人（以编号1，2，3...n分别表示）围坐在一张圆桌周围。
	//从编号为1的人开始报数，数到2的那个人出列；
	//他的下一个人又从1开始报数，数到m的那个人又出列；依此规律重复下去，直到圆桌周围的人全部出列。
	//要求：输出出列次序。
	public Josephus(int n,int k,int m) {   //n个人，从k开始报数，数到m的人出列
		   
	       System.out.print("Josephus("+n+","+k+","+m);
	       SeqList<String>list=new SeqList<String>(n);
	       
	       for(int i=0;i<n;i++)
	    	   list.insert((1+i)+"");
	           System.out.println(list.toString());
	           int i=k;
	           while(list.size()>1) {
	        	   i=(i+m-1)%list.size();
	        	   System.out.print("出列"+list.remove(i).toString()+",");
	        	   System.out.println(list.toString());
	           }
	           System.out.println("最后留下"+list.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("假设有5个人，编号为1，2，3，4，5。从编号为1的人开始报数，数到2的那个人出列。");
          new Josephus(5,0,2);
	}

}
