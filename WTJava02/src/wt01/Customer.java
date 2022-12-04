package wt01;

import java.time.LocalDate;

public class Customer {
    String name;
    int arrivalTime;
    LocalDate LatestArrivalTime;
    double lastConsumption;
    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
        this.arrivalTime=0;
        this.lastConsumption=0;
        this.LatestArrivalTime=LocalDate.now();
    }

    public Customer(String name, int arrivalTime, LocalDate latestArrivalTime, double lastConsumption) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        LatestArrivalTime = latestArrivalTime;
        this.lastConsumption = lastConsumption;
    }

    @Override
    public String toString() {
        return "wt01.Customer{" + "name='" + name + '\'' + ", arrivalTime=" + arrivalTime + ", LatestArrivalTime=" + LatestArrivalTime + '}';
    }
}