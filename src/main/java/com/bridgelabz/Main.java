package com.bridgelabz;
import java.util.Scanner;

@FunctionalInterface
 interface Registration{
     boolean user();
}
      /*
      *  procedure........
      *  Here im variable as a Integer....
      *  Here im using Lambda Expression.....
      *
      *  @author Amit Panika.....
      */

public class Main {
    public static void main(String[] args) {
        System.out.println(" @author Amit-Panika");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("******----Welcome to User Registraction Program----******");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println(" Enter your First name");
        String fn = scanner.nextLine();
        Registration fname = () -> {
            return fn.matches("^[A-z]{1}[a-z]{3}$");
        };
        System.out.println("|");
        System.out.println("|");
        System.out.println(" your regex is....... " + fname.user());

        System.out.println(" Enter your Last name");
        String ln = scanner.nextLine();
        Registration lname = () -> {
            return ln.matches("^[A-z]{1}[a-z]{3,}$");
        };
        System.out.println("|");
        System.out.println("|");
        System.out.println(" your regex is....... " +lname.user());


        System.out.println(" Enter your phone Number ");
        String Number = scanner.nextLine();
        Registration num = () -> {
            return Number.matches("^([0-9]{2}\s[0-9]{10})$");
        };
        System.out.println("|");
        System.out.println("|");
        System.out.println(" your regex Number is....... " + num.user());


        System.out.println(" Enter your Email Address");
        String Email = scanner.nextLine();
        Registration email = () -> {
            return Email.matches("([a-z][a-z A-Z 0-9]+[@][a-z]+[.]+[a-z]{2,5})$");
        };
        System.out.println("|");
        System.out.println("|");
        System.out.println(" your regex Number is....... " + email.user());


        System.out.println(" Enter your Password ");
        String Password = scanner.nextLine();
        Registration pass= () -> {
            return Password.matches("^[a-z]{8}[0-9]{2,}$");
        };
        System.out.println("|");
        System.out.println("|");
        System.out.println(" your regex Password is....... " + pass.user());

    }
}