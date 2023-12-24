package com.company.render;

public class Plant {
    private String plantName;

    // Default constructor
    public Plant() {
    }

    // Parameterized constructor
    public Plant(String plantName) {
        this.plantName = plantName;
    }

    // Getter for plantName
    public String getPlantName() {
        return plantName;
    }

    // Setter for plantName
    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    // toString method to represent the object as a string
    @Override
    public String toString() {
        return "Plant{" +
                "plantName='" + plantName + '\'' +
                '}';
    }
}

