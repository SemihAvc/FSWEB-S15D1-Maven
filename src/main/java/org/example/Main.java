package org.example;

import org.example.models.Grocery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grocery grocery = new Grocery();
        int choice;
        do {
            System.out.println("Yapılmasını istediğiniz  oprasyonu seçiniz 0,1,2 ?");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Grilmesini istediğiniz ürünü giriniz...");
                    String itemsToAdd = scanner.nextLine();
                    grocery.addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.println("Sil");
             String itemsToRemove = scanner.nextLine();
             grocery.removeItems(itemsToRemove);
             break;
                default:
                    System.out.println("0 1 2  A1rasında bir değer giriniz...");
            }
            grocery.printedSorted();
        }
        while (choice !=0);


    }
}
