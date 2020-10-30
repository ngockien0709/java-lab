/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J22_Candidate;

import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Candidate> ac = new ArrayList<>();

         ac.add(new Experience(99, "code", "1", "Pham Ngoc", "Hoa", 1991,
                "Ninh Binh", "0968038714", "hoapnse05740", 0));
        ac.add(new Fresher("2000", "good", "2", "Đo Quang", "Hiep",
                1995, "Ha Noi", "0984481349", "thaycacac@gmail.com", 1));
        ac.add(new Internship("PRJ311", "Spring", "FPT University",
                "2", "Nguyen Xuan", "Cuong", 2018, "Ha Noi", "0986246813",
                "thaycacacoficial@gmail.com", 2));
        while (true) {
            int choice = GetInput.menu();
            switch (choice) {
                case 1:
                    GetInput.getInputCandidate(ac, 0);
                    break;
                case 2:
                    GetInput.getInputCandidate(ac, 1);
                    break;
                case 3:
                    GetInput.getInputCandidate(ac, 2);
                    break;
                case 4:
                    GetInput.searchCandidate(ac);
                    break;
                case 5:
                    return;    
            }
        }
    }
}
