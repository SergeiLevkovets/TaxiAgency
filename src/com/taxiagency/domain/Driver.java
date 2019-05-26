package com.taxiagency.domain;

import java.io.Serializable;

public class Driver implements Entity, Serializable {

    private String id;
    private String name;

    public Driver(String id, String name) {
        this.id = id;
        this.name = name;
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
}
