package wt01;

import wt01.Animal;

public class Dog extends Animal {
    boolean isVaccineInjected;

    public Dog(String name, int age, char sex, boolean isVaccineInjected) {
        super(name, age, sex, 100d);
        this.isVaccineInjected = isVaccineInjected;
    }

    @Override
    public String toString() {
        return "wt01.Dog{" + ", name='" + name + '\'' + ", age=" + age + ", sex=" + sex + ", price=" + 2*price + " isVaccineInjected=" + isVaccineInjected + '}';
    }
}
