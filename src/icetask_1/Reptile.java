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
public class Reptile extends Animal{
     private double bloodTemp;

    public  Reptile() {
        super();
        input();
        
    }
    
     @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        bloodTemp = scanner.nextDouble();
    }

    /**
     *
     */
    @Override
    public void output() {
        super.output();
        System.out.println("Blood Temperature: " + bloodTemp);
    }
}
    

