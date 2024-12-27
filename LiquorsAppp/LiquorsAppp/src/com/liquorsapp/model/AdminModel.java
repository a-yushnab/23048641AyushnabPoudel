/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.liquorsapp.model;

/**
 *
 * @author ayushnabpoudel
 */
public class AdminModel {
    private int drinkID;
    private String drinkName;
    private int price;
    private String flavor;
    private int calorie;

    public AdminModel(int drinkID, String drinkName, int price, String flavor, int calorie) {
        this.drinkID = drinkID;
        this.drinkName = drinkName;
        this.price = price;
        this.flavor = flavor;
        this.calorie = calorie;
    }

    public int getDrinkID() {
        return drinkID;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public int getPrice() {
        return price;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setDrinkID(int drinkID) {
        this.drinkID = drinkID;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
    
 
    
    }
    

