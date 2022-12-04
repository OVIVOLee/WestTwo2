package wt01;

import wt01.Animal;

public interface AnimalShop {
    boolean buy(Animal newAnimal);
    boolean treat(Customer newCustomer, int want);
    void close();
}
