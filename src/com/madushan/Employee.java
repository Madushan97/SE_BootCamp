package com.madushan;

import java.util.Scanner;

public class Employee {

    private int per_day_payment;
    private int no_of_days;

    public Employee() {

    }

    public void setPer_day_payment(int per_day_payment) {
        this.per_day_payment = per_day_payment;
    }

    public void setNo_of_days(int no_of_days) {
        this.no_of_days = no_of_days;
    }

    public int getPer_day_payment() {
        return per_day_payment;
    }

    public int getNo_of_days() {
        return no_of_days;
    }
}