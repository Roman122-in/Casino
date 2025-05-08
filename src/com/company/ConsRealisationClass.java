package com.company;

import java.util.Scanner;

public class ConsRealisationClass implements ConsRealisation {

    private int balance;
    @Override
    public void GreetingMethod(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Input from 100 to 1000");
        int inputed = scanner.nextInt();



        if(inputed<100||inputed> 1000000){
            throw new IllegalArgumentException("Try again");
        }


       this.balance = inputed;

    }


    @Override
    public int SaveBalance(){
        return balance;
    }

    public void NewBalanceUpdated(int newBalance){
        this.balance = newBalance;
    }
}
