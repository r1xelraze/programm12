package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean checkIP(String IpAdress)
    {
        String regular  = "(\\d{1,2}|([01])\\" + "d{2}|2[0-4]+\\d|25[0-5])" + "\\."
                + "(\\d{1,2}|([01])\\" + "d{2}|2[0-4]+\\d|25[0-5])" + "\\."
                + "(\\d{1,2}|([01])\\" + "d{2}|2[0-4]+\\d|25[0-5])" + "\\."
                + "(\\d{1,2}|([01])\\" + "d{2}|2[0-4]+\\d|25[0-5])";

        Pattern pattern = Pattern.compile(regular );
        Matcher match= pattern.matcher(IpAdress);
        return match.matches();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String IpAdress = scanner.nextLine();
        File file = new File(("TestFile"));
        PrintWriter pw = new PrintWriter(file);
        if (!checkIP(IpAdress)){
            System.out.println("IPadress: "+checkIP(IpAdress));
        }
        else {
            pw.println(IpAdress);
            pw.close();
            System.out.println("IPadress: "+checkIP(IpAdress));
        }


    }

}
