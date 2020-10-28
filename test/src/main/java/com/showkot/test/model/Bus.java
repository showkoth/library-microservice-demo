package com.showkot.test.model;

import org.springframework.stereotype.Component;

@Component // dependency injection, creates a singleton object at run time automatically
public class Bus {
    private int id;
    private String modelName;
    private String brandName;

    public Bus() {
    }

    public Bus(int id, String modelName, String brandName) {
        this.id = id;
        this.modelName = modelName;
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", brandName='" + brandName + '\'' +
                '}';
    }

    public void display(){
        System.out.println("This is in Bus Class");
    }
}
