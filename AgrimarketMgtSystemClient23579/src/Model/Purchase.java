/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Admin
 */
public class Purchase implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer purchaseId;
    private Date purchaseDate;
    private Integer quantity;
    private User user;
    private Product product;

    public Purchase() {
    }

    public Purchase(Integer purchaseId, Date purchaseDate, Integer quantity, User user, Product product) {
        this.purchaseId = purchaseId;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.user = user;
        this.product = product;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Purchase ID: " + purchaseId + ", Purchase Date:" + purchaseDate + "Quatity: " + quantity + ", Product ID:" + product.getProductId() +"User Id: " + user.getUser_id() +"";
    }
}
