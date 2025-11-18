class Method_overloading{

    int add(int a, int b){
        return a+b;
    }

    int add(int a,int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args){
        Method_overloading sum = new Method_overloading();
        System.out.println(sum.add(1,2));
    }
}