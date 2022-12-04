package wt01;

import wt01.*;

public class test {
    public static void main(String[] args) {
        test1();
        System.out.println("#####################################################\n\n");
        test2();
        System.out.println("#####################################################\n\n");
        test3();
    }

    public static void test1() {
        MyAnimalShop shop = new MyAnimalShop(1000, true);
        Dog dog1 = new Dog("大白", 1, 'm', true);
        Cat cat1 = new Cat("小黑", 3, 'f');
        Monkey monkey1 = new Monkey("豆豆", 6, 'm');
        System.out.println(shop.buy(dog1));
        System.out.println(shop.buy(cat1));
        System.out.println(shop.buy(monkey1));
        System.out.println(shop);

        System.out.println("***************************************");

        Customer customer1 = new Customer("李华");
        Customer customer2 = new Customer("李青");
        System.out.println(shop.treat(customer1, 1));
        System.out.println(shop.treat(customer2, 1));
        System.out.println(shop.treat(customer1, 0));
        System.out.println(shop);
        shop.close();
    }

    public static void test2() {
        MyAnimalShop shop = new MyAnimalShop(500, true);
        Dog dog1 = new Dog("大白", 1, 'm', true);
        Cat cat1 = new Cat("小黑", 3, 'f');
        Monkey monkey1 = new Monkey("豆豆", 6, 'm');
        try {
            System.out.println(shop.buy(dog1));
            System.out.println(shop.buy(cat1));
            System.out.println(shop.buy(monkey1));
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
        System.out.println(shop);
    }

    public static void test3() {
        MyAnimalShop shop = new MyAnimalShop(1000, true);
        Customer customer1 = new Customer("李华");
        try {
            System.out.println(shop.treat(customer1, 0));
        } catch (AnimalNotFountException e) {
            e.printStackTrace();
        }
        System.out.println(shop);
    }
}
