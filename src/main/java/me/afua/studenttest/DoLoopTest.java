package me.afua.studenttest;

import java.util.Scanner;

public class DoLoopTest {

    public static void main(String[] args) {
        boolean condition = false;
        Scanner scan = new Scanner(System.in);
        String colour;

        do{

            System.out.println("Enter your favourite colour");
            colour = scan.nextLine();
            /*if(!colour.equalsIgnoreCase("blue"))
            {
                condition=true;
            }
            else {
                condition = false;
            }*/

        }while(!colour.equalsIgnoreCase("blue"));

        System.out.println("Yup! Blue is my favourite colour too. ");
    }
}
