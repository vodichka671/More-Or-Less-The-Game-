package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Model model = new Model(0,100);
        System.out.println(model.getMyRandomInteger());
        View view = new View();
       // Scanner sc = new Scanner(System.in);

       // System.out.println();
   Controller controller = new Controller(model,view);
   controller.start();

     //   System.out.println(rnd.nextInt(100-5)+5);

    }
}
