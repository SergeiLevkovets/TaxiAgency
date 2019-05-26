package com.taxiagency.domain;

public class Car implements Entity {
    private String id;
    private Color color;
    private String number;

    public Car(String id, Color color, String number) {
        this.id = id;
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "id: " + id +
                "; color: " + color +
                "; number: " + number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
