package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Animal cat = new Animal(5, 0.5, "Cat");
//        System.out.println(cat);
//
//        Animal ant = new Animal();
//        ant.setAge(1);
//        System.out.println(ant);
        Pub pub1 = new Pub("Manchester", 700, 2330, 3.56, Drink.CARLING);
        pub1.setCloseTime(2270);
        System.out.println(pub1.getCloseTime());
    }
}
