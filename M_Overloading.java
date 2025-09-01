public class M_Overloading {

    void sum(int a)
    {
        System.out.println(a+a);
    }

    void sum(int b,int a)
    {
        System.out.println(b+a);
    }

    public static void main(String[] args)
    {
        M_Overloading sample = new M_Overloading();
        sample.sum(2,6);
    }
    
}
