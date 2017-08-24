package com.example.aaron.w4d3_contentprovider.model.ContentProvider;

/**
 * Created by aaron on 8/23/17.
 */

public class SellItem {
    String itemName;
    String itemDescription;
    String itemManufacture;
    int itemRating;
    double itemCost;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemManufacture() {
        return itemManufacture;
    }

    public void setItemManufacture(String itemManufacture) {
        this.itemManufacture = itemManufacture;
    }

    public int getItemRating() {
        return itemRating;
    }

    public void setItemRating(int itemRating) {
        this.itemRating = itemRating;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public SellItem() {

    }

    public SellItem(String itemName, String itemDescription, String itemManufacture, int itemRating, double itemCost) {

        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemManufacture = itemManufacture;
        this.itemRating = itemRating;
        this.itemCost = itemCost;
    }
}
