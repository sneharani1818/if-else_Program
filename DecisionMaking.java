/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisionmaking;

/**
 *
 * @author Sushil Kumar
 */
import java.util.*;
public class DecisionMaking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int input;
        System.out.println("ENTER YOUR AGE.");
        input=sc.nextInt();
        if(input<=18)
            System.out.println("YOU ARE A MINOR AND NOT ELEIGIBLE TO VOTE");
        else if(input>18&&input<65)
            System.out.println("YOU ARE ELEIGIBLE TO VOTE AND YOU ARE A MAJOR.");
        else
            System.out.println("YOU ARE ELEIGIBLE TO VOTE AND YOU ARE A SENOIR CITIZEN");
    }
    
