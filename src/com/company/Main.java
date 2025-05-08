
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConsRealisationClass consRealisationClass = new ConsRealisationClass();
        consRealisationClass.GreetingMethod();

        try {
            GenerateRandomRealisation generateRandomRealisation = new GenerateRandomRealisation();
            ArrayList<ArrayList<Integer>> finalList = generateRandomRealisation.CreateFinalArrayList();

            OutputRealisation outputRealisation = new OutputRealisation();
            outputRealisation.print(finalList);

            WinAlgoritmRealisationClass winAlgoritmRealisationClass = new WinAlgoritmRealisationClass();
            boolean result = winAlgoritmRealisationClass.methodTrue(finalList);
            System.out.println(result);

            if (!result) {
                int newBalance = consRealisationClass.SaveBalance() - consRealisationClass.SaveBalance();
                consRealisationClass.NewBalanceUpdated(newBalance);
                System.out.println("Your balance " + newBalance);
            } else {
                int newBalance = consRealisationClass.SaveBalance() * 2;
                System.out.println("Win: " + newBalance);
            }


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}

