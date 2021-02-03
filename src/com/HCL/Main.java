package com.HCL;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> Emails = new ArrayList<String>();
        fillEmailList(Emails);

        Scanner sc = new Scanner(System.in);

        boolean more = true;
        while (more){
            System.out.println("Chose Search Option:");
            System.out.println("1) Search by Email");
            System.out.println("2) Search by User Name");
            System.out.println("3) EXIT");
            String input = sc.nextLine();

            if (input.equals("1")){
                System.out.println("--------------------------------------------------------");
                System.out.println("Enter User's Email:");
                String email = sc.nextLine();
                boolean matchfound = false;

                for (int i = 0; i < Emails.size(); i++){
                    if (email.toLowerCase().equals(Emails.get(i).toLowerCase())){
                        matchfound = true;
                        System.out.println("Email Address [" + email + "] exists in records\n");
                        break;
                    }
                }
                if (matchfound == false){
                    System.out.println("Email Address [" + email + "] not found in records\n");
                }
                System.out.println("-------------------------------------------------------");
            }

            else if (input.equals("2")){
                System.out.println("-------------------------------------------------------");
                System.out.println("Enter User's Full Name:");
                String fullName = sc.nextLine();

                String[] Names = fullName.split(" ");
                ArrayList<String> Matches = new ArrayList<String>();
                int numOfMatches = 0;

                for (int i = 0; i < Names.length; i++){
                    for (int j = 0; j < Emails.size(); j++){
                        if (Emails.get(j).toLowerCase().contains(Names[i].toLowerCase())){
                            Matches.add(Emails.get(j));
                            numOfMatches++;
                        }
                    }
                    System.out.println("Number of matches for \"" + Names[i] + "\": " + numOfMatches);
                    for (int j = 0; j < Matches.size(); j++){
                        System.out.println(Matches.get(j));
                    }
                    numOfMatches = 0;
                    Matches.clear();
                    System.out.println("");
                }
                System.out.println("--------------------------------------------------------");
            }

            else if (input.equals("3")){
                System.out.println("Good bye");
                break;
            }

            else {
                System.out.println("Invalid Selection\n");
            }
        }


    }

    public static void fillEmailList(ArrayList<String> Emails){
        Emails.add("PJacobs34@gmail.com");
        Emails.add("Carmin914@yahoo.com");
        Emails.add("RobinsonT001@.wcsu.edu");
        Emails.add("JakeTapper725@icloud.com");
        Emails.add("Rose.Dawn@USD.gov");
        Emails.add("Tyler.Smith@protonmail.com");
        Emails.add("cbarrett@j-galt.com");
        Emails.add("JCostello23@aol.com");
        Emails.add("Victor.Putin@outlook.com");
        Emails.add("BrettWaltz52@gmail");
        Emails.add("jmott@hudsonsoft.com");
        Emails.add("Beth-Parker@tutamail.com");
        Emails.add("Kristina.Verde@bankerslife.com");
        Emails.add("HeatherWinthram83@hotmail.com");
        Emails.add("kblanco@stmicro.net");
        Emails.add("jeffrey.paulino@SynergyIT.com ");
        Emails.add("SmithD001@zohomail.com");
        Emails.add("Soibhan.Taylor@outlook.com");
        Emails.add("j.cooper@huxley.com");
        Emails.add("NemaParvini39@yandex.com");
    }
}
