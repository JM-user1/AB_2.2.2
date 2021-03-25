package web.model;

public class Car {

    private final String Owner;
    private final String Model;
    private final int Series;

    public Car(String owner, String model, int series) {
        Owner = owner;
        this.Model = model;
        Series = series;
    }

    public String getOwner() {
        return Owner;
    }

    public String getModel() {
        return Model;
    }

    public int getSeries() {
        return Series;
    }
}
