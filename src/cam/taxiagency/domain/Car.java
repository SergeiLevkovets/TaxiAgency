package cam.taxiagency.domain;

public class Car implements Entity{
    private String id;
    private Color color;
    private String number;

    public Car(Color color, String number) {
        this.color = color;
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
