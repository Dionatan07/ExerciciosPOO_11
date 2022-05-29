package application;

import entities.Ticket;
import entities.VipTicket;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.print("Enter the ticket price: ");
        double price = key.nextDouble();
        System.out.print("Enter the additional percentage VIP ticket price: ");
        double vipTicket = key.nextDouble();

        VipTicket vip = new VipTicket(price, vipTicket);


        System.out.println();
        System.out.println("1) Price Ticket");
        System.out.println("2) Price VIP Ticket");
        System.out.println("3) Exit");
        System.out.print("Enter the option: ");
        int response = key.nextInt();

        while (response != 3) {
            if (response == 1) {
                System.out.println();
                System.out.printf("The value of ticket is $%.2f", vip.getPrice());
                System.out.println();
            } else if (response == 2) {
                System.out.println();
                System.out.printf("The value of VIP ticket is $%.2f%n", vip.calcVipTicket());
                System.out.printf("The difference is $%.2f", vip.calcDifference());
                System.out.println();
            }
            System.out.println();
            System.out.println("1) Price Ticket");
            System.out.println("2) Price VIP Ticket");
            System.out.println("3) Exit");
            System.out.print("Enter the option: ");
            response = key.nextInt();

        }


    }
}
