/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication36;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;  
/**
 *
 * @author sffio
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String studentEmail = scan.nextLine();
        
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);
        boolean match = matcher.matches();
        if (match) {
            System.out.println("Valid student email address");
        } else {
            System.out.println("Invalid student email address");
        }
        System.out.print("Enter phone number: ");
        studentEmail = scan.nextLine();

        pattern = Pattern.compile("09+[0-9]{9}");
        matcher = pattern.matcher(studentEmail);
        match= matcher.matches();
        if (match) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
        }
    }
}
    
    

