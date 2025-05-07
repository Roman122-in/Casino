package com.company;

import java.util.ArrayList;

public class WinAlgoritmRealisationClass {

    public static boolean methodTrue(ArrayList<ArrayList<Integer>> arrayLists) {

        for (int i = 0; i < arrayLists.size(); i++) {
            for (int j = 0; j < arrayLists.get(i).size() - 1; j++) {
                if (arrayLists.get(i).get(j).equals(arrayLists.get(i).get(j + 1))) {
                    return true;
                }
            }
        }

        for (int i = 0; i < arrayLists.get(0).size(); i++) {
            for (int j = 0; j < arrayLists.size() - 1; j++) {
                if (arrayLists.get(j).get(i).equals(arrayLists.get(j + 1).get(i))) {
                    return true;
                }
            }
        }
        return false;
    }








}
