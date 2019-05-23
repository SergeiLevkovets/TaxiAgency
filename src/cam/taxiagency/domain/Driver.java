package cam.taxiagency.domain;

public class Driver implements Entity{

    private String id;
    private String name;

    public Driver(String name) {
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
