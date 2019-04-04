package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Model {
    Random rnd = new Random();
    public ArrayList<String> statistics = new ArrayList<>();
    private int myRandomInteger;
    private int min;
    private  int max;

    Model(){
        this.min = 0;
        this.max = 0;
        this.myRandomInteger = 0;
    }


    Model(int min, int max){
        this.min = min;
        this.max = max;
        this.myRandomInteger = randomInteger(min,max);
    }

    public void getStats(){
        for (String i:statistics
             ) {
            System.out.println(i);
        }
    }
    public int randomInteger(int min, int max ) {

        return rnd.nextInt(max-min)+min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMyRandomInteger() {
        return myRandomInteger;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
