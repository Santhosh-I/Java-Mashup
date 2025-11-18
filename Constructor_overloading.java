class Constructor_overloading {

    String name;
    int rollno;

    Constructor_overloading(String a,int b)
    {
        name = a;
        rollno = b;
    }
    Constructor_overloading(String a)
    {
        name = a;
        rollno = 233;
    }

    public static void main(String[] args)
    {
        Constructor_overloading s1 = new Constructor_overloading("Sandy", 33);
        System.out.println(s1.name);
        System.out.println(s1.rollno);
    }
    
}
