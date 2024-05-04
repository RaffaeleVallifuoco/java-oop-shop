package org.lessons.java.shop;

import java.util.Random;
import java.util.random.*;;

public class Prodotto {

    private int productCode;
    private String productName;
    private String productDescription;
    private double productPrice;
    private static final int IVA = 22;

    public int getProductCode() {
        return productCode;
    }

    public void setProductBame(String productBame) {
        this.productName = productBame;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductBame() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public static int getIva() {
        return IVA;
    }

    public Prodotto(String productName, String productDescription, Double productPrice) {

        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;

        Random code = new Random();

        this.productCode = code.nextInt(100);

    }

    public double ivaPrice() {

        return this.productPrice + (this.productPrice * IVA / 100);
    }

    public String extendedName() {

        return this.productCode + "-" + this.productName;
    }

}
