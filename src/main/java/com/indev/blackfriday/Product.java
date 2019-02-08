package com.indev.blackfriday;

import java.util.HashMap;

public class Product {
    private final int quantiteSelledInitial=0;
    private int price ;
     private String intitule ;
     private int quantiteInStock ;
     private int quantiteSelled ;

     public Product(){

     }
    public Product(int quantiteInStock, String intitule, int price) {
        this.price = price;
        this.intitule = intitule;
        this.quantiteInStock = quantiteInStock;
        this.quantiteSelled = quantiteSelledInitial ;
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

    public int getQuantiteInStock() {
        return quantiteInStock;
    }

    public void setQuantiteInStock(int quantiteInStock) {
        this.quantiteInStock = quantiteInStock;
    }

    public int getQuantiteSelled() {
        return quantiteSelled;
    }

    public void setQuantiteSelled(int quantiteSelled) {
        this.quantiteSelled = quantiteSelled;
    }

    public static void setProductQuantiteSelles(int fixedQuantite,Product product) {
         if(product.getQuantiteInStock() >= fixedQuantite)
         {
             product.setQuantiteInStock(product.getQuantiteInStock()-fixedQuantite);
             product.setQuantiteSelled(product.getQuantiteSelled()+fixedQuantite);
         }else
         {
                throw new RuntimeException() ;
         }
    }

    public float getTotalPrice(float marginBenefits){
        return this.price*(this.quantiteInStock + quantiteSelled*(1+marginBenefits)) ;
    }
    public static Product getProductByIntitule(String intitule , HashMap<String,Product> products)
    {
        for(Product prd:products.values())
        {
            if(prd.intitule.equals(intitule)) return prd ;
        }
        return new Product() ;
    }
}
