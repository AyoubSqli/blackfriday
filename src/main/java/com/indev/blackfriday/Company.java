package com.indev.blackfriday;

import java.util.HashMap;

public class Company {
    private  int fixedQuantite =5 ;
    private  float margibenefits = 0.2F ;
    private float marginBenefitsBlackFriday = 0.1F ;
    private int fixedQuantiteBlackFriday=10 ;
    Product currentProduct ;
    HashMap<String,Product> products = new HashMap<String, Product>() ;
    public float sells(String intitule) {
        Product produit = Product.getProductByIntitule(intitule,products);
        float resultSells = (fixedQuantite*produit.getPrice())*(1+margibenefits);
        Product.setProductQuantiteSelles(fixedQuantite,produit) ;
        return resultSells;
    }

    public void stock(int quantiteInStock, String intitule, int price ) {
        currentProduct = new Product(quantiteInStock, intitule , price ) ;
        products.put(currentProduct.getIntitule(),currentProduct) ;
    }

    public int totalAssets() {
         int totalassets =0 ;

            for(Product prd:products.values())
            {
                totalassets += prd.getTotalPrice(margibenefits) ;
            }
        return totalassets;
    }

    public Company blackFriday() {
            this.margibenefits=marginBenefitsBlackFriday;
            this.fixedQuantite=fixedQuantiteBlackFriday;
        return this;

    }
}
