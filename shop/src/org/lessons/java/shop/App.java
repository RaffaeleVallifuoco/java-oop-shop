package org.lessons.java.shop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scan = new Scanner(System.in);

        System.out.println(" Inserisci il nome del prodotto");
        String productName = scan.nextLine();

        System.out.println(" Inserisci ka descrizione del prodotto");
        String productDescription = scan.nextLine();

        System.out.println(" Inserisci il prezzo del prodotto");
        double productprice = scan.nextDouble();

        Prodotto product = new Prodotto(productName, productDescription, productprice);

        System.out.println("Nome e codice prodotto : " + product.extendedName());
        System.out.println("Prezzo discount ; " + product.getProductPrice());
        System.out.println("Prezzo ivato : " + product.ivaPrice());
        System.out.println("EAN code : " + Prodotto.extendedCode);

    }

}
