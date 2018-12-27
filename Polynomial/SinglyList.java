package four;

public class SinglyList<T> extends Object {
	public Node<T> head ; //ͷָ�룬ָ�������ͷ�ڵ�
	//���췽��
	public SinglyList() {
		this.head = new Node<T>();
	}
	
	public SinglyList(T[] values)
	{
		this();
		Node<T>rear = this.head;
		for(int i=0;i<values.length;i++) {	
			rear.next = new Node<T>(values[i],null);
			rear = rear.next;
		}
	}
	
	boolean isEmpty() {            //�ж����Ա��Ƿ��
		return this.head.next == null;
	}
	
    public int size() {                        //�������Ա���
    	 Node<T> p = this.head.next; 
    	 int i = 0;
         for (i = 0;p!=null ; i++) //p����������
        	 p=p.next;
         return i;
    }
    
    public T get(int i)                                    //���ص�i��Ԫ�أ�0��i<���ȡ���iԽ�磬����null��O(n)
    {
        Node<T> p=this.head.next;
        for (int j=0; p!=null && j<i; j++)                 //����������Ѱ�ҵ�i����㣨pָ��
            p = p.next;
        return (i>=0 && p!=null) ? p.data : null;          //��pָ���i����㣬������Ԫ��ֵ
    }
    
   public void set(int i, T x)
   {
       if (x==null)
           throw new NullPointerException("x==null");     //�׳��ն����쳣
       Node<T> p=this.head.next;
       for (int j=0; p!=null && j<i-1; j++)                 //����Ѱ�ҵ�i����㣨pָ��
           p = p.next;
       if (i>=0 && p!=null)
           p.data = x;                                    //pָ���i�����
       else throw new IndexOutOfBoundsException(i+"");    //�׳����Խ���쳣
   }     
   
    
   public Node<T> insert(int i, T x)
   {
       if (x==null)
           throw new NullPointerException("x==null");     //�׳��ն����쳣
       Node<T> front=this.head;                           //frontָ��ͷ���
       for (int j=0;  front.next!=null && j<i;  j++)      //Ѱ�ҵ�i-1�������һ����㣨frontָ��
           front = front.next;
       front.next = new Node<T>(x, front.next);           //��front֮�����ֵΪx��㣬����ͷ���롢�м�/β����
       return front.next;                                 //���ز�����
   }
    
    Node<T> insert(T x){             //�����Ա�������xԪ��
    	return insert(Integer.MAX_VALUE,x);
    }
    
    public T remove(int i)    //ɾ����i��Ԫ�أ�0��i<n�����ر�ɾ��Ԫ�أ���iԽ�磬����null��O(n)
    {
        Node<T> front=this.head;                           //frontָ��ͷ���
        for (int j=0;  front.next!=null && j<i;  j++)      //����Ѱ�ҵ�i-1��㣨frontָ��
            front = front.next;
        if (i>=0 && front.next!=null)                      //��front�ĺ�̽����ڣ���ɾ��֮
        {
            T old = front.next.data;                       //��ô�ɾ��������õĶ���
            front.next = front.next.next;                  //ɾ��front�ĺ�̽�㣬����ͷɾ�����м�/βɾ��
        }
        return null;                                       //��i<0��i>��
    }
    
    void removeAll() {             //ɾ�����Ա�����Ԫ��
    	this.head.next = null;
    }
    
    Node<T> search(T key){        //���ң������״γ��ֵĹؼ���ΪkeyԪ��
    	for (Node<T> p=this.head.next;p!=null;p=p.next)
        if (key.equals(p.data))                        //ִ��T���equals(Object)����������ʱ��̬
            return p;
    		return null;
    }
    
    public String toString() {     //����˳�������Ԫ�ص������ַ�������ʽΪ����������
    	String str = this.getClass().getName()+"(";
    	for(Node<T> p = this.head.next;p!=null;p=p.next) {
    		str+=p.data.toString();
    		if(p.next!=null)
    			str+=",";
    	}
    	return str+")";
    	}
     }
	

