package com.furniture_lanka.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)

 */
@Entity
public class Bed {

    @Id
    private String name;
    private String qty;
    private String price;
    private String description;
    private String imageUrl;

    public Bed() {
    }

    public Bed(String name, String qty, String price, String description, String imageUrl) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String discription) {
        this.description = discription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
