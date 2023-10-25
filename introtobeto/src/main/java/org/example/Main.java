package org.example;

public class Main {
    public static void main(String[] args) {

       Product product1= new Product();
        product1.setName("Bilgisayar");
        product1.setDiscount(5);
        product1.setPrice(20);

        Product product2= new Product("Laptop",10,10);
        System.out.println(product2.getName());

        Product product3= new Product(25,5);
        System.out.println(product3.getDiscount());


        Category category1= new Category();
        category1.setName("Elektronik Aletler");
        category1.setNumber(4);
        category1.setUrlImage("image.jpg");

        Category category2= new Category("Ev & Mobilya",6);
        System.out.println(category2.getName());

        Order order1= new Order();
        order1.setOrderName("Bilgisayar");
        order1.setOrderNumber(23);

        Order order2=new Order("Kahve Makinesi","Market",9);
        System.out.println(order2.getOrderName());
        System.out.println(order2.getOrderNumber());

        User user1= new User();
        user1.setUserName("Merve");
        user1.setUserId("4458390");
        user1.setUrlImage("image.jpg");

        User user2= new User("362678","Merve");
        System.out.println(user2.getUserId());

    }
}