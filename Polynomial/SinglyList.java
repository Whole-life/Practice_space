package four;

public class SinglyList<T> extends Object {
	public Node<T> head ; //头指针，指向单链表的头节点
	//构造方法
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
	
	boolean isEmpty() {            //判断线性表是否空
		return this.head.next == null;
	}
	
    public int size() {                        //返回线性表长度
    	 Node<T> p = this.head.next; 
    	 int i = 0;
         for (i = 0;p!=null ; i++) //p遍历单链表
        	 p=p.next;
         return i;
    }
    
    public T get(int i)                                    //返回第i个元素，0≤i<表长度。若i越界，返回null。O(n)
    {
        Node<T> p=this.head.next;
        for (int j=0; p!=null && j<i; j++)                 //遍历单链表，寻找第i个结点（p指向）
            p = p.next;
        return (i>=0 && p!=null) ? p.data : null;          //若p指向第i个结点，返回其元素值
    }
    
   public void set(int i, T x)
   {
       if (x==null)
           throw new NullPointerException("x==null");     //抛出空对象异常
       Node<T> p=this.head.next;
       for (int j=0; p!=null && j<i-1; j++)                 //遍历寻找第i个结点（p指向）
           p = p.next;
       if (i>=0 && p!=null)
           p.data = x;                                    //p指向第i个结点
       else throw new IndexOutOfBoundsException(i+"");    //抛出序号越界异常
   }     
   
    
   public Node<T> insert(int i, T x)
   {
       if (x==null)
           throw new NullPointerException("x==null");     //抛出空对象异常
       Node<T> front=this.head;                           //front指向头结点
       for (int j=0;  front.next!=null && j<i;  j++)      //寻找第i-1个或最后一个结点（front指向）
           front = front.next;
       front.next = new Node<T>(x, front.next);           //在front之后插入值为x结点，包括头插入、中间/尾插入
       return front.next;                                 //返回插入结点
   }
    
    Node<T> insert(T x){             //在线性表最后插入x元素
    	return insert(Integer.MAX_VALUE,x);
    }
    
    public T remove(int i)    //删除第i个元素，0≤i<n，返回被删除元素；若i越界，返回null。O(n)
    {
        Node<T> front=this.head;                           //front指向头结点
        for (int j=0;  front.next!=null && j<i;  j++)      //遍历寻找第i-1结点（front指向）
            front = front.next;
        if (i>=0 && front.next!=null)                      //若front的后继结点存在，则删除之
        {
            T old = front.next.data;                       //获得待删除结点引用的对象
            front.next = front.next.next;                  //删除front的后继结点，包括头删除、中间/尾删除
        }
        return null;                                       //若i<0或i>表长
    }
    
    void removeAll() {             //删除线性表所有元素
    	this.head.next = null;
    }
    
    Node<T> search(T key){        //查找，返回首次出现的关键字为key元素
    	for (Node<T> p=this.head.next;p!=null;p=p.next)
        if (key.equals(p.data))                        //执行T类的equals(Object)方法，运行时多态
            return p;
    		return null;
    }
    
    public String toString() {     //返回顺序表所有元素的描述字符串，形式为“（，）”
    	String str = this.getClass().getName()+"(";
    	for(Node<T> p = this.head.next;p!=null;p=p.next) {
    		str+=p.data.toString();
    		if(p.next!=null)
    			str+=",";
    	}
    	return str+")";
    	}
     }
	

