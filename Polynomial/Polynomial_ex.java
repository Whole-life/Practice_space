package four;

public class Polynomial_ex 
{
    public static void main(String args[])
    {
        System.out.println("一元多项式");
        TermX aterms[]={new TermX(-7,9), new TermX(2,7), new TermX(-9,4), new TermX(1,2),
                       new TermX(-1,1), new TermX(2,0)};   
        Polynomial apoly = new Polynomial(aterms);


        TermX bterms[]={new TermX(9,11), new TermX(5,10), new TermX(-3,8), new TermX(10,4),
                       new TermX(-1,2), new TermX(1,1), new TermX(-1,0)};

        Polynomial bpoly = new Polynomial("-1+x-x^2+10x^4-3x^8+5x^10+9x^11");//图2.25B(x)
        System.out.println("A="+apoly.toString()+"\nB="+bpoly.toString());
        
        Polynomial cpoly = apoly.union(bpoly);
        System.out.println("C=A-B，C="+cpoly.toString()); 
    }
}


