package four;

public class SortedSinglyList<T extends Comparable<? super T>> extends SinglyList<T> {
	//构造方法
	public SortedSinglyList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SortedSinglyList(T[] values) {
		super(values);
		// TODO Auto-generated constructor stub
		for(int i = 0;i<values.length;i++)
			this.insert(values[i]);
	}
	
	public void set(int i, T x) //覆盖父类的set(int i, T x)方法
    {
        throw new UnsupportedOperationException("set(int i, T x)");
    }
	
	 public Node<T> insert(int i, T x) //覆盖父类的insert(int i, T x)方法
	    {
	        throw new UnsupportedOperationException("insert(int i, T x)");
	    }
    
	public Node<T> insert(T x){           //在线性表最后插入x元素
		 Node<T> front=super.head, p=front.next;             
	        while (p!=null && x.compareTo(p.data)>0)         
	        {
	            front = p;
	            p = p.next;
	        }
	        front.next = new Node<T>(x, p);                    
	        return front.next;    
	}
	
	public Node<T> search(T key){       //查找，返回首次出现的关键字为key元素
		for (Node<T> p=this.head.next;p!=null;p=p.next)
	        if (key.equals(p.data))                       
	            return p;
	    		return null;
		}
	}
	

