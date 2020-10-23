/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.L.P0022;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MEN'TRAINING
 */
public class ManageCandidate {

    ArrayList<Candidate> listSumary;
    HandleCandidate m;

    public ManageCandidate() {
        m = new HandleCandidate();
        listSumary = new ArrayList<>();
        //add Candidate for 3 ArrayList
        listSumary.add(new Experience(1, "Java, C#", "1", "Aelbrecht", "Stefan", "1996", "Stanford", "09128392123", "stefanhihi@gmail.com", 0));
        listSumary.add(new Experience(1, "Python, C++", "2", "Aguirre", "Eva", "1995", "Ha Noi", "09593928389", "evaloveadam@gmail.com", 0));
        listSumary.add(new Experience(2, "Something, C++", "3", "Ahlgren", "Maria", "1996", "HCM", "09593923389", "Marialoveadam@gmail.com", 0));
        listSumary.add(new Experience(1, "Perl, Html5", "4", "Antošová", "Adeleva", "1995", "New York", "09563928389", "Adeleloveadam@gmail.com", 0));
        listSumary.add(new Fresher("2017", "Good", "FPT", "5", "Barbosa", "De Souza", "1998", "Phong", "091283392029", "afdam@gmail.com", 1));
        listSumary.add(new Fresher("2016", "Good", "FPT", "6", "Cabrera", "Cornide", "1995", "Hai ", "09128393029", "ada@gmail.com", 1));
        listSumary.add(new Fresher("2018", "Good", "FPT", "7", "Calderon", "Cuevas", "1995", "LosAngless", "012839392029", "dam@gmail.com", 1));
        listSumary.add(new Fresher("2017", "Good", "FPT", "8", "Casulari", "Motta", "1998", "Hai Luu", "091289392029", "adm@gmail.com", 1));
        listSumary.add(new Internship("C++", 6, "GreenWich", "9", "Maria", "Madeleine", "1995", "Phung", "09128239202", "namthe@jdka", 2));
        listSumary.add(new Internship("netbean", 7, "GreenWich", "10", "Csokán", "Babett", "1995", "Phuong", "02912839202", "nmdthe@jdka", 2));
        listSumary.add(new Internship("C", 6, "GreenWich", "11", "Joana", "Filipa", "1995", "Ha", "09128339202", "namdte@jdka", 2));
        listSumary.add(new Internship("CSharp", 2, "FPt", "12", "Patricia", "Carine", "1995", "Tai", "09128392052", "namdte@jdka", 2));

    }

    public void manage() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM\n"
                    + "1. Experience\n"
                    + "2. Fresher\n"
                    + "3. Internship\n"
                    + "4. Searching\n"
                    + "6. Display\n"
//                    + "7. Delete\n"
//                    + "8. Update\n"
                    + "5. Exit");
            System.out.println("Enter your choice: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    Experience e = m.inputExperienceCandidate(listSumary);
                    listSumary.add(e);
                    break;
                case "2":
                    Fresher f = m.inputFresherCandidate(listSumary);
                    listSumary.add(f);
                    break;
                case "3":
                    Internship i = m.inputInternCandidate(listSumary);
                    listSumary.add(i);
                    break;
                case "4":
                    System.out.println("Input Candidate name (First name or Last name): ");
                    String name = input.nextLine();
                    System.out.println("Enter type of input Candidate: ");
                    String type = input.nextLine();
                    while (!type.equals("1") && !type.equals("2") && !type.equals("0")) {
                        System.out.println("Please enter type of Candidate from 0 to 2: ");
                        type = input.nextLine();
                    }
                    System.out.println("The candidate found: ");
                    ArrayList<Candidate> list;
                    //search by type of Candidate
                    if ((list = m.searchCandidateByName(name, listSumary)).isEmpty()) {
                        System.out.println("Candidate not exist! ");
                    }
                    m.displayListCandidateByType(list, Integer.parseInt(type));
                    break;
                case "5":
                    System.exit(0);
                    break;
                case "6":
                    displayAll();
                    break;
//                case "7":
//                    System.out.println("Enter CandidateID need to delete: ");
//                    String ID = input.nextLine();
//                    Candidate c = m.searchByID(listSumary, ID);
//                    if (c == null) {
//                        System.out.println("ID isn't existed! ");
//                    } else {
//                        listSumary.remove(c);
//                    }
//                    break;
//                case "8":
//                    System.out.println("Enter ID's Candidate need to Update: ");
//                    ID = input.nextLine();
//                    c = m.searchByID(listSumary, ID);
//                    if (c == null) {
//                        System.out.println("ID isn't exist! ");
//                    } else {
//                        Candidate tmp = m.inputExperienceCandidate(listSumary);
//                        listSumary.set(m.searchByIDreturnPos(listSumary, ID), tmp);
//                    }
//                    break;
                default:
                    System.out.println("Please enter choice from 1 to 6: ");
            }
        }
    }
//display list all company's Candidate

    private void displayAll() {
        System.out.println("List of Candidate: ");
        System.out.println("===========EXPERIENCE CANDIDATE============\n");
        System.out.println(m.returnProperty(0));
        m.displayListCandidateByType(listSumary, 0);
        System.out.println("===========FRESHER CANDIDATE============\n");
        System.out.println(m.returnProperty(1));
        m.displayListCandidateByType(listSumary, 1);
        System.out.println("===========INTERNSHIP CANDIDATE============\n");
        System.out.println(m.returnProperty(2));
        m.displayListCandidateByType(listSumary, 2);
    }
}
