package com.company;

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
            return true;
        }
        if (myGuess<model.getMyRandomInteger()){
            view.messagePrinter(StringConstats.GREATER_MSG);
        }
        return false;
    }
    public Model getModel() {
        return model;
    }

    public View getView() {
        return view;
    }

}
