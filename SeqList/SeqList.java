package one;

public class SeqList<T> extends Object implements LList<T> {
	protected Object[] element;
	protected int n;
	
	//���췽��
	public SeqList(int length) {
		this.element = new Object[length];
	}
	
	//������Ĺ��췽��
	public SeqList(T[] values) {
		this(values.length);
		for(int i=0;i<values.length;i++) {
			this.element[i] = values[i];
			this.n= element.length;
		}
	}
	
	//�ж����Ա��Ƿ��   
	public boolean isEmpty() {
		return this.n == 0;	
	}	
	
	//�������Ա���
	 public int size() {  	 
		 return this.n;
	 }
	 
	//���ص�i��i��0����Ԫ��
     public T get(int i) {     
    	 if(i>=0&&i<this.n)
    		 return (T)this.element[i-1];
    	     return null;	 
     }   
     
     //���õ�i��Ԫ��ֵΪx
     public void set(int i, T x) {
    	 if(x==null)
    		 throw new NullPointerException("x==null");
    	 if(i>=0&&i<this.n)
    		 this.element[i]=x;
    	 else throw new java.lang.IndexOutOfBoundsException(i+"");	 
     }
     
     //����x��Ϊ��i��Ԫ��
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
     
     //�����Ա�������xԪ��
     public void insert(T x) {
           this.insert(this.n,x);
     }
     
     //ɾ����i��Ԫ�ز����ر�ɾ������
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
     
    //���ң������״γ��ֵĹؼ���Ϊkey��Ԫ�ص�λ��       
     public int search(T key) { 	
    	 for(int i=0;i<this.n;i++)
    		 if(key.equals(this.element[i]))
    			 return i+1;
    	         return -1;
     }    
     
     //ɾ�����Ա�����Ԫ��               
     public void removeAll() { 	
    	 System.out.println("ʮ��ɾ�����Ա�����Ԫ��  ");
    	 this.n=0;
    	 if(this.n<=0) System.out.println("�����Ա���Ԫ�ء�");  
     }
     
     //����˳�������Ԫ�ص������ַ�������ʽΪ����������        
    public String toString() {
    	 System.out.println("�š�����˳�������Ԫ�ص������ַ�������ʽΪ����������");
    	String str=this.getClass().getName()+"(";
    	if(this.n>0)
    		str+=this.element[0].toString();
    	for(int i=1;i<this.n;i++)
    	    str+=","+this.element[i].toString();
    	return str+")";
    }    
}
