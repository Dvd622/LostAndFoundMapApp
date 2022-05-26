package com.example.lostandfound;

public class Item {
    int itemId;
    String name;
    String phone;
    String description;
    String date;
    String locationName;
    String locationLat;
    String locationLng;

    public Item(String name, String phone, String description, String date, String locationName, String locationLat, String locationLng) {
        this.name = name;
        this.phone = phone;
        this.description = description;
        this.date = date;
        this.locationName = locationName;
        this.locationLat = locationLat;
        this.locationLng = locationLng;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationLat() {
        return locationLat;
    }

    public void setLocationLat(String locationLat) { this.locationLat = locationLat; }

    public String getLocationLng() {
        return locationLng;
    }

    public void setLocationLng(String locationLng) { this.locationLng = locationLng; }
}
