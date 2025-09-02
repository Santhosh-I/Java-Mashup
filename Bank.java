import java.util.Scanner;

public class Bank {

    int money = 1000;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank B1 = new Bank();
        System.out.print("Enter the amount:");
        int amount = sc.nextInt();
        if (B1.money>amount){
            System.out.print("The entered amount is :"+amount);
        }
        else{
            System.out.print("Insufficient Balance");
        }

    }
}
