package wt01;

import wt01.Animal;

public class Monkey extends Animal {

    public Monkey(String name, int age, char sex) {
        super(name, age, sex, 300d);
    }

    @Override
    public String toString() {
        return "wt01.Monkey{" + "name='" + name + '\'' + ", age=" + age + ", sex=" + sex + ", price=" + 2*price + '}';
    }
}
