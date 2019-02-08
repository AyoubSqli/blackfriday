package com.indev.blackfriday;

import java.util.HashMap;
import java.util.Map;

public class Company {
    Product currentProduct ;
    Map<Integer,Product> products = new HashMap() ;
    public float sells(String capsule) {
        return 0;
    }

    public void stock(int price, String intitule, int quantite) {
        currentProduct = new Product(price, intitule , quantite) ;
        products.put(currentProduct.getPrice(),currentProduct) ;
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
