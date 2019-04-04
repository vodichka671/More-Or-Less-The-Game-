package com.company;

import java.util.Random;

public class Model {
    Random rnd = new Random();
    private int myRandomInteger;
    private int min;
    private  int max;

    Model(int min, int max){
        this.min = min;
        this.max = max;
        this.myRandomInteger = randomInteger(min,max);
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
