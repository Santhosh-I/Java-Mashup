class Store {

    String name;
    int quantity;
    double price;
    
    Store(String name,int quantity, double price)
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double total(){
        return quantity*price;
    }

    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Quantity:"+quantity);
        System.out.println("Price:"+price);
        System.out.println("Total:"+total());
        System.out.println("-------------------------------");
    }

    public static void main(String[] args)
    {
        Store p1 = new Store("Batman",1,1000.0);
        Store p2 = new Store("Ironman",3,4000.0);
        Store p3 = new Store("Spiderman",2,1200.0);
        
        p1.display();
        p2.display();
        p3.display();

        System.out.println("Grand Total:"+(p1.total()+p2.total()+p3.total()));
    }
}
