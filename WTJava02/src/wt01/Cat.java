package wt01;

import wt01.Animal;

public class Cat extends Animal {
    public Cat(String name, int age, char sex) {
        super(name, age, sex, 200d);
    }

    @Override
    public String toString() {
        return "wt01.Cat{" + "name='" + name + '\'' + ", age=" + age + ", sex=" + sex + ", price=" + 2*price + '}';
    }
}
