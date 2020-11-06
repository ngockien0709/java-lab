
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class Counter {
    Map<Character,Integer> charCounter = new HashMap<>();
    Map<String, Integer> wordCounter = new HashMap<>();
    
    public void analyze(String content){
        
        for (char c : content.toCharArray()) {
            if(Character.isSpace(c)){
                continue;
            }
            if(!charCounter.containsKey(c)){
                charCounter.put(c, 1);
            }else{
                charCounter.put(c, charCounter.get(c)+1);
            }
        }
       
        StringTokenizer tok = new StringTokenizer(content);
        
        while (tok.hasMoreTokens()) {   
            String token = tok.nextToken();
            if(!wordCounter.containsKey(token)){
                wordCounter.put(token, 1);
            }else{
                wordCounter.put(token, charCounter.get(token)+1);
            }
        }
    }
    
    public void display(){
        System.out.println(charCounter);
        System.out.println(wordCounter);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();
        Counter c = new Counter();
        c.analyze(content);
        c.display();
        
}
}