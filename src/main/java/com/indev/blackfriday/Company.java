package com.indev.blackfriday;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private final int fixedQuantite =5 ;private final float margebenefits = 0.2F ;
    Product currentProduct ;
    HashMap<String,Product> products = new HashMap<String, Product>() ;
    public float sells(String intitule) {
        Product produit = Product.getProductByIntitule(intitule,products);
        float resultSells = (fixedQuantite*produit.getPrice())*(1+margebenefits);
        Product.setProductQuantiteSelles(fixedQuantite,produit) ;
        return resultSells;
    }

    public void stock(int quantiteInStock, String intitule, int price ) {
        currentProduct = new Product(quantiteInStock, intitule , price ) ;
        products.put(currentProduct.getIntitule(),currentProduct) ;
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
         int totalassets =0 ;
            for(Product prd:products.values())
            {
                totalassets += prd.getTotalPrice() ;
            }
        return totalassets;
    }

    public Company blackFriday() {
        return this;
    }
}
