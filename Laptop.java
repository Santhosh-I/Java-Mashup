public class Laptop {
    String name = "";
    String Proc = "";
    int ram = 0;
    int Price = 0;

    public static void main(String[] srgs)
    {
        Laptop lap1 = new Laptop();

        lap1.name = "LENOVA YOGA";
        lap1.Proc = "Ultra 5";
        lap1.ram = 16;
        lap1.Price = 130000;

        System.out.println(lap1.name);
        System.out.println(lap1.Proc);
        System.out.println(lap1.ram);
        System.out.println(lap1.Price);
    }
}
