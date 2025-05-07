package com.company;

        import java.util.ArrayList;

interface GenerateRandom {

    default int GenerateRandomMethod() {
        return 0;
    }

    default ArrayList Generation(){
        return null;
    }

    default ArrayList<ArrayList<Integer>> CreateFinalArrayList(){
        return null;
    }
}
