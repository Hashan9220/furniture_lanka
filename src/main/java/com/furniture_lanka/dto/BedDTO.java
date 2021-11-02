package com.furniture_lanka.dto;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)

 */
public class BedDTO {

    private String name;
    private String qty;
    private String price;
    private String description;
    private String image;

    public BedDTO() {
    }

    public BedDTO(String name, String qty, String price, String description) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.description = description;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "BedDTO{" +
                "name='" + name + '\'' +
                ", qty='" + qty + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                '}';
    }
}

