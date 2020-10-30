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
public class Manager {

    public static void menu() {
        System.out.println("");
        System.out.println("1.Create Fruit");
        System.out.println("2.View orders");
        System.out.println("3.Shopping (for buyer)");
        System.out.println("4.Exit");
//        int chice = Validate.getInputLimit(1, 4);
    }

    public static void createFruit(ArrayList<Fruit> af) {
        while (true) {
            System.out.print("enter fruitID: ");
            String fruitID = Validate.getInputString();
            if (!Validate.checkIDExist(af, fruitID)) {
                System.err.println("this ID existed");
                return;
            }
            System.out.print("enter fruitName: ");
            String fruitName = Validate.getInputString();

            System.out.print("enter price: ");
            double price = Validate.getInputDouble();

            System.out.print("enter quantity: ");
            int quantity = Validate.getInputInt();

            System.out.print("enter origin: ");
            String origin = Validate.getInputString();

            af.add(new Fruit(fruitID, fruitName, price, quantity, origin));
//            System.out.println(" \tFruit \tname \tOrigin \tPrice");
//            for (Fruit fruit : af) {
//            System.out.println("\t" + fruit.getFruitID()+ "\t" + fruit.getFruitName()
//                    + "\t" + fruit.getOrigin() + "\t" + fruit.getPrice());
//        }
            if (!Validate.checkuserChoose()) {
                return;
            }
        }
    }

    public static Fruit getFruitByItem(ArrayList<Fruit> af, int item) {
        int countItem = 1;
        for (Fruit fruit : af) {
            if (fruit.getQuantity() != 0) {
                countItem++;
            }
            if (countItem - 1 == item) {
                return fruit;
            }
        }
        return null;
    }

    public static void displayListOrder(ArrayList<Order> ao) {
        double total = 0;
        System.out.println("\tProduct" + "\tQuantity" + "\tPrice" + "\tAmount");
        for (Order order : ao) {
            System.out.println("\t" + order.getFruitName() + "\t" + order.getQuantity()
                    + "\t" + order.getPrice() + "\t" + order.getPrice() * order.getQuantity());
            total += order.getPrice() * order.getQuantity();
        }
        System.out.println("Total: " + total);
    }

    public static void displayListFruit(ArrayList<Fruit> af) {
        System.out.println("\tItem \tFruit name \tOrigin \tPrice");
        int count = 1;
        for (Fruit fruit : af) {
            if(fruit.getQuantity() != 0){//check shop have item or not 
            System.out.println("\t" + (count++) + "\t" + fruit.getFruitName()
                    + "\t" + fruit.getOrigin() + "\t" + fruit.getPrice());
        }
        }
    }

    public static void updateOrder(ArrayList<Order> ao, String id, int quantity) {
        for (Order order : ao) {
            if (order.getFruitID().equalsIgnoreCase(id)) {
                order.setQuantity(order.getQuantity() + quantity);
            }
            return;
        }
    }

    public static void viewOrder(Hashtable<String, ArrayList<Order>> ht) {
        for (String s : ht.keySet()) {
            System.out.println("customer: " + s);
            ArrayList<Order> ao = ht.get(s);
            displayListOrder(ao);
        }
    }

    public static void shopping(ArrayList<Fruit> af, Hashtable<String, ArrayList<Order>> ht) {
        if (af.isEmpty()) { //check list empty user can't buy
            System.out.println("no have item");
            return;
        }
        ArrayList<Order> ao = new ArrayList<>();
        while (true) {
            displayListFruit(af);
            System.out.print("enter item: ");
            int item = Validate.getInputLimit(1, af.size());
            Fruit fruit = getFruitByItem(af, item);
            int quantity = Validate.getInputLimit(1, fruit.getQuantity());
            fruit.setQuantity(fruit.getQuantity() - quantity);
            if (!Validate.checkItemExist(ao, fruit.getFruitID())) {
                updateOrder(ao, fruit.getFruitID(), quantity);
            } else {
                ao.add(new Order(fruit.getFruitID(), fruit.getFruitName(), quantity,
                        fruit.getPrice()));
            }
            if (!Validate.checkuserChoose()) {
                break;
            }
        }

        displayListOrder(ao);
        System.out.print("enter name: ");
        String name = Validate.getInputString();
        ht.put(name, ao);
        System.out.println("add successfull");
    }

}
