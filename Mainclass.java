// class Dad{
//     int Money = 2000;
// }

// class Son extends Dad{
// }
// public class Inheritence {
//     public static void main(String[] args)
//     {
//         Son call = new Son();
//         System.out.println(call.Money);
//     }
    
// }

// Single Inheritence

class Animals{
    void eat(){
        System.out.println("EAT");
    }
}

class Dog extends Animals{
    void sound(){
        System.out.println("BARKS");
    }
}

class Cat extends Dog{
    void sound1(){
        System.out.println("MEOW");
    }
}

public class Mainclass{
    public static void main(String[] args){
        Cat D1 = new Cat();
        D1.eat();
    }
}
