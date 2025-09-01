class Dad{
    int Money = 2000;
}

class Son extends Dad{
}
public class Inheritence {
    public static void main(String[] args)
    {
        Son call = new Son();
        System.out.println(call.Money);
    }
    
}
