/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j65;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class GetInput {
    static Scanner sc = new Scanner(System.in);
    
    public static String getInputString(){
        while(true){
            String in = sc.nextLine().trim();
            if(in.isEmpty()){
                System.out.println("can't empty!!!");
            }else {
                return in;
            }
        }
    }
    
    public static double getMark(String massage){
        while(true){
            try{
                System.out.println(massage);
                double in = Double.parseDouble(sc.nextLine());
                if(in>10){
                    System.out.println(massage+" less than equal ten");
                }else if(in<0){
                    System.out.println(massage+" greater than equal 0");
                }else{
                    return in;
                }
            }catch(Exception e ){
                System.out.println(massage+" is digit");
            }
        }
    }
    
    public static char Type(double d){
        char t = 0;
        if(d>7.5){
//            System.out.println("Type: A");
             t = 'A';
        }else if(d>=6&&d<=7.5){
//            System.out.println("Type: B");
            t = 'B';
        }else if(d>=4&&d<6){
//            System.out.println("Type: C");
            t = 'C';
        }else if(d<4){
//            System.out.println("Type: D");
            t = 'D';
        }
        return t;
    }
    
    public static  boolean checkUserChoose(){
       while(true){
        String s = sc.nextLine();
        char c = s.charAt(0);
        if(s.length()==1){    
        if(c == 'y'||c=='Y'){
            return true;
        }else if(c =='n'||c=='N'){
            return false;
        }       
        }
           System.out.print("re-input: ");
    }
    }
    
    public static void main(String[] args) {
//        checkUserChoose();
//           System.out.println(""+Type(7)); 
    }
}
