/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j23;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author nguye
 */
public class Main {

    public static void main(String[] args) {
        
            ArrayList<Fruit> af = new ArrayList<>();
            Hashtable<String, ArrayList<Order>> ht = new Hashtable<>();
           while (true) {
            Manager.menu();
            System.out.print("enter your choice: ");
            int choice = Validate.getInputLimit(1, 4);
            switch (choice) {
                case 1:
                    Manager.createFruit(af);
                    break;
                case 2:
                    Manager.viewOrder(ht);
                    break;
                case 3:
                    Manager.shopping(af, ht);
                    break;
                case 4:
                    break;
            }
            if (choice == 4) {
                break;
            }
        }
    }
}
