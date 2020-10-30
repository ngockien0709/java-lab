/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j23;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Validate {

    static Scanner sc = new Scanner(System.in);

    public static int getInputLimit(int min, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine().trim());
                if(input>max||input<min){
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.print("re-input: ");
            }
        }
    }
    
    public static String getInputString(){
        while (true) {            
            try {
                String s= sc.nextLine().trim();
                if(s.isEmpty()){
                    throw new NullPointerException();
                }
                return s;
            } catch (NullPointerException e) {
                System.out.println("can't empty");
                System.out.print("re-input: ");
            }
        }
    }
    
    public static double getInputDouble(){
        while (true) {            
            try {
                double d = Double.parseDouble(sc.nextLine().trim());
                if(d<0){
                    throw new NumberFormatException();
                }
                return d;
            } catch (NumberFormatException e) {
                System.out.println("must be input double and greater than 0");
                System.out.print("re-input: ");
            }
        }
    }
    
    public static int getInputInt(){
        while (true) {            
            try {
                int input = Integer.parseInt(sc.nextLine().trim());
                if(input<0){
                    throw new NullPointerException();
                }
                return input;
            } catch (Exception e) {
                System.out.println("must be input integer and greater than 0");
            }
        }
    }
    
    public static boolean checkuserChoose(){
        while (true) {            
            try {
                System.out.print("do you want continue: ");
                String s = sc.nextLine().trim();
                if(s.equalsIgnoreCase("y")){
                    return true;
                }else if(s.equalsIgnoreCase("n")){
                    return false;
                }
            } catch (Exception e) {
                System.out.print("please input y or n: ");
            }
        }
    }
    
    public static boolean checkIDExist(ArrayList<Fruit> af,String id){
        for (Fruit fruit : af) {
//            if(fruit.getFruitID().equalsIgnoreCase(id)){
//                System.err.println("this ID existed");
              if(id.equalsIgnoreCase(fruit.getFruitID()))  {
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkItemExist(ArrayList<Order> ao,String item){
        for (Order order : ao) {
            if(order.getFruitID().equalsIgnoreCase(item)){
                System.err.println(" this item existed");
                return false;
            }
        }
        return true;
    }
    
}
