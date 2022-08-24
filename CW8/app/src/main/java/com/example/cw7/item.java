package com.example.cw7;

public class item {

//object
    private String ItemName;
    private double ItemPrice;
    private int ItemImage;

    public item(String itemName, double itemPrice, int itemImage) {
        ItemName = itemName;
        ItemPrice = itemPrice;
        ItemImage = itemImage;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(double itemPrice) {
        ItemPrice = itemPrice;
    }

    public int getItemImage() {
        return ItemImage;
    }

    public void setItemImage(int itemImage) {
        ItemImage = itemImage;
    }
}
