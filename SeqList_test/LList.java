package two;

public interface LList<T>
{	                //���Ա�ӿڣ����Ͳ���T��ʾ����Ԫ�ص���������
    boolean isEmpty();            //�ж����Ա��Ƿ��
    int size();                        //�������Ա���
    T get(int i);                         //���ص�i��i��0����Ԫ��
    void set(int i, T x);             //���õ�i��Ԫ��ֵΪx
    void insert(int i, T x);        //����x��Ϊ��i��Ԫ��
    void insert(T x);             //�����Ա�������xԪ��
    T remove(int i);                //ɾ����i��Ԫ�ز����ر�ɾ������
    int search(T key);          //���ң������״γ��ֵĹؼ���Ϊkey��Ԫ�ص�λ��
    void removeAll();             //ɾ�����Ա�����Ԫ��
    public String toString();     //����˳�������Ԫ�ص������ַ�������ʽΪ����������
}
