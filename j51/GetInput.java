/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j51;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class GetInput {
    static Scanner sc = new Scanner(System.in);
    public static int getInputNumber(){
        while(true){
            try{
                int in = Integer.parseInt(sc.nextLine());
                return in;
               
            }catch(NumberFormatException e){
                System.out.println("please input number !!!");
            }catch(NullPointerException n){
                System.out.println("please don't input space!!!");
            }
        }
    }
    
    public static String operator(){
        while(true){
            String in = sc.nextLine();
            if(in.equalsIgnoreCase("+")||in.equalsIgnoreCase("-")||
                    in.equalsIgnoreCase("*")||in.equalsIgnoreCase("/")
                    || in.equalsIgnoreCase("^")||in.equalsIgnoreCase("=")){
                return in;
            }else{
                System.out.println("please input only operator!!!");
            }
        }
    }
    
    
    public static double getInputBMI(){
         double in = 0;
        while(true){
            try{
                in = Double.parseDouble(sc.nextLine());
                if(in <= 0){
                    System.out.println("Please enter positive integer!");
                }
                else{
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("BMI is digit");
            }
            
        }
        return in;
    }
    
    
    public static int checkchoice(String message){
        int a = 0;
        while(true){
            try{
                System.out.print(message);
                a = Integer.parseInt(sc.nextLine());
                if(a  == 1 || a == 2 || a == 3){
                    break;
                } 
                else{
                    System.out.println("Please just enter 1 or 2 or 3");
                }
            }catch(NumberFormatException e){
                System.out.println("Please input number");
            }catch(NullPointerException e){
                System.out.println("Please don't input space!");
            }
        }
        return a;
    }
    
//    public static void main(String[] args) {
//        getInputNumber();
//          operator();
//    }
}
