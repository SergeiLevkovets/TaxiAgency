package com.taxiagency.domain;

public class Passenger implements Entity{
    private String id;
    private String name;
    private String mobilePhone;

    public Passenger(String id, String name, String mobilePhone) {
        this.id = id;
        this.name = name;
        this.mobilePhone = mobilePhone;
    }

    @Override
    public String toString() {
        return "id: " + id + "; name: '" + name +
                "; mobilePhone: " + mobilePhone ;
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
}
