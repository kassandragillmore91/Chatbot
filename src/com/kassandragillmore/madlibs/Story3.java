package com.kassandragillmore.madlibs;import java.util.Scanner;public class Story3 {    public static void start () {        Scanner scanner = new Scanner(System.in);        System.out.println("Veggie Tales Theme Song");        System.out.println("Enter a plural noun:");        String pluralNoun1 = scanner.nextLine();        System.out.println("Enter a noun:");        String noun1 = scanner.nextLine();        System.out.println("Enter a verb:");        String verb1 = scanner.nextLine();        System.out.println("Enter another plural noun:");        String pluralNoun2 = scanner.nextLine();        System.out.println("Enter another noun:");        String noun2 = scanner.nextLine();        System.out.println("Enter another noun:");        String noun3 = scanner.nextLine();        System.out.println("Enter a type of food:");        String food = scanner.nextLine();        System.out.println("Enter another plural noun:");        String pluralNoun3 = scanner.nextLine();        System.out.println("Enter an adjective:");        String adjective1 = scanner.nextLine();        System.out.println("Enter another plural noun:");        String pluralNoun4 = scanner.nextLine();        System.out.println("Enter another adjective:");        String adjective2 = scanner.nextLine();        System.out.println("Enter another noun:");        String noun4 = scanner.nextLine();        System.out.println("Enter another adjective:");        String adjective3 = scanner.nextLine();        System.out.println("Enter a type of measurement:");        String measurement1 = scanner.nextLine();        System.out.println("Enter another noun:");        String noun5 = scanner.nextLine();        System.out.println("If you like to talk to " + pluralNoun1 + "\n" +                "If a " + noun1 + " can make you " + verb1 + "\n" +                "If you like to waltz with " + pluralNoun2 + "\n" +                "Up and down the produce " + noun2 + "...\n" +                "Have we got a " + noun3 + " for you!" + "\n" +                "\n" +                food + "Tales, " + food + "Tales, " + food + "Tales, " + food + "Tales!\n" +                food + "Tales, " + food + "Tales, " + food + "Tales, " + food + "Tales!\n" +                "\n" +                "Broccoli! " + pluralNoun3 + "! Gotta be\n" +                food + "Tales!\n" +                "\n" +                adjective1 + " beans! Collard " + pluralNoun4 + "! " + adjective2 + " " + noun4 + "!\n" +                food + "Tales!\n" +                "\n" +                "Cauliflower! " + adjective3 + " and sour! Half a " + measurement1 + "!\n" +                food + "Tales!\n" +                "\n" +                "There's never-ever-ever-ever-ever been a " + noun3 + " like " + food + "Tales!\n" +                "There's never-ever-ever-ever-ever been a " + noun3 + " like " + food + "Tales!\n" +                "It's " + noun5 + " for " + food + "Ta-a-a-a-a-a-ales!");    }}