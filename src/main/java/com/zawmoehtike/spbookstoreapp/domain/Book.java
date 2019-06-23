package com.zawmoehtike.spbookstoreapp.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String surname;
    private String first_name;
    private String title;
    private Float price;
    private int onSale;
    private int calendar_year;
    private String description;
    private int inventory;

    public Book() {

    }

    public Book(String surname, String first_name, String title, Float price, int onSale, int calendar_year, String description, int inventory) {
        this.surname = surname;
        this.first_name = first_name;
        this.title = title;
        this.price = price;
        this.onSale = onSale;
        this.calendar_year = calendar_year;
        this.description = description;
        this.inventory = inventory;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getOnSale() {
        return onSale;
    }

    public void setOnSale(int onSale) {
        this.onSale = onSale;
    }

    public int getCalendar_year() {
        return calendar_year;
    }

    public void setCalendar_year(int calendar_year) {
        this.calendar_year = calendar_year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
