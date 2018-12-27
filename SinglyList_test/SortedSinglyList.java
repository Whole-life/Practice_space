package two;


public class SortedSinglyList<T extends Comparable<? super T>> extends SinglyList<T> {

	public SortedSinglyList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SortedSinglyList(T[] values) {
	//	super(values);
		// TODO Auto-generated constructor stub
		for(int i = 0;i<values.length;i++)
			this.insert(values[i]);
	}
	
	public void set(int i, T x) 
    {
        throw new UnsupportedOperationException("set(int i, T x)");
    }
	
	 public Node<T> insert(int i, T x) 
	    {
	        throw new UnsupportedOperationException("insert(int i, T x)");
	    }
    
	
	public Node<T> insert(T x){           //�����Ա�������xԪ��
		 Node<T> front=super.head, p=front.next;             //frontָ��p��ǰ�����
	        while (p!=null && x.compareTo(p.data)>0)           //Ѱ�Ҳ���λ��
	        {
	            front = p;
	            p = p.next;
	        }
	        front.next = new Node<T>(x, p);                    //��front֮��p֮ǰ����ֵΪx���
	        return front.next;    
	}
	
	public Node<T> search(T key){       //���ң������״γ��ֵĹؼ���ΪkeyԪ��
		for (Node<T> p=this.head.next;p!=null;p=p.next)
	        if (key.equals(p.data))                       
	            return p;
	    		return null;
		}
	}
	

