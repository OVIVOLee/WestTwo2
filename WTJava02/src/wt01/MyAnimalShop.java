package wt01;

import wt01.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop {
    double accountBalance;//余额
    boolean isWorking;//true为正在营业 false为歇业
    ArrayList<Animal> animalList;
    ArrayList<Customer> customerList;

    public MyAnimalShop() {
    }

    public MyAnimalShop(double accountBalance, boolean isWorking) {
        this.accountBalance = accountBalance;
        this.isWorking = isWorking;
        animalList=new ArrayList<Animal>();
        customerList=new ArrayList<Customer>();
    }

    public MyAnimalShop(double accountBalance, boolean isWorking, ArrayList<Animal> animalList, ArrayList<Customer> customerList) {
        this.accountBalance = accountBalance;
        this.isWorking = isWorking;
        this.animalList = animalList;
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        return "wt01.MyAnimalShop{" +
                "accountBalance=" + accountBalance +
                ", isWorking=" + isWorking +
                ", animalList=" + animalList +
                ", customerList=" + customerList +
                '}';
    }

    public boolean buy(Animal newcomer) throws AnimalNotFountException {
        if (accountBalance >= newcomer.price) {
            animalList.add(newcomer);
            accountBalance -= newcomer.price;
            return true;
        } else {
            throw new InsufficientBalanceException("余额不足，好穷啊");
        }
    }

    public boolean treat(Customer newCustomer, int want) {//设动物的购入价格为卖出价格的一半
        if (!customerList.contains(newCustomer)) {
            customerList.add(newCustomer);
        }
        newCustomer.arrivalTime++;
        newCustomer.LatestArrivalTime = LocalDate.now();

        if (!animalList.isEmpty()) {
            if (want < animalList.size()) {
                newCustomer.lastConsumption=2*animalList.get(want).price;
                accountBalance += 2*animalList.get(want).price;
                System.out.println(animalList.get(want).toString());
                animalList.remove(want);
            } else {
                System.out.println("我的宠物店里没有这只宠物");
            }
            return true;
        } else {
            throw new AnimalNotFountException("宠物店没宠物，=_=");
        }
    }

    public void close() {
        isWorking = false;
        double sum = 0;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).LatestArrivalTime.equals(LocalDate.now())) {
                sum += customerList.get(i).lastConsumption;
                System.out.println(customerList.get(i).toString());
            }
        }
        sum/=2;
        System.out.println("今天一天的利润是："+sum+"yuan");
    }
}
