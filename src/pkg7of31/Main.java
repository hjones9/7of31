/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7of31;

import java.util.Scanner;

/**
 *
 * @author Hailey.Jones
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a whole number");
        int q = reader.nextInt();
        
        for (int r = 1; r <= q; r++) {
            System.out.println(Math.random());
        }

    }

}
