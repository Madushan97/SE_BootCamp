package com.madushan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Per day payment : ");
        int per_day_payment = Integer.parseInt(scanner.nextLine());
        employee.setPer_day_payment(per_day_payment);

        System.out.print("Per day payment : ");
        int no_of_days = Integer.parseInt(scanner.nextLine());
        employee.setNo_of_days(no_of_days);

        Main_Thread main_thread = new Main_Thread();
        Thread main = new Thread(main_thread);
        main.start();



    }
}
