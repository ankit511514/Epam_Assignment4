package House;

import java.util.Scanner;

public class Main_Class {
    static {
        int type;
        double area;
        Scanner scan=new Scanner(System.in);
        System.out.format("%s","Enter value For Construction type : \n");
        System.out.format("%s","Press 1 - Standard Type\n");
        System.out.format("%s","Press 2 - Above Standard Type\n");
        System.out.format("%s","Press 3 - High Standard Type\n");
        System.out.format("%s","Press 4 - High Standard Type + Automation \n");
        type=scan.nextInt();
        System.out.format("%s","Enter House Area \n");
        area=scan.nextDouble();
        scan.close();
        Cost_Of_House cost_of_house=new Cost_Of_House(type,area);
        cost_of_house.CalCost();
    }
    public static  void main(String args[])
    {
        //Do not use main method as per the questions
    }
}
