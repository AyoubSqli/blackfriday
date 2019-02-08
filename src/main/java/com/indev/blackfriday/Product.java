package com.indev.blackfriday;

public class Product {
     private int price ;
     private String intitule ;
     private int quantite ;

    public Product(int price, String intitule, int quantite) {
        this.price = price;
        this.intitule = intitule;
        this.quantite = quantite;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public int getTotalPrice(){
        return this.price*this.quantite ;
    }
}
