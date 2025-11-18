class Students{
    String name;
    int rollno;
    String dept;

    void display(){
        System.out.println("-------------------------------");
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+rollno);
        System.out.println("Department:"+dept);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args)
    {
        Students s1 = new Students();
        s1.name = "Santhosh";
        s1.rollno = 33;
        s1.dept = "AI&DS";

        Students s2 = new Students();
        s2.name = "Batman";
        s2.rollno = 100;
        s2.dept = "AI&DS";

        s1.display();
        s2.display();
    }
}