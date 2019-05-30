package com.taxiagency.domain;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Entity, Serializable {
    private String id;
    private Color color;
    private String number;

    public Car(String id, Color color, String number) {
        this.id = id;
        this.color = color;
        this.number = number;
    }

    public Car(String str) {
        String[] splited = str.split(";");
        String idPart = splited[0];
        this.id = idPart.substring(idPart.indexOf(":")+1).trim();
        String colorPart = splited[1];
        this.color = Color.valueOf(colorPart.substring(colorPart.indexOf(":")+1).trim());
        String numberPart = splited[2];
        this.number = numberPart.substring(numberPart.indexOf(":")+1).trim();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) &&
                color == car.color &&
                Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color, number);
    }
}
