package there;

public class SeqList<T> extends Object implements LList<T> {
	protected Object[] element;
	protected int n;
	
	//构造方法
	public SeqList(int length) {
		this.element = new Object[length];
		
	}
	//传数组的构造方法
	public SeqList(T[] values) {
		this(values.length);
		for(int i=0;i<values.length;i++) {
			this.element[i] = values[i];
			this.n= element.length;
		}
	/*	//拷贝构造方法，用于高效删除
	public SeqList(SeqList<? extends T> list) {
		
		this.n = list.n;
		this.element = new Object[list.element.length];
		for(int i=0;i<list.n;i++)
			this.element[i] = list.element[i];
		
	}
		*/
		// TODO Auto-generated constructor stub
	}
	//判断线性表是否空   
	
	public boolean isEmpty() {
		System.out.println("一、判断线性表是否为空:");
		return this.n == 0;	
	}
	//返回线性表长度
	 public int size() {  
		
		 return this.n;
	 }
	//返回第i（i≥0）个元素
     public T get(int i) {   
    	
    	 if(i>=0&&i<this.n)
    		 return (T)this.element[i-1];
    	     return null;	 
     }   
     //设置第i个元素值为x
     public void set(int i, T x) {
    	
    	 if(x==null)
    		 throw new NullPointerException("x==null");
    	 if(i>=0&&i<this.n)
    		 this.element[i]=x;
    	 else throw new java.lang.IndexOutOfBoundsException(i+"");	 
     }
     //插入x作为第i个元素
     public void insert(int i, T x) {
    	
    	 if(x==null)
    		 throw new NullPointerException("x==null");
    	 if(i<0) i=0;
    	 if(i>this.n) i=this.n;
    	 Object[] sourse = this.element;
    	 if(this.n==element.length) {
    		 this.element=new Object[sourse.length*2];
    		 for(int j=0;j<i;j++)
    			 this.element[j]=sourse[j];
    	 }
    	 for(int j=this.n-1;j>=i;j--)
    	      this.element[j+1]=sourse[j];
    	      this.element[i]=x;
    	      this.n++;
     }
     //在线性表最后插入x元素
     public void insert(T x) {
    	
           this.insert(this.n,x);
     }
     //删除第i个元素并返回被删除对象
     public T remove(int i) {
    	 
    	 if(this.n>0 && i>=0 && i<this.n) {
    		 T old = (T)this.element[i];
    		 for(int j=i;j<this.n-1;j++)
    			 this.element[j]=this.element[j+1];
    		 this.element[this.n-1]=null;
    		 this.n--;
    		 return old;
    	 }
    	 return null;
     }
    //查找，返回首次出现的关键字为key的元素的位序       
     public int search(T key) {
    	
    	 for(int i=0;i<this.n;i++)
    		 if(key.equals(this.element[i]))
    			 return i+1;
    	         return -1;
     }             
     //删除线性表所有元素               
     public void removeAll() {
    	
    	
    	 this.n=0;
    	 if(this.n<=0) System.out.println("该线性表无元素。"); 
    	 
     }
     //返回顺序表所有元素的描述字符串，形式为“（，）”        
    public String toString() {
    	
    	String str=this.getClass().getName()+"(";
    	if(this.n>0)
    		str+=this.element[0].toString();
    	for(int i=1;i<this.n;i++)
    	    str+=","+this.element[i].toString();
    	return str+")";
    }    

}
