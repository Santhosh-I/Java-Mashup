import java.util.Scanner;

class Student_marks {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark 1:");
        int m1 = sc.nextInt();

        System.out.print("Enter mark 2:");
        int m2 = sc.nextInt();

        System.out.print("Enter mark 3:");
        int m3 = sc.nextInt();

        System.out.print("Enter mark 4:");
        int m4 = sc.nextInt();

        System.out.print("Enter mark 5:");
        int m5 = sc.nextInt();

        int total = m1+m2+m3+m4+m5;
        double avg = total/5;

        char grade;
        if(avg>=90) grade ='A';
        else if (avg>=80) grade ='B';
        else if (avg>=70) grade ='C';
        else if (avg>=60) grade ='D';
        else if (avg>=50) grade ='E';
        else grade ='F';

        System.out.println("Total marks:"+total);
        System.out.println("Average mark:"+avg);
        System.out.print("Grade:"+grade);

    }
}
