/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j51;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author nguye
 */

public class Main {
    public static void displayMenu(){
        System.out.println("==== Calculator Program ====");
        System.out.println("1.Normal Calculator");
        System.out.println("2.BMI Calculator");
        System.out.println("3.Exit");
    }
    
    public static void normalCalc(){
        int a = GetInput.getInputNumber();
        while(true){
            
            String o = GetInput.operator();
            int b = GetInput.getInputNumber();
            if(o.equalsIgnoreCase("=")){
                break;
            }
            if(o.equalsIgnoreCase("+")){
                a+=b;
            }
            if(o.equalsIgnoreCase("-")){
                a-=b;
            }
            if(o.equalsIgnoreCase("*")){
                a*=b;
            }
            if(o.equalsIgnoreCase("/")){
               if(b==0){
                   System.out.println("b must different 0");
               }else{
                 a/=b;  
               }
            }
            if(o.equalsIgnoreCase("^")){
                a=(int)Math.pow(a, b);
            }
            
            System.out.println("Memory = "+a);
        }
        System.out.println("Result: "+a);
    }
    
     public static String statusBMI(double n){
        if(n < 19){
            return "UNDER-STANDARD";
        }
        else if(n >= 19 && n < 25){
            return "STANDARD";
        }
        else if(n >= 25 && n < 30){
            return "OVERWEIGHT";
        }
        else if(n >= 30 && n < 40){
            return "FAT - should lose weight";
        }
        else{
            return "VERY FAT - should lose weight immediately";
        }
    } 
     
     public static void BMI(){
//        NumberFormat nf = new DecimalFormat("#0.000000");
//        NumberFormat nf = new DecimalFormat(".");
        double weight = 0, height = 0, bmi = 0;
        System.out.println("------------ BMI Calculator -----------");
        weight = GetInput.getInputBMI();
        height = GetInput.getInputBMI();
        bmi = weight /(height * height);
        System.out.println("BMI number: " + bmi);
        System.out.println("BMI status: " + statusBMI(bmi));
         
    }
    
    public static void run(){
        while(true){
            displayMenu();
            int choice = GetInput.checkchoice("Please choice one option: ");
            switch(choice){
                case 1: 
                            normalCalc();
                            break;
                case 2:
                            BMI();
                            break;
                case 3: return;
            }
        }
    } 
     
    public static void main(String[] args) {
            Main.run();
    }
    
    
}
