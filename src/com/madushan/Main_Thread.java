package com.madushan;

public class Main_Thread extends Employee implements Runnable {

    private int basic_salary;
    private int final_salary;
    private int epf;
    private int allowance;


    Employee employee = new Employee();

//    allowance thread
    Allowances allowances = new Allowances();
    Thread allowanceThread = new Thread(allowances);

//    pdf thread
    EPF_Calculation epf_calculation = new EPF_Calculation();
    Thread epfThread = new Thread(epf_calculation);

    public int BasicSalary() {
        basic_salary = employee.getPer_day_payment() * employee.getNo_of_days();
        return  basic_salary;
    }

    public int FinalSalary() {
        final_salary = allowance + epf +basic_salary;
        return final_salary;
    }

//      basic salary
    @Override
    public void run() {
//        calculate basic salary
//        System.out.println("Basic salary is : " + BasicSalary());

//      wait for other process
        /*try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

//      taking allowance
//        allowanceThread.start();

//      taking epf
//                epf();

//      inal salary

//                FinalSalary();
    }
}
