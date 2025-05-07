package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class GenerateRandomRealisation implements GenerateRandom {

    private ArrayList<ArrayList<Integer>> finalList;

    @Override
    public int GenerateRandomMethod() {
        SecureRandom random = new SecureRandom();
        int result = random.nextInt(10);
        return result;
    }


    @Override
    public ArrayList Generation() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(GenerateRandomMethod());
        }
        return arrayList;
    }

    @Override
    public ArrayList<ArrayList<Integer>> CreateFinalArrayList() {
        ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {

            finalList.add(Generation());
        }
        return finalList;
    }


    public ArrayList<ArrayList<Integer>> getArrayListMethod() {

        return finalList;
    }
}
