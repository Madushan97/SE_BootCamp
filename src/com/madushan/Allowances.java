package com.madushan;

public class Allowances extends Employee implements Runnable{

    private float allowance;

    Main_Thread base_salary = new Main_Thread();

    @Override
    public void run() {

       allowance = (base_salary.BasicSalary() * 5)/100;
        System.out.println("Allowance is : " + allowance);
    }
}
