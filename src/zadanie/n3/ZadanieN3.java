/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie.n3;

import java.util.Scanner;

/**
 *
 * @author user2
 */
public class ZadanieN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Введите вашу фамилию: ");
        String fam = scanner.next();
        System.out.println("Введите год вашего рождения: ");
        String year = scanner.next();
        System.out.println("Введите день вашего рождения: ");
        int day = scanner.nextByte();
        System.out.println("Введите месяц вашего рождения: ");
        String month = scanner.next();
        System.out.println(name+" "+fam+" родился "+year+" "+day+" "+month+"");

        
        
        
        
        // TODO code application logic here
    }
    
}
