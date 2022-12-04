package wt01;

abstract class Animal {//设动物的购入价格为卖出价格的一半
    protected String name;
    protected int age;
    protected char sex;//'m'为雄性，‘f’为雌性
    protected double price;//购入价格

    public Animal(String name, int age, char sex, double price) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }

    abstract public String toString();
}
