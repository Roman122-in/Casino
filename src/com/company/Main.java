
package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        try {

            ConsRealisationClass consRealisationClass = new ConsRealisationClass();
            consRealisationClass.GreetingMethod();

                GenerateRandomRealisation generateRandomRealisation = new GenerateRandomRealisation();
                ArrayList<ArrayList<Integer>> finalList = generateRandomRealisation.CreateFinalArrayList();

                OutputRealisation outputRealisation = new OutputRealisation();
                outputRealisation.print(finalList);

                WinAlgoritmRealisationClass winAlgoritmRealisationClass = new WinAlgoritmRealisationClass();
                boolean result = winAlgoritmRealisationClass.methodTrue(finalList);
                System.out.println(result);

                if (!result) {
                    int newBalance = consRealisationClass.SaveBalance() - 100;
                    consRealisationClass.NewBalanceUpdated(newBalance);
                    System.out.println("Your balance" + newBalance);
                } else {
                    int newBalance = consRealisationClass.SaveBalance() +100;
                    System.out.println("Win: "+newBalance);
                }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}