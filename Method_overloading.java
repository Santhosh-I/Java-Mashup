class Method_overloading{

    int add(int a, int b){
        return a+b;
    }

    int add(int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        Method_overloading sum = new Method_overloading();
        int addition = sum.add(1,2);
        System.out.println(addition);
    }
}