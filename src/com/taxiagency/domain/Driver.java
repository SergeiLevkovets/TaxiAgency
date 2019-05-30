package com.taxiagency.domain;

import java.io.Serializable;
import java.util.Objects;

public class Driver implements Entity, Serializable {

    private String id;
    private String name;

    public Driver(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Driver(String str) {
        String[] splited = str.split(";");
        String idPart = splited[0];
        this.id = idPart.substring(idPart.indexOf(":")+1).trim();
        String namePart = splited[1];
        this.name = namePart.substring(namePart.indexOf(":")+1).trim();
    }

    @Override
    public String toString() {
        return "id: " + id + "; name: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Driver driver = (Driver) o;
        return Objects.equals(id, driver.id) &&
                Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
