package com.company;

import java.util.ArrayList;

public class OutputRealisation implements OutPutLogic {

    public void print(ArrayList<ArrayList<Integer>> list) {

        for (ArrayList<Integer> innerList : list) {
            for (Integer number : innerList) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }


}
