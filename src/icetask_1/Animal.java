/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask_1;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Animal {
    
     protected int IDtag;
    protected String species;

    public Animal() {
        input();
        
    }
     public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IDtag: ");
        IDtag = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter species: ");
        species = scanner.nextLine();
    }
      public void output() {
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }
}
