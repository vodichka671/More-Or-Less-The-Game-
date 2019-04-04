package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
   private Model model ;
   private View view;

    Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }



    public static void setBouds(Model model,int newMin, int newMax){
        model.setMax(newMax);
        model.setMin(newMin);

    }

    public boolean check(Model model, int myGuess){

        if(myGuess==model.getMyRandomInteger()){
            view.messagePrinter(StringConstats.WIN);
            model.statistics.add(StringConstats.WIN);
            model.getStats();
            return true;
        }
        if (myGuess<model.getMyRandomInteger() && myGuess>model.getMin()){

            view.messagePrinter(StringConstats.GREATER_MSG);

            model.setMin(myGuess);
            view.messagePrinter("MIN NOW : " + model.getMin() + " MAX NOW : " + model.getMax());
            model.statistics.add("MIN NOW : " + model.getMin() + " MAX NOW : " + model.getMax());
            return false;
        }
        if (myGuess>model.getMyRandomInteger() && myGuess<model.getMax()){
            view.messagePrinter(StringConstats.LESS_MSG);

            model.setMax(myGuess);
            view.messagePrinter("MIN NOW : " + model.getMin() + " MAX NOW : " + model.getMax());
            model.statistics.add("MIN NOW : " + model.getMin() + " MAX NOW : " + model.getMax());
            return false;
        }

       view.messagePrinter(StringConstats.OUT_OF_BOUNDS);
        model.statistics.add(StringConstats.OUT_OF_BOUNDS);
        return false;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        Model model = this.getModel();
        View view = this.getView();
        int myGuess = inputInteger(sc);
       while (!check(model,myGuess)){
           myGuess = inputInteger(sc);
       };

    }

    public int inputInteger(Scanner sc){

 while (!sc.hasNextInt()){
     view.messagePrinter(StringConstats.WRONG_INPUT);
     sc.next();
 }
     return sc.nextInt();
    }





    public Model getModel() {
        return model;
    }

    public View getView() {
        return view;
    }

}
