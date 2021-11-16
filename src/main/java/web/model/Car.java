package web.model;

public class Car {
    private String model;
    private Integer release;
    private Integer price;

    public Car() {
    }

    public Car(String model, Integer release, Integer price) {
        this.model = model;
        this.release = release;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRelease() {
        return release;
    }

    public void setRelease(Integer release) {
        this.release = release;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
