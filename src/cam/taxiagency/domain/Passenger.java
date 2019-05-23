package cam.taxiagency.domain;

public class Passenger implements Entity{
    private String id;
    private String name;
    private String mobilePhone;

    public Passenger(String name, String mobilePhone) {
        this.name = name;
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
