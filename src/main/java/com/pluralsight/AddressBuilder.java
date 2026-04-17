package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // the beginning

        System.out.println("Full name: ");
        String fullName = input.nextLine();
        sb.append(fullName).append(" ");

        // the address
        System.out.print("Billing Street: ");
        String billingStreet = input.nextLine();

        System.out.print("Billing City: ");
        String billingCity = input.nextLine();

        System.out.print("Billing State: ");
        String billingState = input.nextLine();

        System.out.print("Billing Zipcode: ");
        String billingZip = input.nextLine();

        sb.append("Billing Address: ");
        sb.append(billingStreet).append(" ");

        sb.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");

        // the shipping
        System.out.print("Shipping Street: ");
        String shippingStreet = input.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = input.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = input.nextLine();

        System.out.print("Shipping Zipcode: ");
        String shippingZip = input.nextLine();

        sb.append("Shipping Address: ");
        sb.append(shippingStreet).append(" ");
        sb.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip).append("\n");

        System.out.println("Display the customer information.");
        System.out.println(sb.toString());




    }
}
