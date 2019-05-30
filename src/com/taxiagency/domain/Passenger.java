package com.taxiagency.domain;

import java.io.Serializable;
import java.util.Objects;

public class Passenger implements Entity, Serializable {
    private String id;
    private String name;
    private String mobilePhone;

    public Passenger(String id, String name, String mobilePhone) {
        this.id = id;
        this.name = name;
        this.mobilePhone = mobilePhone;
    }

    public Passenger(String str) {
        String[] splited = str.split(";");
        String idPart = splited[0];
        this.id = idPart.substring(idPart.indexOf(":")+1).trim();
        String namePart = splited[1];
        this.name = namePart.substring(namePart.indexOf(":")+1).trim();
        String phonePart = splited[2];
        this.mobilePhone = phonePart.substring(phonePart.indexOf(":")+1).trim();
    }

    @Override
    public String toString() {
        return "id: " + id + "; name: " + name +
                "; mobilePhone: " + mobilePhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
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
        Passenger passenger = (Passenger) o;
        return Objects.equals(id, passenger.id) &&
                Objects.equals(name, passenger.name) &&
                Objects.equals(mobilePhone, passenger.mobilePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mobilePhone);
    }
}
