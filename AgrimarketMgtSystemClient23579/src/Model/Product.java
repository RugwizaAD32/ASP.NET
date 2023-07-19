/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */

public class Product implements Serializable{
    private static final long serialVersionUID = 1L;
 
    private Integer productId;
    private String productName;
    private String productType;
    private Integer amount;
    private String supplier;

    public Product() {
    }

    public Product(Integer productId, String productName, String productType, Integer amount, String supplier) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.amount = amount;
        this.supplier = supplier;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    
}
