package cam.taxiagency.domain;

public class Trip implements Entity{
    private String id;
    private String route;
    private Driver driver;
    private Car car;
    private Passenger passenger;
    private int durationMins;
    private int distance;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
