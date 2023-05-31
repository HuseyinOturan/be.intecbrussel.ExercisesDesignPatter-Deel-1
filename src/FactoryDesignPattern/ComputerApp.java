package FactoryDesignPattern;

import java.util.Scanner;

public class ComputerApp {

    public static void main(String[] args) {

        Computer Dell= ComputerFactory.orderComputer("PC","64","2.2","1");
        Computer Server= ComputerFactory.orderComputer("server","128","2.2","4");
        Computer Error= ComputerFactory.orderComputer("mause","0","0","0");

        System.out.println(Error);






        /*

        System.out.println("What will je doen?");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Computer computer= ComputerFactory.orderComputer(input);

        if(computer==null){
            System.out.println("error");
            return;
        }
        System.out.println("Uw computer specificaties zijn :" + "Ram, "+ computer.getRam()+
        ", CPU, "+ computer.getCpu()+" , HDD, "+ computer.getHdd());

         */
    }
}
