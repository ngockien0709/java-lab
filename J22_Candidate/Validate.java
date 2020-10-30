
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J22_Candidate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Validate {

    public Validate() {
    }

    static Scanner input = new Scanner(System.in);
    // \\d{10} user must be input 10 number
    // \\d* user can input more number or not
    static String Phone = "^\\d{10}\\d*$";

    static String mail = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";

    public static int getInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(input.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("re-input: ");
            }

        }
    }

    public static String checkPhone() {
        while (true) {            
          String  s = input.nextLine();
            if(s.matches(Phone)){
                return s;
            }else{
                System.out.println("phone with minimum 10 digit!!!");        
            }
        }
    }

    public static String checkMail() {
        while (true) {            
          String  s = input.nextLine();
          if(s.matches(mail)){
              return s;
          }else{
              System.out.println("re-input mail!!!");
          }
        }
    }
    
    public static String getInputString(){
        while (true) {            
            String s= input.nextLine().trim();
            if(s.isEmpty()){
                System.out.println("not empty");
                System.out.print("re-input: ");
            }else{
                return s;
            }
        }
    }

    public static int checkInputOfEXP(int birthDate) {
        int currrentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currrentYear-birthDate;
        while (true) {            
            int exp = getInputLimit(1, 100);
            if(exp>age){
                System.out.println("Experience must be smaller than age!!!");
            }else{
               return exp;
            }
        }
    }

   

    public String returnRankOfGraduation() {
        while (true) {            
            String s = input.nextLine();
            if(s.equalsIgnoreCase("Excellent")||s.equalsIgnoreCase("Good")
               ||s.equalsIgnoreCase("Fair")
               || s.equalsIgnoreCase("Poor")){
                return s;
            }else{
                System.out.println("please input only Excellent,Good,Fair,Poor");
            }
        }
    }

    public static boolean checkExistedCandidateID(ArrayList<Candidate> t, String candidateID) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getCandidateID().equalsIgnoreCase(candidateID)) {
                System.out.println("this ID existed!!!");
                return false;
            }
        }
        return true ;
    }

    public static boolean checkUserChoose(){
        while (true) {            
            String s = getInputString();
            if(s.equalsIgnoreCase("y")){
                return true;
            }else if(s.equalsIgnoreCase("n")){
                return false;
            }
        }
    }
}
